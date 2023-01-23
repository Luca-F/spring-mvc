package fr.formation.inti;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc //indique qu'il faut se rendre dans le dispatcher
@Configuration
@ComponentScan(basePackages = { "fr.formation.inti.*" })
public class WebConfig implements WebMvcConfigurer {

   public void addViewControllers(ViewControllerRegistry registry) {
      registry.addViewController("/").setViewName("index");
   }

   @Bean
   public ViewResolver viewResolver() {
      InternalResourceViewResolver bean = new InternalResourceViewResolver();

      bean.setViewClass(JstlView.class);
      bean.setPrefix("/WEB-INF/view/");
      bean.setSuffix(".jsp");

      return bean;
   }
   
   
   @Bean(name="messageSource")
   public MessageSource getMessageResource() {
	   ReloadableResourceBundleMessageSource messageResource = new ReloadableResourceBundleMessageSource();
	   messageResource.setBasename("classpath:message");
	   messageResource.setDefaultEncoding("UTF-8");
	   
	   return messageResource;
   }
   
   
}