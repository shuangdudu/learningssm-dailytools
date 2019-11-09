package com.shuangwhywhy.it.learning.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * ClassLoader实例化对象
 */
public class ReflectTest1 {


    public static void main(String[] args) throws Throwable {
        Car car = initByDefaultConst();
        car.introduce();
    }
    public static Car initByDefaultConst() throws Throwable{
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.shuangwhywhy.it.reflect.Car");
        Constructor cons = clazz.getDeclaredConstructor((Class[])null);
        Car car = (Car) cons.newInstance();
        Method setBrand = clazz.getMethod("setBrand",String.class);
        setBrand.invoke(car,"红旗CA72");
        Method setColor = clazz.getMethod("setColor",String.class);
        setColor.invoke(car,"黑色");
        Method setMaxSpeed = clazz.getMethod("setMaxSpeed",int.class);
        setMaxSpeed.invoke(car,200);
        return car;
    }

}
