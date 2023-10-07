import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float numberOne, numberTwo, numberThree ;

        System.out.println("Introduce 3 numbers to compare: ");

        System.out.println("Number 1: ");
        numberOne = scan.nextFloat();

        System.out.println("Number 2: ");
        numberTwo = scan.nextFloat();

        System.out.println("Number 3: ");
        numberThree = scan.nextFloat();

        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println("Number 1 is the highest");
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println("Number 2 is the highest");
        } else if (numberThree > numberOne && numberThree > numberTwo) {
            System.out.println("Number 3 is the highest");
        }
    }
} // later on a version using data structures (I don't have time right now)
