package com.scrum.Library.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

//全局异常处理
public class HandleException  implements  HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse reponse, Object object,
			Exception ex) {
		// TODO Auto-generated method stub
		
		ModelAndView mv=new ModelAndView();
		if(ex instanceof UnauthorizedException)
		{
			mv.addObject("message", "对不起你没有该权限，请勿操作");
		}
		else
		{
		mv.addObject("message", ex.getMessage());
		}
		mv.setViewName("error");
		return mv;
	}

}
