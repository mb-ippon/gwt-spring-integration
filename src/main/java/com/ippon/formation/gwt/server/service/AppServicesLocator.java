package com.ippon.formation.gwt.server.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

import com.google.web.bindery.requestfactory.shared.ServiceLocator;

@Controller
public class AppServicesLocator implements ServiceLocator, ApplicationContextAware {

    private ApplicationContext appContext;

    @Override
    public Object getInstance(Class<?> clazz) {
        return appContext.getBean(clazz);
    }

    @Override
    public void setApplicationContext(ApplicationContext appContext) throws BeansException {
        this.appContext = appContext;
    }

}
