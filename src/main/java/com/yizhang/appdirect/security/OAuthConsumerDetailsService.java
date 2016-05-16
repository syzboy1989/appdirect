package com.yizhang.appdirect.security;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth.common.OAuthException;
import org.springframework.security.oauth.common.signature.SharedConsumerSecretImpl;
import org.springframework.security.oauth.provider.BaseConsumerDetails;
import org.springframework.security.oauth.provider.ConsumerDetails;
import org.springframework.security.oauth.provider.ConsumerDetailsService;
import org.springframework.stereotype.Component;

@Component
public class OAuthConsumerDetailsService implements ConsumerDetailsService {
    final static Logger log = Logger.getLogger(OAuthConsumerDetailsService.class);

    @Value("${oauth.key}")
    private String key;

    @Value("${oauth.secret}")
    private String secret;

    @Override
    public ConsumerDetails loadConsumerByConsumerKey(String consumerKey) throws OAuthException {
        BaseConsumerDetails cd;
        if (key.equals(consumerKey)) {
            cd = new BaseConsumerDetails();
            cd.setConsumerKey(consumerKey);
            cd.setSignatureSecret(new SharedConsumerSecretImpl(secret));
            cd.setConsumerName("Sample");
            cd.setRequiredToObtainAuthenticatedToken(false); // not required for 2-legged oauth
            cd.getAuthorities().add(new SimpleGrantedAuthority("ROLE_OAUTH"));
        } else {
            throw new OAuthException("Mismatch for consumer key");
        }
        return cd;
    }

}
