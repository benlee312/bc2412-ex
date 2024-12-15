public class Exercise20241212 {
  public static void main(String[] args){
    int customers = 10;
    char price = ' ';
    int averageAge= 67;
    int finalPrice = price * customers;
    
    if (averageAge >= 65 && customers >= 6 || averageAge <=65 && customers >= 10){
      price = 32;
    } else if (averageAge >= 65 && customers >= 4 || averageAge <=65 && customers >= 6){
      price = 35;
    } else if (averageAge >= 65 && customers >= 2 || averageAge <=65 && customers >= 40){
      price = 38;
    } else {
      price = 40;
    }
    System.out.println("The price is " + finalPrice);
    

  }
  
}
