package com.bonc.GESysServer.utils.view;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.web.servlet.ModelAndView;

/**
 * springMvc 返回json视图
 * @author xz
 * 
 * */
public class JsonView {
	
	/**
	 * 返回json的spring视图
	 * */
	public static ModelAndView Render(Object model, HttpServletResponse response){  
	        MappingJacksonHttpMessageConverter jsonConverter = new MappingJacksonHttpMessageConverter();  
	        MediaType jsonMimeType = MediaType.APPLICATION_JSON;  
	        try {  
	            jsonConverter.write(model, jsonMimeType, new ServletServerHttpResponse(response));  
	        } catch (HttpMessageNotWritableException e) {  
	            e.printStackTrace();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	        return null;  
	    }  
}
