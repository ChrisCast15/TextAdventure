public class MapArray{
  public static void main(String[] args){
    
    //create a map with different objects in it the array
    //create a 5x5 ar
    //assign random numbers to each index
    //print out the values with a loop
    
    //create 5x5 array
    int [] [] map = new int [5] [5];
    
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
    
    
    
  }
public static int rNG(){
  int rNum = (int)(Math.random() * 100);
  return rNum;
}
  
}
