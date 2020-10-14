/**
 * This program will determine if an integer that is given as a parameter is a Niven number or not
 * @author David Toma
 */
public class Main {
  // create a boolean method to get either true or false
  public static boolean isNiven(int integer){
    // create a variable called value
    int value = 0;
    // create a variable called integer1
    int integer1 = integer;
    // create a while loop to find the last digit, add it, and then take it away
    while(integer1 > 0 || integer1 < 0){ 
      int digit = integer1 % 10;
      value = value + digit;
      integer1 = integer1 / 10;
      }
      // create an if statement saying that if the integer divided by value, if the remainder is not equal to 0, then it will output as false
      if(integer % value != 0){
        return false;
    } return true;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a boolean variable to input which number the user wants to see if it is a niven number or not 
    boolean total = isNiven(18);
    // print out whether it is true or false
    System.out.println(total);
  }
}
