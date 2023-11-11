import java.util.Scanner;
public class ModifArrayNilai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        // Modifikasi statement langkah 5
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        System.out.println();

        //Modifikasi statement langkah 6
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus!");
            }
        }
        System.out.println();

        //Modifikasi Program Menampilkan Status Kelulusan Mahasiswa Berdasarkan Nilai
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.print("Mahasiswa ke-" + i + " lulus!");
            } else
                System.out.println("Mahasiswa ke-" + i + " tidak lulus!");
        }
    }
}