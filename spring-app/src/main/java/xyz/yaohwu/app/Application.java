package xyz.yaohwu.app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;
import xyz.yaohwu.base.lib.BaseLib;

/**
 * @author yaohwu
 * created by yaohwu at 2021/12/24 20:33
 */
@SpringBootApplication(scanBasePackages = "xyz.yaohwu.app")
public class Application {


    public static void main(String[] args) {

        BaseLib baseLib = new BaseLib();
        baseLib.sayHello();

        ApplicationContext run = SpringApplication.run(Application.class, args);
        ApplicationSpringContext.setApplicationContext(run);
    }

    @Bean
    @Qualifier(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_BEAN_NAME)
    public DispatcherServlet dispatcherServlet() {
        return new ControllerDispatcher();
    }

    @Bean
    public ApplicationShutdown customShutdown() {
        return new ApplicationShutdown();
    }

    @Bean
    public ConfigurableServletWebServerFactory webServerFactory(final ApplicationShutdown customShutdown) {
        TomcatServletWebServerFactory tomcatServletWebServerFactory = new TomcatServletWebServerFactory();
        tomcatServletWebServerFactory.addConnectorCustomizers(customShutdown);
        return tomcatServletWebServerFactory;
    }


}
