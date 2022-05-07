package com.example.factory;

public class FactoryMain {

    public static void main (String[] args) {

    /*    
        Class[] interfaces = Terminal.class.getInterfaces();
        for (int i = 0; i <= interfaces.length; i++) {
            System.out.println (interfaces[i].getCanonicalName());
        }
    */
    
    try {
        Class c = Class.forName("com.example.factory.Terminal");
        Object obj  = c.newInstance();
        Terminal t = (Terminal) obj;
        t.setManufacturer("Intel");
        System.out.println (t.getManufacturer());
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (InstantiationException e) {
        e.printStackTrace();
    } catch (IllegalAccessException e) {
        e.printStackTrace();
    }

    
    }
    
}
