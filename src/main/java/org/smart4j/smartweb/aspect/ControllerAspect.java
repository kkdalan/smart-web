package org.smart4j.smartweb.aspect;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.framework.annotation.Aspect;
import org.smart4j.framework.annotation.Controller;
import org.smart4j.framework.proxy.AspectProxy;

@Aspect(Controller.class)
public class ControllerAspect extends AspectProxy {

	private static final Logger LOGGER = LoggerFactory.getLogger(ControllerAspect.class);

	private long beginTime;

	@Override
	public void before(Class<?> cls, Method method, Object[] params) throws Throwable {
		LOGGER.debug("------------------ BEGIN ----------------------");
		LOGGER.debug(String.format("Class: %s", cls.getName()));
		LOGGER.debug(String.format("Method: %s", method.getName()));
		beginTime = System.currentTimeMillis();
	}

	@Override
	public void after(Class<?> cls, Method method, Object[] params) throws Throwable {
		LOGGER.debug(String.format("time: %dms", System.currentTimeMillis() - beginTime));
		LOGGER.debug("------------------ END ----------------------");
	}

}
