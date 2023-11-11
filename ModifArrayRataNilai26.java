import java.util.Scanner;
public class ModifArrayRataNilai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jmlMahasiswa];
        double totalLulus = 0, totalTdkLulus = 0;
        double rata;
        int lulus = 0, tdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                lulus++;
                totalLulus += nilaiMhs[i];
            } 
            if (nilaiMhs[i] < 70) {
                tdkLulus++;
                totalTdkLulus += nilaiMhs[i];
            }
        }

        rata = totalLulus/lulus;
        System.out.println("Rata-rata nilai lulus = " + rata);
        rata = totalTdkLulus/tdkLulus;
        System.out.println("Rata-rata nilai tidak lulus = " + rata);

    }
}