import java.util.Scanner;

/* Q1 - Write a Java method to compute the average of three numbers */
class CalculateAverage {
    int x, y, z;
    public CalculateAverage(int a, int b, int c){
        x=a; y=b; z=c;
    }
    public void printAverage(){
        System.out.print("Average is: "+((x+y+z)/3)+"\n");
    }
    public void countVowel(String myString){
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'a' || myString.charAt(i) == 'e' || myString.charAt(i) == 'i' || myString.charAt(i) == 'o' || myString.charAt(i) == 'u'){
                System.out.print(myString.charAt(i)+"\t");
            }
        }
        }
}

 /* Q2 - Write a Java method to count all vowels in a string */
class PrintVowels{
    public void countVowel(String myString){
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'a' || myString.charAt(i) == 'e' || myString.charAt(i) == 'i' || myString.charAt(i) == 'o' || myString.charAt(i) == 'u'){
                System.out.print("Vowel in string: ");
                System.out.print(myString.charAt(i)+"\t");
            }
        }
        }
}

/* Q3 - Write a Java method to display the middle character of a string.
    Note: a) If the length of the string is even there will be two middle characters.
    b) If the length of the string is odd there will be one middle character. */
class DisplayMiddle{
    String myString;
    public DisplayMiddle(String s){
        myString = s;
    }
    public void printMiddle(){
        for(int i=0; i<myString.length(); ){
            int stringLength = myString.length();
            if(stringLength % 2 != 0){
                System.out.println("Middle letter: "+myString.charAt(stringLength/2));
                break;
            }else{
                System.out.println("Middle letters: "+myString.charAt((stringLength/2)-1)+" and "+myString.charAt(stringLength/2));
                break;
            }
        }
    }
}

/* Q4 - Write a Java method to check whether a year (integer) entered by the user is a leap year or not. */
class LeapYear{
    int y;
    public LeapYear(int year){
        y = year;
    }
    public void tellLeap(){
        if(y%4 == 0){
            System.out.println("This is a Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}

/* Q5 - Write a Java method to find the smallest number among three numbers. */
class SmallestNum{
    int num1,num2,num3;
    public SmallestNum(int a, int b, int c){
        num1 = a; num2 = b; num3 = c;
    }
    public void smallestNum(){
        if(num1<num2 && num1<num3){
            System.out.println("Smallest is: "+num1);
        }else if(num2<num1 && num2<num3){
            System.out.println("Smallest is: "+num2);
        }else{
            System.out.println("Smallest is: "+num3);
        }
    }
}
public class PW_Assignment08{ 
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter first num: ");
        int num1 = inp.nextInt();
        System.out.print("Enter second num: ");
        int num2 = inp.nextInt();
        System.out.print("Enter third num: ");
        int num3 = inp.nextInt();
        CalculateAverage avg = new CalculateAverage(num1, num2, num3);
        avg.printAverage();
        SmallestNum sNum = new SmallestNum(num1, num2, num3);
        sNum.smallestNum();
        
        System.out.print("Enter string: ");
        String myString = inp.nextLine();
        PrintVowels vow = new PrintVowels();
        vow.countVowel(myString);  
        DisplayMiddle dMiddle = new DisplayMiddle(myString);
        dMiddle.printMiddle();  

        System.out.println("Enter year: ");
        int year = inp.nextInt();
        LeapYear lYear = new LeapYear(year);
        lYear.tellLeap();
        inp.close(); 
    }
}
