package com.java8.demo.interfaces;

public class DefaultInterfaceApp implements DefaultInterface{

    public static void main(String args[])
    {
        DefaultInterfaceApp d = new DefaultInterfaceApp();
        //d.square(4);

        // default method executed
        d.calculate(222233, 55555);
    }
}
