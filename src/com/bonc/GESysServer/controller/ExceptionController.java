package com.bonc.GESysServer.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ExceptionController  {
	
	private static Logger LOG=Logger.getLogger(ExceptionController.class);

	@RequestMapping(value="error/404")
	public String _404(HttpServletRequest request,HttpServletResponse response,Model model) {
		
		LOG.error("出错了");

		String uri = (String)request.getAttribute("javax.servlet.error.request_uri");
		model.addAttribute("requestUrl", uri);
		model.addAttribute("errorCode","404");
//		ModelAndView modelAndView = new ModelAndView();
		return "error/exception";
	}
	
	@RequestMapping(value="error/500")
	public String _500(HttpServletRequest request,HttpServletResponse response,Model model) {
		//Object code = request.getAttribute("javax.servlet.error.status_code");
//		try {
//			request.setCharacterEncoding("gbk");
//			response.setContentType("text/html;charset=gbk");
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//		try {
//			Exception e = (Exception)request.getAttribute("javax.servlet.error.exception");
//			e.printStackTrace(new PrintStream(response.getOutputStream()));
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
		String uri = (String)request.getAttribute("javax.servlet.error.request_uri");
		model.addAttribute("requestUrl", uri);
		model.addAttribute("errorCode","500");
		return "error/exception";
	}
	
	@RequestMapping(value="error/405")
	public String _405(HttpServletRequest request,HttpServletResponse response,Model model) {
		//Object code = request.getAttribute("javax.servlet.error.status_code");
//		try {
//			request.setCharacterEncoding("gbk");
//			response.setContentType("text/html;charset=gbk");
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//		try {
//			Exception e = (Exception)request.getAttribute("javax.servlet.error.exception");
//			e.printStackTrace(new PrintStream(response.getOutputStream()));
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
		String uri = (String)request.getAttribute("javax.servlet.error.request_uri");
		model.addAttribute("requestUrl", uri);
		model.addAttribute("errorCode","405");
		return "error/exception";
	}
}
