package ch5.util4;

import java.lang.reflect.Method;

public class ClassLoaderMain {
    public static void main(String[] args) throws Exception{
//        Bus b1 = new Bus();
//        b1.a();

        String className = "util4.ch5.Bus";
        Class clazz = Class.forName(className);
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Method m : declaredMethods) {
            System.out.println(m.getName());
        }

    }
}
