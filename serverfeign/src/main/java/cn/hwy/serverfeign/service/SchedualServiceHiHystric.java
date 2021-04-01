package cn.hwy.serverfeign.service;

import org.springframework.stereotype.Component;

/**
 * <p>描述:
 * <p>版权: 税友软件集团股份有限公司
 * <p>日期: 2021/4/1 15:21
 * <p>作者: huwy
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry sayHiFromClientOne " + name;
    }
}
