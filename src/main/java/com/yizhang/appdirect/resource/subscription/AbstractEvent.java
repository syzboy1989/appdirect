package com.yizhang.appdirect.resource.subscription;


import com.yizhang.appdirect.resource.Creator;
import com.yizhang.appdirect.resource.MarketPlace;

import java.io.Serializable;


public abstract class AbstractEvent implements Serializable {

    private static final long serialVersionUID = 1L;

    private Creator creator;
    private MarketPlace marketplace;
    private EventTypeEnum type;
    private String url;
    private String flag;

    public AbstractEvent(EventTypeEnum eventType)
    {
        this.type= eventType;
    }

    public Creator getCreator()
    {
        return creator;
    }

    public void setCreator(Creator creator)
    {
        this.creator = creator;
    }

    public MarketPlace getMarketplace()
    {
        return marketplace;
    }

    public void setMarketplace(MarketPlace marketplace)
    {
        this.marketplace = marketplace;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public EventTypeEnum getType()
    {
        return type;
    }

    public void setType(EventTypeEnum eventType)
    {
        this.type = eventType;
    }

    public String getFlag()
    {
        return flag;
    }

    public void setFlag(String flag)
    {
        this.flag = flag;
    }

    public enum EventTypeEnum
    {
        SUBSCRIPTION_ORDER,
        SUBSCRIPTION_CHANGE,
        SUBSCRIPTION_CANCEL,
        SUBSCRIPTION_NOTICE,

    }

}