package com.bianzihao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AUsb implements InvocationHandler {
    private Object target = null;

    public AUsb (Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res=null;
        //目标方法执行
        res = method.invoke(target,args);//执行目标方法

        //功能增强(加价)
        if(res!=null){
            Float price=(Float)res;
            price=price+15;
            res=price;
        }
        return res;
    }
}
