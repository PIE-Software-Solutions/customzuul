package com.ppp.asa.asasas;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.piesoftsol.oneservice.zuulservice.annotation.EnableCustomAuthTokenSecurity;
import com.piesoftsol.oneservice.zuulservice.annotation.EnableJdbc;
import com.piesoftsol.oneservice.zuulservice.annotation.IgnoreSecurity;
import com.piesoftsol.oneservice.zuulservice.annotation.OneServiceInjector;
import com.piesoftsol.oneservice.zuulservice.config.CustomAuthTokenHeaderFilter;
import com.piesoftsol.oneservice.zuulservice.config.OSFHandlerInterceptor;
import com.piesoftsol.oneservice.zuulservice.config.OneServiceInit;


/**
 * Hello world!
 *
 */
@OneServiceInjector
//@EnableCustomAuthTokenSecurity
@EnableCustomAuthTokenSecurity
@EnableJdbc
public class App extends SpringBootServletInitializer
{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(App.class);
	}
	
    public static void main(String[] args) {
		try {
			OneServiceInit.initializeObject(App.class, null, null, new C1ValidateHeader(), args);
			//OneServiceInit.initializeObject(App.class, null, new CustomAuthTokenHeaderFilter(new Object[] {"ASDF","DataSource"}), null, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
