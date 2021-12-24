package xyz.yaohwu.app;


import org.springframework.context.ApplicationContext;

/**
 * @author yaohwu
 * created by yaohwu at 2021/12/24 20:33
 */
public class ApplicationSpringContext {

    private static ApplicationContext applicationContext = null;

    public static void setApplicationContext(ApplicationContext applicationContext) {
        if (ApplicationSpringContext.applicationContext == null) {
            ApplicationSpringContext.applicationContext = applicationContext;
        }
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}