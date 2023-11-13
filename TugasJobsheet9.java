import java.util.Scanner;
public class TugasJobsheet9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] nilaiMhs = new double[0];

        System.out.print("Masukkan banyak elemen array : ");
        int jmlElemen = sc.nextInt();
        int[] elemen = new int[jmlElemen];
        for (int i = 0; i < elemen.length; i++) {
            System.out.print("Masukkan nilai elemen array ke-" + (i + 1) + " : ");
            elemen[i] = sc.nextInt();
        }
        
        int nilaiTertinggi = elemen[0];
        int nilaiTerendah = elemen[0];
        int total = elemen[0];

        for (int i = 1; i < elemen.length; i++) {
            if (elemen[i] > nilaiTertinggi) {
                nilaiTertinggi = elemen[i];
            }
            if (elemen[i] < nilaiTerendah) {
                nilaiTerendah = elemen[i];
            }
            total += elemen[i];
        }

        int rataRata = (int) total / jmlElemen;

        System.out.println("Nilai Tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai Terendah : " + nilaiTerendah);
        System.out.println("Nilai Rata-rata : " + rataRata);

        
    }
}