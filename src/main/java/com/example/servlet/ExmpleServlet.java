package com.example.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.FrameworkServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExmpleServlet extends FrameworkServlet {
    Logger logger = LoggerFactory.getLogger(ExmpleServlet.class);
    @Override
    protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("doService method");
        try{
            response.getWriter().write("hello graalvm");
            response.getWriter().flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
