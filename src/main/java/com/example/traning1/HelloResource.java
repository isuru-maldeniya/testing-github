package com.example.traning1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.io.IOException;

@Path("/hello-world")
//@WebServlet(name = "helloServerlet",value = "/hello-world")
public class HelloResource extends HttpServlet {
    @GET
    @Path("/not-do")
//    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getOutputStream().println("Isuru Maldeniya");
    }
}