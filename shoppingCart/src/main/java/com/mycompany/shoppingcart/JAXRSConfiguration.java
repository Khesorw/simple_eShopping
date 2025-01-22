package com.mycompany.shoppingcart;

import com.mycompany.shoppingcart.resources.JavaEE8Resource;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Configures JAX-RS for the application.
 * @author Juneau
 */
@ApplicationPath("shopping")
public class JAXRSConfiguration extends Application {
    
        @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        // Register resources
        resources.add(JavaEE8Resource.class);
        // Register filters
        resources.add(CorsFilter.class);
        return resources;
    }
    
}
