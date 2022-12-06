public class StringOperations {
    public static void main(String[] args) {
        //string recap from slides
        String str1 = "Hello", str2 = "Kayla", str3="";
        str3 = "You are "+str2;
        System.out.println("Welcome: "+str3);
        System.out.println(str1.length());
        System.out.println(str3.substring(0,5));
        System.out.println(str2.toUpperCase());

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.equals(str2));
    }
}
