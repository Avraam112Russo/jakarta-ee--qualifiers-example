package com.example.demo11;

import com.example.demo11.qualifier.LaptopQualifier;
import com.example.demo11.qualifier.MobileQualifier;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet(name = "servl", value = "/servl")
public class MyServlet extends HttpServlet {
    @MobileQualifier
    @Inject
    private Product product;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){

        System.out.println(product.getName());
    }
}
