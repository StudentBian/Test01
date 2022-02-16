package com.bianzihao;

//相当于一个厂家出厂价格
public class UsbFactory implements SellUsb {
    @Override
    public float sell(int count) {
        //目标方法
        System.out.println("目标类执行的sell目标方法");
        return 85.0f+count;
    }
}
