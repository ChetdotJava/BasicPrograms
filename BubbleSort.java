public class BubbleSort{
    public static void bubbleSort(int array[]){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length-1; j++){
                if(array[j] > array[j+1]){
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
        public static void printArray(int array[]){
            for(int i=0; i<array.length; i++){
                System.out.print(array[i]+" ");
            }
        }
        public static void main(String[] args) {
            int[] array = {5,4,1,3,2};
            bubbleSort(array);
            printArray(array);
        }
}