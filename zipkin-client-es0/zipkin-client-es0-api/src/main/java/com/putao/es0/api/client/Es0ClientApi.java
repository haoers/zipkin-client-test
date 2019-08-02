package com.putao.es0.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 为第三服务提供feignClient 接口
 * @Author: zenghao
 */
@FeignClient(value = "zipkin-client-es0")
public interface Es0ClientApi {

    @RequestMapping(value = "/zipkin",method = RequestMethod.GET)
    String zipkinService2(@RequestParam String id);
}
