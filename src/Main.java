import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string of your choice: ");
        String str1 = input.nextLine();

        System.out.println("The length of your string is " + str1.length());
        System.out.println("First half: " + str1.substring(0,str1.length()/2));
        System.out.println("Second half: " + str1.substring(str1.length()/2,str1.length()));

        System.out.print("Enter a second string: ");
        String str2 = input.nextLine();

        if((str1.length()>str2.length())) {
            System.out.println(str1 + " is longer");
        }

        if((str2.length()>str1.length())) {
            System.out.println(str2 + " is longer");
        }

        if(str1.length()==str2.length()) {
            System.out.println("Both strings have the same length");
        }

        if(str1.compareTo(str2)<0) {
            System.out.println(str1 + " is first alphabetically");
        }

        if(str2.compareTo(str1)<0) {
            System.out.println(str2 + " is first alphabetically");
        }

        if(str2.compareTo(str1)==0) {
            System.out.println("Both strings have the exact same characters");
        }

        int index = str1.indexOf(str2);
        if(index<0) {
            System.out.println(str2 + " is NOT found in " + str1);
        }
        if(index>0) {
            System.out.println(str2 + " is found in " + str1 + " at index " + index);
        }

        if(str1.substring(0).equals(str2.substring(0))) {
            System.out.println(str2 + " is found in " + str1 + " at index 0");
        }





    }
}
