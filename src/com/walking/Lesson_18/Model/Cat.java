package com.walking.Lesson_18.Model;

public class Cat extends Animal {
    public static final String CAT_CLASS_NAME = "Cat";

    //    Передаем параметры в super внутри конструктора, а не принимая их в параметры Cat(),
//    чтобы избежать ошибочного поведения при использовании этого класса
    public Cat() {
        super(CAT_CLASS_NAME, "meow");
    }

    public void meow() {
        sound();
    }
}
