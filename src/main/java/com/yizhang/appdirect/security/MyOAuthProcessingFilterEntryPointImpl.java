package com.yizhang.appdirect.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth.provider.OAuthProcessingFilterEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class MyOAuthProcessingFilterEntryPointImpl extends OAuthProcessingFilterEntryPoint {

    final static Logger log = LoggerFactory.getLogger(MyOAuthProcessingFilterEntryPointImpl.class);

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        log.info("OAuth FILTER Failure, req=" + request + ", ex=" + authException);
        super.commence(request, response, authException);
    }
}
