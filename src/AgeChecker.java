import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me your age: ");
        int age = sc.nextInt();
        System.out.println("Do you have a driver's license? y or n");
        char license = sc.next().charAt(0);

        if (age >= 21){
            if (license == 'y'){
                System.out.println("You are old enough and can hire a car");
            } else if (license == 'n'){
                System.out.println("You are an adult but cannot hire a car");
            }
        } else {
            System.out.println("You are not an adult and therefore cannot hire a car");
        }


        sc.close();
    }
}
