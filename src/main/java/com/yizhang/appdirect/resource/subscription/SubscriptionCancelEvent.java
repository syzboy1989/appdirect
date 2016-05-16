package com.yizhang.appdirect.resource.subscription;

import javax.xml.bind.annotation.XmlRootElement;

import com.yizhang.appdirect.resource.Payload;

@XmlRootElement(name = "event")
public class SubscriptionCancelEvent extends AbstractEvent
{
    private static final long serialVersionUID = 1L;

    private Payload payload;

    public SubscriptionCancelEvent()
    {
        super(EventTypeEnum.SUBSCRIPTION_CANCEL);
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