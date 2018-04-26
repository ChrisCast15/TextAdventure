public class MapArray{


  public static int [] [] generate(){

    //create a map with different objects in it the array
    //create a 5x5 ar
    //assign random numbers to each index
    //print out the values with a loop

    //create 5x5 array
    int [] [] map = new int [5] [5];

    //an array that holds used RNGs
    int[] usedNums = new int[25];

    //assign random numbers to array
    for(int x = 0; x < 5; x++){ //cycles through one dimension



      for(int y = 0; y < 5; y++){ //cycles through second dimension

        map [x] [y] = rNG();
      }

    }
    
    //print out array
    for(int x = 0; x < 5; x++){ //cycles through one dimension
      
      for(int y = 0; y < 5; y++){ //cycles through second dimension
        System.out.print(map [x] [y] + "\t");
      }
      System.out.println(" ");
    }
    
    return 0;
    
  }
public static int rNG(){
  int rNum = (int)(Math.random() * 25);
  return rNum;
}
  
}
