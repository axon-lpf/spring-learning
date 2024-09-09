package com.spring.source.code.beanAnnotation.enttites;

import java.math.BigDecimal;

public class Order {

    private String goodsId;

    private String goodsName;

    private BigDecimal price;


    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "goodsId='" + goodsId + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                '}';
    }

}
