package com.gamedriver.java;

public class Player {


    private String name;
    private String planet;
    private int age;
    private String color;


//    Methods for setting player information
    void setName(String str) {
        this.name = str;
    }

    void setPlanet(String str) {
        this.planet = str;
    }

    void setAge(int num) {
        this.age = num;
    }

    void setColor(String str) {
        this.color = str;
    }

//    Methods for retrieving player information.
    String getName() {
        return this.name;
    }

    String getPlanet() {
        return this.planet;
    }

    int getAge() {
        return this.age;
    }

    String getColor() {
        return this.color;
    }

    //call on this to write to gamesave.txt
    public String toSave() {
        return "NAME: " + this.name +
                "\n Planet: " + this.planet;
    }

}
