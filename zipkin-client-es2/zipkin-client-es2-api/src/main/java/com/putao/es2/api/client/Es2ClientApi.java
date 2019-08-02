package com.putao.es2.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 为第三服务提供feignClient 接口
 * @Author: zenghao
 */
@FeignClient(value = "zipkin-client-es2")
public interface Es2ClientApi {

    @RequestMapping(value = "/zipkin",method = RequestMethod.GET)
    String zipkinService2(@RequestParam String id);
}
