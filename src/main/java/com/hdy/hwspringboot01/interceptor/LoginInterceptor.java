package com.hdy.hwspringboot01.interceptor;

import com.hdy.hwspringboot01.model.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author m760384371
 * @date 2019/9/19
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {


        HttpSession session = request.getSession();
        String contextPath = session.getServletContext().getContextPath();
        String[] requirePages = new String[]{"index"};

        String uri = StringUtils.remove(request.getRequestURI(), contextPath + "/");

        if (begingWith(uri, requirePages)) {
            User user = (User) session.getAttribute("user");
            if(user==null) {
                response.sendRedirect("login");
                return false;
            }
        }
        return true;
    }

    private boolean begingWith(String page, String[] requiredPages) {
        boolean result = false;
        for (String requiredPage : requiredPages) {
            if(StringUtils.startsWith(page, requiredPage)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
