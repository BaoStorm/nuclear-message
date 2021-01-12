package com.nm.nacosdemo.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.nm.nmcommon.model.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baostorm
 */
@RestController
public class TestController {
    @GetMapping("/test/get")
    @SentinelResource(value = "getByCode",blockHandler = "handleException")
    public Result<String > get() {
        return Result.succeed("Hello Nacos Demo");
    }

    /**
     * 自定义异常策略
     * 返回值和参数要跟目标函数一样，参数可以追加BlockException
     */
    public Result<String> handleException(BlockException exception){
//        log.info("flow exception{}",exception.getClass().getCanonicalName());
        return Result.failed("达到阈值了,不要再访问了!");
    }
}
