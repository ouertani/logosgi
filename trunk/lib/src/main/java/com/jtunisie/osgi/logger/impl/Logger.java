package com.jtunisie.osgi.logger.impl;


import java.util.Dictionary;
import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceFactory;
import org.osgi.framework.ServiceRegistration;
import org.osgi.framework.Version;
import static org.osgi.framework.Constants.*;

/**
 *
 * @author Slim OUERTANI
 */
public  class Logger implements com.jtunisie.osgi.logger.Logger, ServiceFactory {
  

    @Override
    public void log(Class clazz, Level level, String msg, Object... params) {
    }

    @Override
    public Object getService(Bundle bundle, ServiceRegistration arg1) {
        Dictionary dictionary = bundle.getHeaders();
        Version version = Version.parseVersion((String) dictionary.get(BUNDLE_VERSION));
        String name = (String) dictionary.get(BUNDLE_NAME);
        return LoggerFactory.getLogger(name, version);
    }

    @Override
    public void ungetService(Bundle arg0, ServiceRegistration arg1, Object arg2) {
    }
}


