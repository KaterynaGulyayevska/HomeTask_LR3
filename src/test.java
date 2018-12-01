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

<<<<<<< HEAD
=======
                /*Max were here*/
                System.out.println("Play with Us!!!<--");
>>>>>>> 916d3d22216d6d5b2079211b7ec9a2f168cb2d2e
            }

        }
    }
