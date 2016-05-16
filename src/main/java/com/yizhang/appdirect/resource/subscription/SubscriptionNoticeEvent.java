package com.yizhang.appdirect.resource.subscription;

import javax.xml.bind.annotation.XmlRootElement;

import com.yizhang.appdirect.resource.Payload;

@XmlRootElement(name = "event")
public class SubscriptionNoticeEvent extends AbstractEvent
{
    private static final long serialVersionUID = 1L;

    private Payload payload;

    public SubscriptionNoticeEvent()
    {
        super(EventTypeEnum.SUBSCRIPTION_NOTICE);
    }

    public Payload getPayload()
    {
        return payload;
    }

    public void setPayload(Payload payload)
    {
        this.payload = payload;
    }
}