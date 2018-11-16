package com.shareniu.flowable.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.shareniu.flowable.util.Parametermap;

public class BaseController {
	public Parametermap getParametermap() {
		Parametermap parametermap=new Parametermap(getRequest());
		//
		parametermap.put("shareniu", "分享牛");
		return parametermap;

	}

	public HttpSession getSession() {
		HttpSession session = this.getRequest().getSession();
		return session;
	}

	/**
	 * 获取HttpServletRequest
	 * @return
	 */
	public HttpServletRequest getRequest() {
		ServletRequestAttributes servletRequestAttributes= (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = servletRequestAttributes.getRequest();
		return request;

	}

}
