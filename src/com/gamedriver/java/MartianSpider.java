package com.gamedriver.java;

public class MartianSpider extends Enemy {
    public MartianSpider() {
        super("Martian Spider", 5, 2, 2);
    }

    public MartianSpider(int health) {
        super("Martian Spider", health, 5, 2);
    }
}
