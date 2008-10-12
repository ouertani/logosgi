package com.jtunisie.osgi.logger.client;
import static com.jtunisie.osgi.logger.Logger.Level.*;
import com.jtunisie.osgi.logger.*;
import org.springframework.osgi.extensions.annotation.ServiceReference;


/**
 *
 * @author Slim OUERTANI
 */
public class Activator {

    private Logger logger;

    public void init() {
        logger.log(Activator.class, DEBUG, "Id : ##  , version : ## ", 2, 2);
        logger.log(Activator.class, ERROR, "Id : ##  , version : ## ", 2, 2);
    }

    @ServiceReference
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
