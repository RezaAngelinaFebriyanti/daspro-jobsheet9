import java.util.Scanner;
public class ModifLinearSearch26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Modifikasi Percobaan 4
        System.out.print("Masukkan jumlah elemen array : ");
        int jmlElemen = sc.nextInt();
        int[] elemen = new int[jmlElemen];
        for (int i = 0; i < elemen.length; i++) {
            System.out.print("Masukkan elemen array ke-" + (i) + " : ");
            elemen[i] = sc.nextInt();
        }
        
        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc.nextInt();
        for (int i = 0; i < elemen.length; i++) {  
            if (elemen[i] == key) {
                System.out.print("Key ada di posisi indeks ke-" + (i));
                int hasil = i;
                break;
            } else //Modif menampilkan key tidak ditemukan
                System.out.print("Key tidak ditemukan");
                break;
        }

    }
}