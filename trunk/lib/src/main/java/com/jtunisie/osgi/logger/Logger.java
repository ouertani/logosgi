package com.jtunisie.osgi.logger;

/**
 *
 * @author Slim OUERTANI
 */
public interface Logger {

    public void log(Class clazz, Level level, String msg, Object... params);

    public enum Level {

        DEBUG, ERROR
    }
}


