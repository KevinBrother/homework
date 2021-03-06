package com.my.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter{
	
	private String encoding;             // 设置字符编码
	 
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		 this.encoding = filterConfig.getInitParameter("encoding"); // 取得初始化参数
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		request.setCharacterEncoding(this.encoding);   // 设置统一编码
		
		response. setCharacterEncoding(this.encoding);
		response.setContentType("text/html;charset=" + this.encoding);
		
		chain.doFilter(request, response);  
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
