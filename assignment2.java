import java.util.Scanner;
public class assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, sports, poly;

        System.out.print("Enter the number of polytechnic register : ");
        int participant = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= participant; i++){
            System.out.print("Enter your Polytechnic : ");
            poly = sc.nextLine();
            for(int n = 1; n <= 4; n++){
                System.out.print("Enter your Sports : ");
                sports = sc.nextLine();
                System.out.println();
                System.out.println("Athlete for " + sports);
                for(int m = 1; m <= 5; m++){
                    System.out.print("Enter your Athlete : ");
                    name = sc.nextLine();
                    System.out.println("Polytechnic : " + poly + "\nName : " + name);
                }
                System.out.println();
            }
        }
    }
}
