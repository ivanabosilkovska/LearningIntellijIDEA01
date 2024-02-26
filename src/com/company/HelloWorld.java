package com.company;

public class HelloWorld {

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HelloWorld(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        System.out.println("Hello World!!!");

        String a = "dshfks";

        sayHello("Dame");

        System.out.println("Learning Git...");

        System.out.println("committing changes using InrelliJ");

        System.out.println("amending...test1");

        System.out.println("test 2");

        System.out.println("pushing changes...");

        System.out.println("test3");
    }

    // comment
    /*
    lkjl
    lkjnlk
    knkj

     */

    private int age = 20;

    // TODO: add support for multiple users
    public static void sayHello(String name){
        System.out.println("Hello " +name); //Hello Dame

    }

}
