public class PW_Assignment09 {
    public static void printPositive(int a[]){
        /*Question:01 Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array. */
        for(int i=0; i<a.length; i++){
            if(a[i] >= 0){
                System.out.print(a[i]+" ");
            }
        }
    }

    public static void printAtOdd(String[] stringArray){
        /*Question:02 Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all
        strings stored on odd indices of the array. */
        for(int i=0; i<stringArray.length; i++){
            if(i%2 != 0){
                System.out.print(stringArray[i]+" ");
            }
        }
    }

    public static void printAtEven(int[] b){
        /*Question:03 Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even
        elements. */
        for(int elements : b){
            if(elements%2 == 0){
                System.out.print(elements+" ");
            }
        }
    }

    public static void printMinElement(int[] c){
        /*Question:04 Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method
        for calculating the minimum element. */
        int min = c[0];
        for(int i : c){
            if(i < min){
                min = i;
            }
        }
        System.out.println("Minimum element = "+min);
    }

    public static void printPeakElement(int array[]){
        /*Question:05 Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}
        Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor.
        Leftmost and rightmost element cannot be a peak element. */
        for(int i=1; i<array.length-1; i++){
            if(array[i-1]<array[i] && array[i+1]<array[i]){
                System.out.println("Peak element = "+array[i]);
            }
        }
    }

    public static void main(String[] args){
        //Question01
        int[] a = {2, 6, -5, -1, 0, 4, -9};
        printPositive(a);

        //Question02
        String[] stringArray = {"ab","bc","cd","de","ef","fg","gh"};
        printAtOdd(stringArray);

        //Question03
        int[] b = {1,2,3,4,5,6,7,8};
        printAtEven(b);
        
        //Question04
        int c[] = {2, -3, 5, 8, 1, 0, -4};
        printMinElement(c);

        //Question05
        int array[] = {1, 1, 3, 4, 2, 3, 5, 7, 0};
        printPeakElement(array);
    }
}
