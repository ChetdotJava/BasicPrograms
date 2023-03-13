import java.util.Scanner;
public class ReverseArray{
    public static void reversingArray(int array[]){
        int start = 0, end = array.length - 1;

        while(start <= end){
            int temp = 0;
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start ++;
            end --;
        }
        System.out.println("\n\nArray is reversed order: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }

    }

    public static void main(String ags[]){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        short size = inp.nextShort();
        int[] array = new int[size];
        for(int i=0; i<array.length; i++){
            System.out.print("Enter value in Array: ");
            array[i] = inp.nextInt();
        }
        System.out.println("Entered array is--");
        System.out.print("{");
        for(int i=0; i<size; i++){
            System.out.print(array[i]+",");
        }
        System.out.print("}");
        reversingArray(array);
        inp.close();
    }
}