package com.gamedriver.java;

public class Player {
    String name;
    String planet;


    public void setName(String str) {
        this.name = str;
    }

    public void setPlanet(String str) {
        this.planet = str;
    }

    public String getName() {
        return this.name;
    }
    public String getPlanet() {
        return this.planet;
    }

    public String toSave() {
        String saveData =
                "NAME: " + this.name +
                        "\n Planet: " + this.planet;
        return saveData;
    }

}
