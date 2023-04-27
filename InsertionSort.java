public class InsertionSort {
    public static void insertionSort(int[] a){
        for(int i=1; i<a.length; i++){
            for(int j=i; j>0; j--){
                if(a[j] < a[j-1]){
                //swap
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                }
            }
        }
    }
    
    public static void printArray(int[] a){
        for(int i : a){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int a[] ={8,4,1,3};
        insertionSort(a);
        printArray(a);
        }
}
