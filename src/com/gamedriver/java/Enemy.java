package com.gamedriver.java;

public class Enemy {
    
    private String type = "";
    private int attack;
    private int defense;

    public Enemy(String type, int attack, int defense) {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "type='" + type + '\'' +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }
}
