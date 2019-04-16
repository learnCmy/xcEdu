package com.xuecheng.govern.gateway.filter;

import com.google.common.util.concurrent.RateLimiter;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import com.xuecheng.govern.gateway.exception.RateLimiterException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * @Auther: cmy
 * @Date: 2019/4/16 13:20
 * @Description: 限流
 */
@Component
public class RateLimiterFilter extends ZuulFilter {

    //每秒钟放100个令牌
    private static final RateLimiter RATE_LIMITER=RateLimiter.create(100);


    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.SERVLET_DETECTION_FILTER_ORDER-1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        if (!RATE_LIMITER.tryAcquire()){
            throw new RateLimiterException();
        }
        return null;
    }
}
