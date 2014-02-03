package com.ippon.formation.gwt.server.servlet;

import java.io.PrintWriter;
import java.io.StringWriter;

import com.google.web.bindery.requestfactory.server.ExceptionHandler;
import com.google.web.bindery.requestfactory.shared.ServerFailure;

public class SpringSecurityRequestFactoryExceptionHandler implements ExceptionHandler {

    /**
     * @see com.google.web.bindery.requestfactory.server.ExceptionHandler#createServerFailure(java.lang.Throwable)
     */
    @Override
    public ServerFailure createServerFailure(Throwable throwable) {
        ServerFailure failure = null;
        if (throwable == null) {
            failure = new ServerFailure("Server Error", null, null, true);
        }
        else {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            throwable.printStackTrace(pw);
            failure = new ServerFailure("Server Error: " + throwable.getMessage(), throwable.getClass().getName(),
                    sw.toString(), true);
            pw.close();
        }
        return failure;
    }

}
