package com.jtunisie.osgi.logger.impl;

import org.osgi.framework.Version;

/**
 *
 * @author slim ouertani
 */
class LoggerFactory {

    static com.jtunisie.osgi.logger.Logger getLogger(String name, Version version) {

        if (version.toString().contains("m")) {
            return new DebugLogger(name);
        } else {
            return new ErrorLogger(name);
        }
    }
}
