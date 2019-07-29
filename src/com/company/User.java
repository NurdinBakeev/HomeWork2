package com.company;

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name.length() > 20){
            throw new IllegalNameLegthExeption("Извините, ваше имя больше 20-ти символов");
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age > 100 || age < 1){
            throw new IllegalAgeExeption("Ваш возвраст недопустимого значения");
        }
        this.age = age;
    }
}
