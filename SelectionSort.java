public class SelectionSort {
    public static void selectionSort(int a[]){
        for(int i=0; i<a.length-1; i++){
            int small = i;
            for(int j=i+1; j<a.length; j++){
                if(a[j] < a[small]){
                    small = j;}
            }
            int temp = a[i];
            a[i] = a[small]; //puts small in i th element
            a[small] = temp;
        }
    }
    
    public static void printArray(int[] a){
        for(int i : a){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int a[] ={8,4,1,3};
        selectionSort(a);
        printArray(a);
        }
}
