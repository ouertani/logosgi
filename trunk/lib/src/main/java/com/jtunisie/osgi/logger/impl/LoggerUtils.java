/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jtunisie.osgi.logger.impl;

/**
 *
 * @author slim
 */
public class LoggerUtils {

//    private static int getLineNumber(Thread thread) {
//        return thread.currentThread().getStackTrace()[2].getLineNumber();
//    }
//
//    private static String getMethodName(Thread thread) {
//        return thread.currentThread().getStackTrace()[2].getMethodName();
//    }
//
//    private static String getClassName(Thread thread) {
//        return thread.currentThread().getStackTrace()[2].getClassName();
//    }

//    public static String getMessage() {
//        StringBuilder msg=new StringBuilder(new Date().toString());
//        msg.append(" : ").append(getClassName()).append(" : ").append(getMethodName()).append(" : ").append(getLineNumber());
//        return msg.toString();
//    }
    public static String processMsg(Object[] params, String msg) {

        for (Object object : params) {
            msg = msg.replaceFirst("##", object.toString());
        }
        return msg;
    }
}
