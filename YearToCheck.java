package year.to.check;

import java.util.Scanner;

public class YearToCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please Enter a year to check");
        int year = input.nextInt();

        switch (year % 12) {
            case 0:
                System.out.println("the entered year is a monkey");
                break;
            case 1:
                System.out.println("the entered year is a rooster");
                break;
            case 2:
                System.out.println("the entered year is a dog");
                break;
            case 3:
                System.out.println("the entered year is a pig");
                break;
            case 4:
                System.out.println("the entered year is a rat");
                break;
            case 5:
                System.out.println("the entered year is a ox");
                break;
            case 6:
                System.out.println("the entered year is a tiger");
                break;
            case 7:
                System.out.println("the entered year is a rabbit");
                break;
            case 8:
                System.out.println("the entered year is a dragon");
                break;
            case 9:
                System.out.println("the entered year is a snake");
                break;
            case 10:
                System.out.println("the entered year is a horse");
                break;
            case 11:
                System.out.println("the entered year is a sheep");
                break;
            default:
                System.out.println("Invalid year");
                break;

        }
    }

}
