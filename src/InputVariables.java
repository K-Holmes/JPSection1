import java.util.Scanner;

public class InputVariables {
    public static void main(String[] args) {
        //scanner recap from slides
        Scanner in = new Scanner(System.in);
        int intVar;
        short shortVar;
        long longVar;
        double doubleVar;
        float floatVar;
        byte byteVar;
        boolean booleanVar;
        char charVar;

        System.out.println("Give an int");
        intVar = in.nextInt();
        System.out.println("Give a short");
        shortVar = in.nextShort();
        System.out.println("Give a double");
        doubleVar = in.nextDouble();
        System.out.println("Give a long");
        longVar = in.nextLong();
        System.out.println("Give a float");
        floatVar = in.nextFloat();
        System.out.println("Give a byte");
        byteVar = in.nextByte();
        System.out.println("Give a char");
        charVar = in.next().charAt(0);
        System.out.println("Give a boolean");
        booleanVar = in.nextBoolean();

        in.close();

        System.out.println("Int: "+intVar);
        System.out.println("Byte: "+byteVar);
        System.out.println("Short: "+shortVar);
        System.out.println("Long: "+longVar);
        System.out.println("Double: "+doubleVar);
        System.out.println("Float: "+floatVar);
        System.out.println("Boolean: "+booleanVar);
        System.out.println("Char: "+charVar);
    }
}
