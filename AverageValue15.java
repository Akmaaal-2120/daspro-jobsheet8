import java.util.Scanner;
public class AverageValue15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int i, j;
       float nilai, totalNilai, rataNilai;

       i = 1;
       while (i<=5) {
        System.out.println("Input Nilai Mahasiswa ke " + i);
        totalNilai = 0;
        for (j=1; j<=5; j++ ){
            System.out.print("Nilai ke-" + j + " = ");
            nilai = sc.nextInt();
            totalNilai += nilai;
        }
        rataNilai = totalNilai/5;
        System.out.println("Rata - Rata Nilai Mahasiswa ke " + i + " Adalah " + rataNilai);
        i++;
       }

    }    
}
