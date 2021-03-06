package com.learn.config;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//       registry.addInterceptor(new LoginHandlerInterceptor()).
//               addPathPatterns("/**").
//               excludePathPatterns("/login","/","/css/*","/js/*","/img/*","/webfonts/*");
//        }
//
//    //添加控制器
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/").setViewName("pages/index");
        registry.addViewController("/toLogin").setViewName("pages/login");
    }

}
