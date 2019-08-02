package com.putao.es1.service;

import com.putao.es0.api.client.Es0ClientApi;
import com.putao.es2.api.client.Es2ClientApi;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.logging.Logger;

@RestController
public class ZipkinController{

    @Resource
    Es2ClientApi es2ClientApi;
    @Resource
    Es0ClientApi es0ClientApi;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    private static final Logger LOG = Logger.getLogger(ZipkinController.class.getName());

    @GetMapping(value="/zipkin/{id}")
    public String zipkinServiceEs(@PathVariable String id)
    {
        LOG.info("Inside zipkinService es..");
        String result = es2ClientApi.zipkinService2(id);
        result = es0ClientApi.zipkinService2(result);
        return "[es] hi,"+result;
    }
}
