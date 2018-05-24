package com.gamedriver.java;

import java.util.Date;
import java.util.GregorianCalendar;

public class Player {


    private String name;
    private String planet;
    private int age;
    private String color;
    private int health = 100;
    private int attack = 5;
    private int defense = 3;


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
    void setHealth(int health) {
        this.health = health;
    }
    void setAttack(int attack){
        this.attack = attack;
    }
    void setDefense(int defense){
        this.defense = defense;
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

    int getAttack() {
        return this.attack;
    }

    int getHealth() {
        return this.health;
    }

    int getDefense() {
        return this.defense;
    }

    String getColor() {
        return this.color;
    }

    Date now = new Date();



    //call on this to write to gamesave.txt
    public String toSave() {
        return "NAME: " + this.name +
                "\n Planet: " + this.planet +
                "\n Age: " + this.age +
                "\n Color: " + this.color +
                "\n Attack: " + this.attack +
                "\n Defense: " + this.defense +
                "\n Time of Save: " + now;
    }

    public String toStats() {
        return "Your Stats: HP= " + this.health + ", ATK= " + this.attack + ", DEF= " + this.defense;
    }

}
