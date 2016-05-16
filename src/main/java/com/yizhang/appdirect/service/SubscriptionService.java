package com.yizhang.appdirect.service;

import com.yizhang.appdirect.resource.Response;

public interface SubscriptionService {

    /**
     * create subscription
     * @param eventUrl
     * @return response xml
     */
    public Response createSubscription(String eventUrl);

    /**
     * update subscription
     * @param eventUrl
     * @return response xml
     */
    public Response updateSubscription(String eventUrl);

    /**
     * cancel subscription
     * @param eventUrl
     * @return response xml
     */
    public Response cancelSubscription(String eventUrl);

    /**
     * retrieve a subscription
     * @param eventUrl
     * @return response xml
     */
    public Response subscriptionNotice(String eventUrl);

}