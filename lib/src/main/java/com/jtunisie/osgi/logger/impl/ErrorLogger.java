package com.jtunisie.osgi.logger.impl;


/**
 *
 * @author slim ouertani
 */
class ErrorLogger implements com.jtunisie.osgi.logger.Logger {

    private final  String bundleName;

   

    public ErrorLogger(String bundleName) {
        this.bundleName = bundleName;
    }

    

    @Override
    public void log(Class clazz, Level level, String msg, Object... params) {
        if (level.compareTo(Level.ERROR) == 0) {
            msg = LoggerUtils.processMsg(params, msg);
            System.err.println(buildMsg(level, clazz, msg));
        }
       
    }

   private String buildMsg(Level level, Class clazz, String msg) {
        return "[" + level.name() + "] [ bundle : " + bundleName + " ] [" + clazz.getName() + "] " + msg;
    }
}
