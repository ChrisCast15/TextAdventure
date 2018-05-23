package com.gamedriver.java;

public class Enemy {

    private String type;
    private int health;
    private int attack;
    private int defense;

    /**
     * @param type    what kind of enemy do we have?
     * @param health  hit points, bring down to 0 to kill enemy
     * @param attack  how much damage will the enemy inflict
     * @param defense damage dealt to enemy will be player's attack - enemy defense
     */

    public Enemy() { }

    public Enemy(String type, int health, int attack, int defense) {
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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
        return "Enemy " + type +
                ": HP= " + health +
                ", ATK= " + attack +
                ", DEF=" + defense;
    }
}
