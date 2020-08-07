package net.kanozo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class AuthInterceptor implements HandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		if(session != null) {
			Object user = session.getAttribute("user");
			if(user != null) {
				return true;
			}
			session.setAttribute("msg", "권한이 없습니다 로그인해주세요");
		}
		
		response.sendRedirect("/user/login");
		return false;
	}
}
