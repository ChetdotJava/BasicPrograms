public class PW_Assignment08 {
    /* Q1. Given an array of integers print only the positive values present in the array. */
    public static void printPositive(int array[]){ 
        for(int i=0; i<7; i++){
            if(array[i] >= 0){
                System.out.println("Positive element in array:  "+array[i]);
            }
        }
    }
    /* Q2. Convert the list of Strings  into an array of strings and print all
    strings stored on odd indices of the array. */
    public static void printAtOddIndex(String strArray[]){
        int i=0;
        while(i<7){
            System.out.println("Array element: "+strArray[i]);
            i+=2;
        }}

    /* Q3. Traverse over the elements of the array using for each loop and print all even elements. */
    public static void printElement(int arr[]){
        for(int element : arr){
            if(element%2 == 0)
            System.out.println("Element at Even Index: "+element);
            
        }
    }

    /* Q4. Calculate the minimum element in the array using standard library method for calculating the minimum element. */
    public static void printMin(int ar[]){
        int min = 0;
        for(int i=0; i<7 ; i++){
            min = min<ar[i]?min:ar[i];
        }
        System.out.println("Smallest elements: "+min);
    }

    /* Q5. Find the first peak element in the array Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor.Leftmost and rightmost element cannot be a peak element. */
    public static void peakingArray(int[] peakArray){
        for(int i=1; i<8; i++){
           if(peakArray[i]>peakArray[i-1] && peakArray[i] >peakArray[i+1]){
            System.out.println("Peak Element: "+peakArray[i]);
           }
        }
    }
    
    public static void main(String[] args) {
        int array[] = {2,6,-5, -1, 0, 4, -9};
        printPositive(array);
        
        
        String[] strArray = {"ab", "bc", "cd", "de", "ef", "fg", "gh"}; 
        printAtOddIndex(strArray);
        
        
        int[] arr = {1,2,3,4,5,6,7,8};
        printElement(arr);

        int ar[] = {2,-3, 5, 8, 1, 0, -4};
        printMin(ar);

        int[] peakArray = {1, 1, 3, 4, 2, 3, 5, 7, 0};
        peakingArray(peakArray);
    }
}
