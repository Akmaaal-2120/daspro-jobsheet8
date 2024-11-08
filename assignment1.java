import java.util.Scanner;
public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        int row = sc.nextInt();

        if (row >= 3){
            for(int r = 1; r <=row; r++){
                for(int c = 1; c <= row; c++){
                    if(r == row || c == row || c == 1 || r == 1){
                        System.out.print(row);
                    }else{
                        System.out.print(" ");
                    }     
                }
                System.out.println();
            }
        }else{
            System.out.println("Input is at least 3!");
        }
    }
    
}