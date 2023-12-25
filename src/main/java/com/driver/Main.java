package com.driver;
// Task 1: Create a class A with a method named meth
public class Main {

    public static class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create a class B which extends class A
public static class B extends A {
    // Task 4: Override method meth of class A in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}
    public static void main(String[] args) {
        // Task 3: Create an object of class B
        B objB = new B();
        // Task 5: Call the overridden method from obj of class B
        String result = objB.meth();
        System.out.println(result);
    }
}
