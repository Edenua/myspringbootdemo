package com.wuan.myspringbootdemo;


//import com.wuan.myspringbootdemo.filter.MyFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MyspringbootdemoApplication  {

    public static void main(String[] args) {
        SpringApplication.run(MyspringbootdemoApplication.class, args);
    }


}
