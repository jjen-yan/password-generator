import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("welcome to the password generator!!");
    System.out.println("please enter the number of passwords you want to generate: ");
    int num = scan.nextInt();
    System.out.println("please enter the length of the password you want to generate: ");
    int length = scan.nextInt();
    System.out.println("would you prefer special characters in your password? (y/n)");
    boolean special = true;
    if ((scan.next()).equals("y")) {
      special = true;
    }
    else {
      special = false;
    }

    PasswordGenerator generator = new PasswordGenerator(num, length, special);
    generator.generate();

    
    
  }
}