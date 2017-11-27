package cn.hhx.frame.util.test;

public class Outer {
	class Inner {}
	 
   // public static void foo() { new Inner(); }
 
    public void bar() { new Inner(); }
 
    public static void main(String[] args) {
    	new Outer().new Inner();
    }
}
