package com.yizhang.appdirect;

import com.yizhang.appdirect.security.MyOAuthNonceServices;
import com.yizhang.appdirect.security.OAuthConsumerDetailsService;
import com.yizhang.appdirect.security.TwoLeggedOAuthProviderProcessingFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth.provider.OAuthProcessingFilterEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.annotation.PostConstruct;

@ComponentScan
@SpringBootApplication
@EnableAutoConfiguration
@EnableWebMvcSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    // Perform oauth verification on inbound requests from appdirect
    @Configuration
    @Order(1)
    public static class OAuthSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
        private TwoLeggedOAuthProviderProcessingFilter twoLeggedOAuthProviderProcessingFilter;

        @Autowired
        OAuthConsumerDetailsService oauthConsumerDetailsService;

        @Autowired
        MyOAuthNonceServices oauthNonceServices;

        @Autowired
        OAuthProcessingFilterEntryPoint oauthProcessingFilterEntryPoint;

        @PostConstruct
        public void init() {
            twoLeggedOAuthProviderProcessingFilter =
                    new TwoLeggedOAuthProviderProcessingFilter(
                            oauthConsumerDetailsService,
                            oauthNonceServices,
                            oauthProcessingFilterEntryPoint);
        }

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.antMatcher("/**")
                    .addFilterBefore(twoLeggedOAuthProviderProcessingFilter, UsernamePasswordAuthenticationFilter.class)
                    .authorizeRequests().anyRequest().hasRole("OAUTH");
        }
    }
}
