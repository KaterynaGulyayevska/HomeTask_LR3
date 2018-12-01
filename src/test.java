import java.util.Scanner;

public class test {


        public static void main(String[] args) {

            System.out.println("Hello!");
                
                Scanner sc = new Scanner(System.in);
            int computerNumber = (int) (Math.random() * 10);
            int userNumber = 0;
            while (userNumber != computerNumber) {
                System.out.println("Input number form 0 --> 9");
                userNumber = sc.nextInt();
                if (userNumber != computerNumber) {
                    System.out.println("You are wrong!");
                } else {

                System.out.println("Game over");
                }

                /*Max were here*/

                System.out.println("Play with Hillel team");
                    
                    // Play with branches.
                    System.oout.println("See you!")
                System.out.println("Play with Us!!!<--");

            }

        }
    }
