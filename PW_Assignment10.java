import java.util.Scanner;
public class PW_Assignment10 {
    static void inputInArray(int[] array,int size){
    Scanner inp = new Scanner(System.in);
    for(int i=0; i<size; i++){
        System.out.print("Enter value in array: ");
        array[i] = inp.nextInt();
    }
    inp.close();
    }

    static void printArrayElements(int[] a){
        for(int elements : a){
            System.out.print(elements+" ");
        }
    }

   /* Q1 - Given an unsorted array arr[] of size N  having both negative and positive integers, place all negative elements at the end of array without changing the order of positive elements and negative elements */ 
   static void printNegAtEnd(int[] a){
    int index = 0;
    int[] negAtEnd = new int[a.length];
    for(int i : a ){
        if(i >= 0){
            negAtEnd[index] = i;
            index++;
        }
    }
    for(int i : a ){
        if(i < 0){
            negAtEnd[index] = i;
            index++;
        }
    }System.out.println("Negative elements at the end: ");
    printArrayElements(negAtEnd);
   }
   
   /* Q2 - Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find union between these two arrays and print the number of elements of the union set.Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union. */
   static void printUnion(int[] a, int[] b, int size, int size2){
    for(int i = 0; i < size2; i++){
       boolean check = false;
        for(int j = 0; j < size; j++){
        if(b[i] == a[j]){
        check = true;
        break;}
        }
        if(!check){
        System.out.print(b[i]+" ");
        }}
    }
        
   /* Q3 - Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct. */
   static void printKthSmallest(int[] a, int k){
    for(int i=0; i<a.length; i++){
        for(int j=0; j<a.length-1; j++){
            if(a[j] > a[j+1]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
    }
    System.out.print("Kth smallest element is: "+a[k-1]);
   }

   /* Q4 - Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.In case of multiple subarrays, return the subarray which comes first on moving from left to right.You need to print the start and end index of answer subarray. */
   static void printSumInSubArray(int[] a, int desiredSum){
    for(int i=0; i<a.length; i++){
        for(int j=0; j<i; j++){
            int add = a[i];
            add += a[j];
            if(add == desiredSum){
            System.out.print("Sub-array: "+a[j]+" "+a[i]+"\n");
            break;}
            
        }}}

   /* Q5 - Write a Java program to test the equality of two arrays. */
   static boolean tellIfEqual(int[] a, int[] b){
    boolean equalArray = false;
    if(a.length == b.length){
    for(int i=0; i<a.length; i++){
        for(int j=0; j<b.length; j++){
            if(a[i] == b[j]){
                equalArray = true;
            }
        }
    }}
    else{
        System.out.println("Arrays are not Equal");
    }
    return equalArray;}
   
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    //Question 01 :
    // System.out.print("Enter the size of the array: ");
    // int size = inp.nextInt();
    // int a[] = new int[size];
    // inputInArray(a, size);
    // printNegAtEnd(a);

    //Question02: 
    System.out.print("Enter the size of the array: ");
    int size = inp.nextInt();
    int a[] = new int[size];
    for(int i=0; i<size; i++){
        System.out.print("Enter value in array: ");
        a[i] = inp.nextInt();
    }printArrayElements(a);
    
    System.out.print("\nEnter the size of the array: ");
    int size2 = inp.nextInt();
    int b[] = new int[size2];
    for(int i=0; i<size2; i++){
        System.out.print("Enter value in array: ");
        b[i] = inp.nextInt();
    }printArrayElements(b);
    printUnion(a, b, size, size2);

    //Question:03
    // System.out.print("Enter the size of the array: ");
    // int size = inp.nextInt();
    // int a[] = new int[size];
    //System.out.print("Enter 'k': ");
    //int k = inp.nextInt();
    //inputInArray(a, size);
    // printKthSmallest(a, k);

    //Question04:
    // System.out.print("Enter the size of the array: ");
    // int size = inp.nextInt();
    // int a[] = new int[size];
    // inputInArray(a, size);
    // printSumInSubArray(a, 2);
    

    //Question05:
    // System.out.print("Enter the size of the array: ");
    // int m = inp.nextInt();
    // int[] a = new int[m];
    // for(int i=0; i<m; i++){
    //     System.out.print("Enter array element: ");
    //     a[i] = inp.nextInt();
    // }
    // System.out.print("Enter the size of the array: ");
    // int n = inp.nextInt();
    // int[] b = new int[n];
    // for(int i=0; i<n; i++){
    //     System.out.print("Enter array element: ");
    //     b[i] = inp.nextInt();
    // }
    // if(tellIfEqual(a, b) == true){
    //     System.out.println("Arrays are equal");
    // }else{
    //     System.out.println("Arrays aren't equal");
    // }
    inp.close();
}

}
