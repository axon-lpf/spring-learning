package com.spring.source.code.factoryBean;

import com.spring.source.code.factoryBean.enitites.MyBean;
import org.springframework.beans.factory.FactoryBean;

/**
 * FactoryBean 是一个特殊的 Bean，它本身也是一个 Bean，但它的主要目的是用来创建其他的 Bean。通过实现 FactoryBean 接口，你可以自定义 Bean 的创建逻辑。
 * •使用场景：当你需要对 Bean 的创建过程进行更多控制时，可以使用 FactoryBean。
 */
public class MyFactoryBean implements FactoryBean<MyBean> {

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public MyBean getObject() throws Exception {
        MyBean myFactoryBean = new MyBean();
        myFactoryBean.setName(this.name);
        return myFactoryBean;
    }

    @Override
    public Class<?> getObjectType() {
        return MyBean.class;
    }
}
