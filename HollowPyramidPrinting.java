import java.util.Scanner;
public class HollowPyramidPrinting {
    static void printHollowPyramid(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=(row-i); j++){
                System.out.print(" ");
            }if(i < row){
                for(int j=1; j<=((2*i)-1); j++){
                    if(j==1 || j==((2*i)-1)){
                        System.out.print(i);
                    }else{
                        System.out.print(" ");
                    }
                }
            }else{
                for(int j=1; j<=((2*i)-1); j++){
                    System.out.print(i);
                }
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the value of row: ");
        int row = inp.nextInt();
        printHollowPyramid(row);
        inp.close();
    }
}
