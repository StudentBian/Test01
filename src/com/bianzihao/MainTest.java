package com.bianzihao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainTest {
    public static void main(String[] args) {
        SellUsb usbFactory = new UsbFactory();

        InvocationHandler handler = new AUsb(usbFactory);

        SellUsb sellUsb = (SellUsb) Proxy.newProxyInstance(usbFactory.getClass().getClassLoader(),
                usbFactory.getClass().getInterfaces(),handler);

        Float price = sellUsb.sell(4);
        System.out.println("通过动态代理卖出的价格"+price);

        AUsb usb = new AUsb(2);

        usb.sum(2);

    }
}
