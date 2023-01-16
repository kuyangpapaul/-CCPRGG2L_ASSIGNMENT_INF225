import java.util.Scanner;

public class java {

  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the NU Student email address: ");
       String email = sc.nextLine();

        if (email.matches("elizerponiojr@students.national-u.edu.ph") && email.endsWith("@students.national-u.edu.ph")) {
           System.out.println("The NU Student email address is valid");
        } else {
           System.out.println("The NU Student email address is invalid");
        }

       System.out.println("Enter the Philippine mobile phone number: ");
       String phoneNumber = sc.nextLine();

        if (phoneNumber.matches("09123456789")) {
           System.out.println(" The Philippine mobile phone number is valid");
        } else {
           System.out.println(" The Philippine mobile phone number is invalid");
        }
    }
}