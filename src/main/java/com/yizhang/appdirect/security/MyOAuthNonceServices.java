package com.yizhang.appdirect.security;

import org.springframework.security.oauth.provider.nonce.InMemoryNonceServices;
import org.springframework.stereotype.Component;

@Component
public class MyOAuthNonceServices extends InMemoryNonceServices {

    @Override
    public long getValidityWindowSeconds() {
        return 120;
    }

}
