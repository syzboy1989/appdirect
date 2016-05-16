package com.yizhang.appdirect.security;

import org.springframework.security.oauth.provider.OAuthProcessingFilterEntryPoint;
import org.springframework.security.oauth.provider.filter.ProtectedResourceProcessingFilter;

public class TwoLeggedOAuthProviderProcessingFilter extends ProtectedResourceProcessingFilter {

    public TwoLeggedOAuthProviderProcessingFilter(
            OAuthConsumerDetailsService oAuthConsumerDetailsService,
            MyOAuthNonceServices oAuthNonceServices,
            OAuthProcessingFilterEntryPoint oAuthProcessingFilterEntryPoint) {
        super();
        setAuthenticationEntryPoint(oAuthProcessingFilterEntryPoint);
        setConsumerDetailsService(oAuthConsumerDetailsService);
        setNonceServices(oAuthNonceServices);
    }
}
