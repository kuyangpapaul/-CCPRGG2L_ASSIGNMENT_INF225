import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

       driving("driving");
        scan.close();
    }

    static void driving(String tricycle) {

        System.out.println("Driving outcome");
     Training(tricycle);

        String feedback = getFeedBack(tricycle);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            fixDriving(tricycle);

            // Recursive call
            driving(tricycle);
        } else if (feedback.equals("yes")) {
          System.out.print("I passed!" );
        }
    }

    static void Training(String drive ) {
        System.out.println("Test about my driving skills");
    }

    static String getFeedBack(String driving) {
        System.out.println("Is my " + driving + " accepted? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fixDriving(String drive) {
        System.out.print("Do you want to retake the exam?:");
        String improvements = scan.next();
        System.out.println("Fixing drive. Added " + improvements);
    }

    static void test(String driving) {
        System.out.println("Test " + driving);
    }

}