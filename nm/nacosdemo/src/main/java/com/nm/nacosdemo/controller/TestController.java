package com.nm.nacosdemo.controller;

import com.nm.nmcommon.model.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baostorm
 */
@RestController
public class TestController {
    @GetMapping("/test/get")
    public Result<String > get(){
        return Result.succeed("Hello Nacos Demo");
    }
}
