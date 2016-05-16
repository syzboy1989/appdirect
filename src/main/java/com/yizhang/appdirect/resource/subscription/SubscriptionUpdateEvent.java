package com.yizhang.appdirect.resource.subscription;

import javax.xml.bind.annotation.XmlRootElement;

import com.yizhang.appdirect.resource.Payload;

@XmlRootElement(name = "event")
public class SubscriptionUpdateEvent extends AbstractEvent
{
    private static final long serialVersionUID = 1L;

    private Payload payload;

    public SubscriptionUpdateEvent()
    {
        super(EventTypeEnum.SUBSCRIPTION_CHANGE);
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