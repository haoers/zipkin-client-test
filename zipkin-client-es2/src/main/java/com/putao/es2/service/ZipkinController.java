package com.putao.es2.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class ZipkinController{

    private static final Logger LOG = Logger.getLogger(ZipkinController.class.getName());

    @GetMapping(value="/zipkin")
    public String zipkinServiceEs(@RequestParam String id)
    {
        LOG.info("Inside zipkinService es..");

        return "[es2] hi,"+id;
    }
}
