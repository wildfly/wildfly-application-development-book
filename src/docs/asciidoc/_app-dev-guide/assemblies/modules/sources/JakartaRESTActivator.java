package org.jboss.as.quickstarts.rshelloworld;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

/**
 * JakartaRESTActivator is an arbitrary name, what is important is that jakarta.ws.rs.core.Application is extended
 * and the @ApplicationPath annotation is used with a "rest" path.  Without this the rest routes linked to
 * from index.html would not be found.
 */
@ApplicationPath("rest")                                 //<1>
public class JakartaRESTActivator extends Application {
    // Left empty intentionally
}