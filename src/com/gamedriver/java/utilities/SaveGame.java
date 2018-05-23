/*
  Author: Christian Castillo

  Save game data
*/

package com.gamedriver.java.utilities;

import com.gamedriver.java.Player;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveGame {

    public static void save(int fileNumber, Player player) {


        String fileName = "src/storytext/SaveData" + fileNumber + ".txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {

            String content = player.toSave();

            bw.write(content);

            System.out.println("Game Saved Successfully!");

        } catch (IOException e) {

            e.printStackTrace();

        }

    }


}
