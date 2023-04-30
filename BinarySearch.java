public class BinarySearch{
    public static int binarySearch(int a[], int key){
        int start = 0, end = a.length-1;
        while(start <= end){
        int mid = (start+end)/2;
        if(a[mid] == key){
            return mid;
        }
        else if(a[mid] < key){
        //search on the right side
        start = mid +1;
        }
        else{
            end = mid -1;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
    int[] a = {1,2,3,4,5};
    int key = 5;
    System.out.println("Index= "+binarySearch(a, key));
    
}
}
    

