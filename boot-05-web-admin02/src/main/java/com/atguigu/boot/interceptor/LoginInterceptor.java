package com.atguigu.boot.interceptor;


import com.atguigu.boot.bean.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @projectName: boot-05-web-admin
 * @package: com.example.admin.interceptor
 * @className: LoginInterceptor
 * @author: SingKwan
 * @description: TODO 登录检查的拦截器
 * @date: 2023/4/17 21:42
 * @version: 1.0
 */

@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    /**
     * @param request:
     * @param response:
     * @param handler:
     * @return boolean
     * @author perse
     * @description TODO 目标方法执行之前的进行登录检查
     * @date 2023/4/17 21:43
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登录检查逻辑
        String requestURI=request.getRequestURI();
        log.info("preHander拦截的请求路径是{}",requestURI);
        HttpSession session=request.getSession();

        //从session获取用户信息，如果不为空，放行，否则进行拦截。
        User user = (User) session.getAttribute("loginUser");
        if(user!=null){
            return true;
        }
        //拦截住。未登录。可以进行弹窗提示 跳转到登录页
        request.setAttribute("msg","请先登录");
        request.getRequestDispatcher("/").forward(request,response);
        return false;
    }

    /**
     * @param request:
     * @param response:
     * @param handler:
     * @param modelAndView:
     * @return void
     * @author perse
     * @description TODO 目标方法执行之后的拦截器
     * @date 2023/4/17 21:44
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("postHandle执行{}",modelAndView);
    }

    /**
     * @param request:
     * @param response:
     * @param handler:
     * @param ex:
     * @return void
     * @author perse
     * @description TODO 页面完成之后的拦截器
     * @date 2023/4/17 21:44
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("afterCompletion执行异常{}",ex);
    }
}
