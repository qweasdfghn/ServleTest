package com.whoochamjal.whoochamjal;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class RequestWrapper extends HttpServletRequestWrapper {
    public RequestWrapper(HttpServletRequest request) {
        super(request);
    }
    @Override
    public String getParameter(String name) {
        String value = "";
        if ("password".equals(name)) {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            value = passwordEncoder.encode(super.getParameter(name));

        }else {
            value = super.getParameter(name);

        }


        return value;
    }



    /*해당 코드는 Java로 작성된 서블릿 HttpServletRequestWrapper를 확장한 RequestWrapper 클래스입니다.
    이 클래스는 HttpServletRequest의 기능을 확장하여 HTTP 요청 파라미터를 처리합니다.
    클래스의 주요 부분은 getParameter 메서드입니다. 이 메서드는 주어진 이름(name)에 해당하는 HTTP 요청
    파라미터의 값을 반환합니다. 그러나, 만약 이름이 "password"인 경우, 비밀번호를 암호화한 후 반환합니다.
    암호화에는 BCryptPasswordEncoder 클래스를 사용합니다. BCryptPasswordEncoder는 스프링 시큐리티(Spring Security)
    라이브러리에서 제공하는 비밀번호 암호화기입니다. BCryptPasswordEncoder의 encode 메서드를 사용하여 주어진 비밀번호를
    암호화하고, 암호화된 값을 반환합니다. 따라서, RequestWrapper 클래스의 목적은 HTTP 요청 파라미터 중 비밀번호를
    암호화하여 처리하는 것입니다. 이는 보안 상의 이유로 사용될 수 있습니다.*/

}
