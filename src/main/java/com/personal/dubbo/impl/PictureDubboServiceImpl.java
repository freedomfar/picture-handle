package com.personal.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.personal.dubbo.IPictureDubboService;

/**
 * Created by hellofar on 2018/12/4.
 */
@Service(version = "1.0.0")
public class PictureDubboServiceImpl implements IPictureDubboService {
    @Override
    public String testDubbo() {
        return "this is test dubbo";
    }
}
