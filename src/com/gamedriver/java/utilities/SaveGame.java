/*
  Author: Christian Castillo

  Save game data
*/

package com.gamedriver.java.utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveGame {

    public static void save(int fileNumber) {


        String fileName = "SaveData" + fileNumber + ".txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {

            String content = "Player Data";

            bw.write(content);

            System.out.println("Game Saved Successfully!");

        } catch (IOException e) {

            e.printStackTrace();

        }

    }


}
