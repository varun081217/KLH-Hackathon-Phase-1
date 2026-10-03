import java.util.Scanner;

// 1(a) Data Types

public class OneA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int members = sc.nextInt();
        double consumption = sc.nextDouble();
        int houseNumber = sc.nextInt();
        char status = sc.next().charAt(0);

        System.out.println("Family Members: " + members);
        System.out.println("Water Consumed: " + consumption);
        System.out.println("House Number: " + houseNumber);
        System.out.println("Water Usage Status: " + status);
    }
}