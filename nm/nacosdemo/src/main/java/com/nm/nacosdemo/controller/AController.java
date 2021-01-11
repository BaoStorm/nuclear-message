package com.nm.nacosdemo.controller;

import com.nm.nmcommon.feign.TestFeign;
import com.nm.nmcommon.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author baostorm
 */
@RestController
public class AController {
    @Autowired
    private TestFeign testFeign;

    @GetMapping("/a/get")
    public Result<String > get(){
        return testFeign.testGet();
    }
}
