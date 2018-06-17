package org.smart4j.smartweb.thread;

import org.smart4j.smartweb.service.ProductService;

public class ProductClientThread extends Thread {

	private ProductService productService = null;

	public ProductClientThread(ProductService productService) {
		this.productService = productService;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		productService.updateProductPrice(1, 5000);
	}
}
