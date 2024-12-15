//package questions;

import java.util.Scanner;

public class JavaQuest3 {
  /**
   * Expected Output:
   * 
   * Example 1: Input a month number: 2 Input a year: 2016
   * 
   * February 2016 has 29 days
   * 
   * Example 2: Input a month number: 12 Input a year: 2014
   * 
   * December 2014 has 31 days
   */

  // Program the number of days that the month of a year has.

  public static void main(String[] strings) {

    Scanner input = new Scanner(System.in);

    int number_OfDaysInMonth = 0;

    String monthOfName = "Unknown";


    System.out.print("Input a month number: ");
    int month = input.nextInt(); // assume 1 - 12
    if (month == 1) {
      monthOfName = "Jan";
      } else if(month == 2) {
        monthOfName = "Feb";
      } else if (month == 3) {
        monthOfName = "Mar";
      } else if (month == 4) {
        monthOfName = "Apr";
      }else if (month == 5) {
        monthOfName = "May";
      }else if (month == 6) {
        monthOfName = "Jun";
      }else if (month == 7) {
        monthOfName = "Jul";
      }else if (month == 8) {
        monthOfName = "Aug";
      }else if (month == 9) {
        monthOfName = "Sep";
      }else if (month == 10) {
        monthOfName = "Oct";
      }else if (month == 11) {
        monthOfName = "Nov";
      }else if (month == 12) {
        monthOfName = "Dec";
      }else {}

    System.out.print("Input a year: ");
    int year = input.nextInt(); // > 0
    if (month == 2 && year % 4 == 0 && year % 100 > 0|| month == 2 && year % 400 == 0){
      number_OfDaysInMonth = 29;
    } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
      number_OfDaysInMonth = 31;
    } else if (month == 4 || month == 6 || month == 9 || month == 11){
      number_OfDaysInMonth = 30;
    } else if(month == 2){
      number_OfDaysInMonth = 28;
    } else {
      number_OfDaysInMonth = 0;
    }

    
    
    // The February has 29 days: (Every 4 years and the year cannot divded by
    // 100) or The year can divided by 400
    // otherwise the February should have 28 days only

    System.out.println(
        monthOfName + " " + year + " has " + number_OfDaysInMonth + " days");
  }
}
