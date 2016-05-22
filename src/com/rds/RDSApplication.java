package com.rds;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.rds.services.CusipsService;
import com.rds.services.SecuritiesService;
import com.rds.services.VisService;

@ApplicationPath("/rest")
public class RDSApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<>();
        // register root resource
        classes.add(CusipsService.class);
        classes.add(SecuritiesService.class);
        classes.add(VisService.class);
        return classes;
    }
}