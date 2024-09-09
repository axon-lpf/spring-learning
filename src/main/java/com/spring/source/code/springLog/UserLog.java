package com.spring.source.code.springLog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserLog {

    private  static final Logger log= LoggerFactory.getLogger(UserLog.class);
    public static void main(String[] args) {
        log.info("测试中。。。。。。。。。");

    }
}
