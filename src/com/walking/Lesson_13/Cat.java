package com.walking.Lesson_13;

public class Cat extends Animal{
    public static final String CAT_CLASS_NAME = "Cat";

    public Cat(){
        super(CAT_CLASS_NAME);
    }

    @Override
    public void sound(){
        System.out.println("meow");
    }
}
