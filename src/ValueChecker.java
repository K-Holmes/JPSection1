import java.util.Scanner;

public class ValueChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number");
        int num = sc.nextInt();
        if (num == 7){
            System.out.println("That's lucky!");
        } else if (num == 13){
            System.out.println("That's unlucky!");
        } else {
            System.out.println("That's neither lucky nor unlucky!");
        }
        sc.close();
    }
}
