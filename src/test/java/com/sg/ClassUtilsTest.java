package com.sg;

/**
 * @author xh.d
 * @since 2018/8/10 11:24
 */
public class ClassUtilsTest {
    public static void main(String[] args) {
        System.out.println("数组:"+String[].class);
        System.out.println("字符串:"+String.class);
        System.out.println("二维数组:"+String[][].class);
        System.out.println(ClassUtilsTest.class.getName());
        System.out.println(String.class.getName());
        System.out.println(char.class.getName());
        System.out.println(boolean.class.getName());
        System.out.println(double.class.getName());
        System.out.println(void.class.getName());
    }
}
