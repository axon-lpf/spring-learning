package com.spring.source.code.aop.aspectAnnotion.service.impl;

import com.spring.source.code.aop.aspectAnnotion.service.ICommonService;
import org.springframework.stereotype.Service;

/**
 * @author lingxiao
 */
@Service
public class CommonServiceImpl implements ICommonService {

    @Override
    public Boolean createCommon(String name) {

        try {
            int result = 1 / 0;
            System.out.println("我是方法体。。。。。。。" + name);
        } catch (Exception e) {
          //  e.printStackTrace();
            throw  e;
        } finally {
            return true;
        }
    }
}
