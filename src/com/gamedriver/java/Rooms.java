package com.gamedriver.java;

public class Rooms {

    private String description = "This is a dark room. As the beam of your flashlight glides over the" +
            "the charred surfaces, it falls upon the twenty red eyes of a Martian Spider." ;
    private Enemy enemy = new MartianSpider();
    private String quizQ = "Which of Mar's moons has the closest orbit?";
    private String quizA = "phobos";
    private boolean puzzleSolved = false;


    public Rooms() {
    }

    public Rooms(String description, Enemy enemy, String quizQ, String quizA) {
        this.description = description;
        this.enemy = enemy;
        this.quizQ = quizQ;
        this.quizA = quizA;
        this.puzzleSolved = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        if (enemy.getHealth() > 0) {
            System.out.println("A " + enemy.getType() + " approaches!");
        }
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public String getQuizQ() {
        return quizQ;
    }

    public void setQuizQ(String quizQ) {
        this.quizQ = quizQ;
    }

    public String getQuizA() {
        return quizA;
    }

    public void setQuizA(String quizA) {
        this.quizA = quizA;
    }

    public boolean getPuzzleSolved() {
        return puzzleSolved;
    }

    public void setPuzzleSolved(boolean puzzleSolved) {
        this.puzzleSolved = puzzleSolved;
    }
}
