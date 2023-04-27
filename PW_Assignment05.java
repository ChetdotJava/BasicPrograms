import java.util.Scanner; 
public class PW_Assignment05{ 
    public static void  armstrongNum(int num){ 
        int isArmNum = num, number = 0;
        while(isArmNum != 0){
            int rem = isArmNum % 10;
            number += Math.pow(rem,3);
            isArmNum /= 10;
        }
        if(number == num){
            System.out.print(number+" ");
        }
    } 

    public static void isPrime(int num){
        boolean isPrime = false;
        for(int i=1; i<num; i++){
            if(num == 2){
                System.out.print(2);
            }
                if(num%i == 0 ){isPrime = false;}
                else{isPrime = true;}

            }
        if(isPrime == true){
            System.out.println(num+" ");
        }
        else{System.out.print("not prime");}
        }
    
    public static void main(String[] args){
        // int range = 10;
        // for(int i=1; i<=range; i++){
            isPrime(12);
        // }
     
    Scanner sc = new Scanner(System.in); 
    /* Question:01  
    Write a program to print Fibonacci series of n terms where n is input by user. 
     */ 
    // System.out.print("Enter lmit: "); 
    // int limit = sc.nextInt(); 
    // int n1 = 0, n2 = 1; 
    // System.out.print(n1+" "+n2+" "); 
    // for(int i=2; i<=limit; i++){ 
    //     int n = n2 + n1;  
    //     System.out.print(n+" "); 
    //     int temp = n2; 
    //     n2 = n; 
    //     n1 = temp; 
    // } 
 
    //Question:02 
    /*int sum = 0; 
    System.out.print("Want to enter num? press y: "); 
    char choice = sc.next().charAt(0); 
    if(choice == 'y' || choice=='Y'){ 
    do{ 
    System.out.print("Enter number: "); 
    int num = sc.nextInt(); 
    if(num >= 0){ 
        System.out.println(num+" "); 
        sum+=num; 
    } 
    else{ 
        System.out.print("Sum: "+sum); 
        System.out.println("EXIT !\n-1"); 
        System.exit(0); 
    } 
    System.out.println("Want to enter num? press y: "); 
    choice = sc.next().charAt(0); 
    }while(choice=='y' || choice=='Y'); 
    System.out.print("Sum: "+sum); 
     
} 
else{ 
    System.out.print("Sum: "+sum); 
    System.out.println("EXIT !"); 
    System.exit(0); 
}*/ 
 
/* Question:03 
 Write a program to calculate the factorial of a number. 
 */ 
// System.out.print("Enter num to calculate factorial: "); 
// int num = sc.nextInt(); 
// long factorial = 1; 
// if(num==0 || num==1){ 
//     System.out.println("Factorial is = 1"); 
// }else{ 
//     for(int i=1; i<=num; i++){ 
//         factorial*=i; 
//     }System.out.println("Factorial is = "+factorial); 
// } 
 
/* Question:03 
Write a program to print all Armstrong numbers between 1 to n. 
 */ 
//fn for calculatig armstrong number has been defined on the top of the program
/*System.out.print("Enter range to calculate armstrong number: ");
int range = sc.nextInt();
System.out.println("--Printing armstrong numbers--");
for(int i=100; i<=range; i++){
    armstrongNum(i);
}*/
/*int row = 15;
for(int i=1; i<=row; i++){
           for(int j=1; j<=row; j++){
               if(j == ((row/2)+1) || i == ((row/2)+1) ){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
           }System.out.println();
       }
       */
      /*int size = 5; //length of pattern is 5 only, the below part is the upside down
      //version of top part with 5th line in the middle, with total of (2n-1) lines
      int alpha = 65; //ASCII code for first capital letter
      int num = 0; //will increment alpha as char progresses
      for (int i = 1; i <= size; i++) {
      for (int j = size; j > i; j--) {
      System.out.print(" "); //top half until the spaces need to be printed
      }
      for (int k = 0; k < i * 2 - 1; k++) {
      System.out.print((char)(alpha+num++));//top half until the char need to
      //be printed, next char can be achieved by incrementing the ASCII code by 1
      }
      num = 0;
      System.out.println();
      }
      for (int i = 1; i <= size - 1; i++) {
      for (int j = 0; j < i; j++) { //bottom half
      System.out.print(" ");
      }
      for (int k = (size - i) * 2 - 1; k > 0; k--) {
      System.out.print((char)(alpha+num++));
      }
      num = 0;
      System.out.println();
      }*/


//Question:08


sc.close();
}
}


