package com.whoochamjal.whoochamjal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Menu2")

public class Menu extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        /* 종류 */
        String chickenkind = req.getParameter("chickenkind");

        /* 토핑 추가는 중복 선택이 가능하기에 배열로 값을 받는다.
         * 배열로 값을 받을 때는 getParameterValues() 메서드를 사용한다. */
        String[] toppings = req.getParameterValues("topping");


        /*리뷰 이벤트*/
        String reviewkind = req.getParameter("reviewkind");

        //콘솔 창 출력
        System.out.println("종류 선택 : " + chickenkind);

        System.out.print("토핑 선택 : ");

        System.out.println("리뷰 이벤트 선택 : " + reviewkind);



            resp.setContentType("text/html; charset=UTF-8");
            PrintWriter pr = resp.getWriter();
            pr.print("<h1> 주문이 완료 되었습니다!! 감사합니다!! </h1>");
        }
    }

