package com.nm.nmcommon.feign;

import com.nm.nmcommon.constant.ServiceNameConstants;
import com.nm.nmcommon.model.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author baostorm
 */
@FeignClient(name = ServiceNameConstants.TEST_SERVICE, decode404 = true)
public interface TestFeign {
    /**
     * feign rpc访问远程/users/{username}接口
     * 查询用户实体对象SysUser
     *
     * @return
     */
    @GetMapping(value = "/test/get")
    Result<String > testGet();
}
