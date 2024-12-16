package questions;

public class JavaQuest6 {
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ...
   * 
   */
  public static void main(String[] args) {
    int first = 0, second = 1;
    int [] sum = new int [15];
    // for loop to print first 15 numbers in Fibonacci Sequence
    for (int i = 0; i < 15; i++){
      if (i == 0){
        sum [0] = first;
      } else if (i == 1){
        sum [1] = second;
      }
        else if ( i >= 2) {
        sum [i] = sum [i - 2] + sum [i - 1];
      }
      System.out.println(sum[i]);
    }
    
  }
}