package com.whoochamjal.whoochamjal;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebFilter("/Whoochamjal/*")
public class PasswordEncryptFilter implements Filter {
    public PasswordEncryptFilter() {  //암호화
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest hrequest = (HttpServletRequest)  request;
        RequestWrapper wrapper = new RequestWrapper(hrequest);

        chain.doFilter(wrapper,response);
    }
}   /*해당 코드는 Java로 작성된 서블릿 필터(Filter)인 PasswordEncryptFilter 클래스입니다.
    이 필터는 "/member/*" 경로에 대한 요청을 가로채어 비밀번호를 암호화하는 역할을 수행합니다.
    클래스의 주요 부분은 doFilter 메서드입니다. 이 메서드는 필터가 요청을 처리할 때 호출되며,
    요청(request)과 응답(response) 객체를 매개변수로 받습니다. 먼저, 주어진 요청(request) 객체를
    HttpServletRequest 타입으로 형변환합니다. 그리고 형변환된 객체를 이용하여 RequestWrapper 객체를 생성합니다.
    RequestWrapper 클래스는 이전에 설명한 것과 동일한 기능을 수행하며, 비밀번호 암호화를 위해 사용됩니다.
    마지막으로, 체인(chain) 객체의 doFilter 메서드를 호출하여 다음 필터 또는 서블릿으로 요청을 전달합니다.
    이때, 암호화된 비밀번호를 포함한 RequestWrapper 객체가 전달됩니다.
    PasswordEncryptFilter 클래스는 @WebFilter 어노테이션을 통해 "/member/*" 경로에 대한 필터로 등록되어 있습니다.
    이 필터는 해당 경로로 들어오는 모든 요청에 대해 비밀번호 암호화를 수행하게 됩니다.*/