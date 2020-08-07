package net.kanozo.interceptor;	

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class NonAuthInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		if(session != null) {
			Object user = session.getAttribute("user");
			if(user != null) {
				session.setAttribute("msg", "로그인 한 유저는 접근이 불가능합니다.");
				response.sendRedirect("/");
				return false;
			}
		}
		return true;
	}
}
