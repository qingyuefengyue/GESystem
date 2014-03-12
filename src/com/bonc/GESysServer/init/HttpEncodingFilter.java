package com.bonc.GESysServer.init;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HttpEncodingFilter implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		HttpServletRequest req = (HttpServletRequest) request;
		
		if (req.getSession().getAttribute("rootPath") == null) {
			req.getSession().setAttribute("rootPath", req.getContextPath());
			String rootPath = "rootPath ------------"+req.getContextPath();
			System.out.println(rootPath);
			req.getSession().setAttribute("contextPath", req.getContextPath());
		}
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig fileConfig) throws ServletException {
		
	}

}
