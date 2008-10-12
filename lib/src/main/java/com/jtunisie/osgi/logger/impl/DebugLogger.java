package com.jtunisie.osgi.logger.impl;



/**
 *
 * @author slim ouertani
 */
class DebugLogger implements com.jtunisie.osgi.logger.Logger {

    private final String bundleName;

    public DebugLogger(String bundleName) {
        this.bundleName = bundleName;
    }

    @Override
    public void log(Class clazz, Level level, String msg, Object... params) {
        msg = LoggerUtils.processMsg(params, msg);
        System.out.println(buildMsg(level, clazz, msg));
    }
     private String buildMsg(Level level, Class clazz, String msg) {
        return "[" + level.name() + "] [ bundle : " + bundleName + " ] [" + clazz.getName() + "] " + msg;
    }
}
