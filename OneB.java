import java.util.Scanner;

// 1(b)If-Else Condition

public class OneB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int consumption = sc.nextInt();
        int bill;

        if (consumption <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }

        System.out.println("Water Bill: Rs." + bill);
    }
}