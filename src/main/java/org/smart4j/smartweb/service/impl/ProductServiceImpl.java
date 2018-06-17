package org.smart4j.smartweb.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.smartweb.service.ProductService;
import org.smart4j.smartweb.thread.ProductClientThread;
import org.smart4j.smartweb.util.DBUtil;

public class ProductServiceImpl implements ProductService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

	private static final String UPDATE_PRODUCT_SQL = "update product set price = ? where id = ?";
	private static final String INSERT_LOG_SQL = "insert into log (created, description) values(?,?)";

	public static void main(String[] args) {
		
		// ProductService productService = new ProductServiceImpl();
		// productService.updateProductPrice(1, 3000);

		for (int i = 0; i < 10; i++) {
			ProductService productService = new ProductServiceImpl();
			ProductClientThread thread = new ProductClientThread(productService);
			thread.start();
		}
	}

	@Override
	public void updateProductPrice(long productId, int price) {
		Connection conn = DBUtil.getCOnnection();
		try {
			conn.setAutoCommit(false);
			updateProduct(conn, price, productId);
			insertLog(conn, "Create product.");
			conn.commit();
		} catch (Exception e) {
			LOGGER.error("update product price failure", e);
			throw new RuntimeException(e);
		} finally {
			DBUtil.closeConnection();
		}

	}

	private void updateProduct(Connection conn, int price, long productId) throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement(UPDATE_PRODUCT_SQL);
		pstmt.setInt(1, price);
		pstmt.setLong(2, productId);
		int rows = pstmt.executeUpdate();
		if (rows != 0) {
			LOGGER.info("Update product price success!");
		}
	}

	private void insertLog(Connection conn, String logDescription) throws SQLException {
		PreparedStatement pstmt = conn.prepareStatement(INSERT_LOG_SQL);
		pstmt.setString(1, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
		pstmt.setString(2, logDescription);
		int rows = pstmt.executeUpdate();
		if (rows != 0) {
			LOGGER.info("Insert log success!");
		}
	}

}
