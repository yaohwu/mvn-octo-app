package xyz.yaohwu.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import xyz.yaohwu.app.interceptor.InterceptorAdapter;

@Configuration
public class ApplicationConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new InterceptorAdapter())
                .addPathPatterns("/**");
    }
}