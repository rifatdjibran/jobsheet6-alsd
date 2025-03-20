import java.util.Scanner;

public class MahasiswaDemo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi18 list = new MahasiswaBerprestasi18();

        for (int i = 0; i < 5; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1) + ":");

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa18 m = new Mahasiswa18(nim, nama, kelas, ipk);
            list.tambah(i, m);
        }

        System.out.println("\nData mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT (ASC):");
        list.selectionSort();
        list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan INSERTION SORT (DESC):");
        list.insertionSort();
        list.tampil();

        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.bubbleSort();
        list.tampil();

        sc.close();
    }
}
