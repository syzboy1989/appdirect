package com.yizhang.appdirect.controller;

import com.yizhang.appdirect.resource.Response;
import com.yizhang.appdirect.service.impl.SubscriptionServiceImpl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/subscription")
public class Subscription {

    private static Logger logger = Logger.getLogger(Subscription.class);

    @Autowired
    SubscriptionServiceImpl subscriptionService;

    /**
     * create a subscription
     * @param request
     * @param eventUrl
     * @return response indicating success or failure
     */
    @RequestMapping(value="/create", method = { RequestMethod.GET })
    public Response createSubscription(HttpServletRequest request, @RequestParam String eventUrl) {
        logger.info(eventUrl);

        return subscriptionService.createSubscription(eventUrl);

    }

    /**
     * cancel a subscription
     * @param request
     * @param eventUrl
     * @return response indicating success or failure
     */
    @RequestMapping(value = "/cancel", method = { RequestMethod.GET })
    public Response cancelSubscription(HttpServletRequest request, @RequestParam String eventUrl) {
        logger.info(eventUrl);

        return subscriptionService.cancelSubscription(eventUrl);
    }

    /**
     * notice of status change of a subscription
     * @param request
     * @param eventUrl
     * @return response indicating success or failure
     */
    @RequestMapping(value = "/notice", method = { RequestMethod.GET })
    public Response noticeSubscription(HttpServletRequest request, @RequestParam String eventUrl) {
        logger.info(eventUrl);

        return subscriptionService.subscriptionNotice(eventUrl);
    }

    /**
     * update a subscription
     * @param request
     * @param eventUrl
     * @return response indicating success or failure
     */
    @RequestMapping(value = "/update", method = { RequestMethod.GET })
    public Response updateSubscription(HttpServletRequest request, @RequestParam String eventUrl) {
        logger.info(eventUrl);

        return subscriptionService.updateSubscription(eventUrl);
    }

}
