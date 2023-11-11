import java.util.Scanner;

public class ModifikasiArrayBilangan26 {
    public static void main(String[] args) {

        // Modifikasi inisialisasi elemen array saat deklarasi array & ubah statement
        int[] bil = {5, 13, -7, 17};

        for (int i = 0; i < 4; i++) {
            System.out.println(bil[i]);
        }

        System.out.println();
        // Modifikasi statement mengganti kondisi
        for (int i = 0; i <= 4; i++) {
            System.out.println(bil[i]);
        }
    }
}