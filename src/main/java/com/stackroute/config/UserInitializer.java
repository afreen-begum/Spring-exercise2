package com.stackroute.config;
import com.stackroute.config.UserConfig;
import com.stackroute.controller.UserController;
import org.springframework.web.servlet.support.*;

public class UserInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        {return new Class[]{UserConfig.class};}
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
