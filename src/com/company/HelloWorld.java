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
