package com.maxhetman;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthServlet extends HttpServlet {
    private final String rightName = "admin";
    private final String rightPass = "qwerty";

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");
        String pass = request.getParameter("userpass");

        if(isRegistered(name, pass)){
            out.print("Hello, " + name);
        }
        else{
            out.print("Sorry username or password error");
            RequestDispatcher rd=request.getRequestDispatcher("index.html");
            rd.include(request,response);
        }
        out.close();
    }

    private Boolean isRegistered(String name, String pass)
    {
        return rightName.equals(name) && rightPass.equals(pass);
    }

}  