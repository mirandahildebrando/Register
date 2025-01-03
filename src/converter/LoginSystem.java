package converter;

import java.util.Scanner;

public class LoginSystem {
	   public static void main(String[] args) {
		   
	      Scanner scanner = new Scanner(System.in);
	      
	      
	      String username = scanner.nextLine();
	      String password = scanner.nextLine();

	      System.out.print("Enter username: ");
	      String inputUsername = scanner.nextLine();

	      System.out.print("Enter password: ");
	      String inputPassword = scanner.nextLine();

	      if(inputUsername.equals(username) && inputPassword.equals(password)) {
	         System.out.println("Successful login");
	      } else {
	         System.out.println("Incorrect username or password");
	      }

	      scanner.close();
	   }
	}