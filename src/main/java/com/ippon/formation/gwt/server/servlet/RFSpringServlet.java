package com.ippon.formation.gwt.server.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.web.bindery.requestfactory.server.ExceptionHandler;
import com.google.web.bindery.requestfactory.server.RequestFactoryServlet;
import com.google.web.bindery.requestfactory.server.ServiceLayerDecorator;

public class RFSpringServlet extends RequestFactoryServlet {

    /**
     * 
     */
    private static final long serialVersionUID = -9142772473004371013L;

    public RFSpringServlet() {
        this(new SpringSecurityRequestFactoryExceptionHandler(), new SpringServiceLayerDecorator());
    }

    public RFSpringServlet(ExceptionHandler exceptionHandler, ServiceLayerDecorator... serviceDecorators) {
        super(exceptionHandler, serviceDecorators);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,
            ServletException {
        super.doPost(request, response);
    }

}
