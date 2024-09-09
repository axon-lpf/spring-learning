package com.spring.source.code.aop.base.service.impl;

import com.spring.source.code.aop.base.service.IShopService;

public class ShopServiceImpl implements IShopService {
    @Override
    public Integer createShop(int x, int y) {
        return x + y;
    }
}
