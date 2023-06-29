package com.whoochamjal.whoochamjal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Whoochamjal")
public class Order extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String name = req.getParameter("name");
        System.out.println(name);
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("<h1> " + name + "님 반갑습니다." + "</h1>");

        String password = req.getParameter("password");
        System.out.println(password);


        String phoneNumber = req.getParameter("phoneNumber");
        System.out.println(phoneNumber);
        out.print("<h1> " + "010-****-****" + "</h1>");


        String address = req.getParameter("address");
        System.out.println(address);

        out.print("<h1> " + "작성해주신 번호는 암호화 처리 됩니다." + "</h1>");


        out.print("<a href=2MenuList>주문하러가기</a>");

        out.flush();
        out.close();


    }




}

