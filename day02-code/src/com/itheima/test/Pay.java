package com.itheima.test;

public interface Pay {
    public void payment(double money);
}
class Cardpay implements Pay{
    @Override
    public void payment(double money) {
        System.out.println(money);
    }
}

