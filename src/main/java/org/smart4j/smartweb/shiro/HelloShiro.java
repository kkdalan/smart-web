package org.smart4j.smartweb.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloShiro {

	private static final Logger LOGGER = LoggerFactory.getLogger(HelloShiro.class);

	public static void main(String[] args) {
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
		SecurityManager securityManager = factory.getInstance();
		SecurityUtils.setSecurityManager(securityManager);

		Subject subject = SecurityUtils.getSubject();

		UsernamePasswordToken token = new UsernamePasswordToken("shiro", "201314");
		try {
			subject.login(token);
		} catch (AuthenticationException ae) {
			LOGGER.info("login failure!");
			return;
		}
		LOGGER.info("login success! Hello " + subject.getPrincipal());
		
		subject.logout();

	}
}
