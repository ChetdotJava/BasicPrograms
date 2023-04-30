import java.util.Scanner;

public class PW_Assignment08{
    public static int displayAverage(int num1, int num2, int num3){
        /*Question:01 Write a Java method to compute the average of three numbers */
        int average = (num1 + num2 + num3)/3;
        System.out.print("Average is= ");
        return average;
    }

    public static void displayVowels(String myString){
        /*Question:02 Write a Java method to count all vowels in a string */
        int count = 0;
        for(int ch=0; ch<myString.length(); ch++){
            char i = myString.charAt(ch);
            if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u'){
                count++;
            }
        }System.out.println("Total vowels in this string= "+count);
    }

    public static void displayMiddleChar(String aString){
        /*Question:03 Write a Java method to display the middle character of a string.
        Note: a) If the length of the string is even there will be two middle characters.
        b) If the length of the string is odd there will be one middle character. */
        if(aString.length()%2 == 0){
            char mid1 = aString.charAt((aString.length()/2)-1);
            char mid2 = aString.charAt(aString.length()/2);
            System.out.println("Middle Characters= "+mid1+" "+mid2);
        }
        else{
            char mid = aString.charAt(aString.length()/2);
            System.out.print("Char in the middle= "+mid);
        }
        
    }

    public static boolean isLeapYear(int year){
        boolean isLeap = false;
        if(year%4 == 0){
            isLeap = true;
        }else{
            isLeap = false;
        }
        return isLeap;
    }

    public static void printGreatest(int num1, int num2, int num3){
        if(num1>num2 && num1>num3)
        System.out.println(num1+" is greatest");
        else if(num2>num1 && num2>num3)
        System.out.println(num2+" is the greatest");
        else 
        System.out.println(num3+" is the greatest");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Question01
        System.out.print("Enter first num= ");
        int x = sc.nextInt();
        System.out.print("Enter second num= ");
        int y = sc.nextInt();
        System.out.print("Enter third num= ");
        int z = sc.nextInt();
        System.out.print(displayAverage(x, y, z));

        //Question02
        System.out.print("Enter string: ");
        String myString = sc.nextLine();
        displayVowels(myString);

        //Question03
        System.out.print("Enter string: ");
        String aString = sc.nextLine();
        displayMiddleChar(aString);

        //Question04
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if(isLeapYear(year) == false){
            System.out.println("Not a leap year");
        }else{
            System.out.println("It's a leap year");
        }

        //Question05
        System.out.print("Enter first num= ");
        int a = sc.nextInt();
        System.out.print("Enter second num= ");
        int b = sc.nextInt();
        System.out.print("Enter third num= ");
        int c = sc.nextInt();
        printGreatest(a, b, c);
        
        sc.close();
    }
}