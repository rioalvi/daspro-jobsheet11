import java.util.Scanner;
public class BioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        //Modifikasi pertanyaan 2
        while (true) {
            System.out.println("=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukan baris (1-" + penonton.length + "): ");
                        baris = sc.nextInt();
                        System.out.print("Masukan kolom (1-" + penonton[0].length + "): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        //Modifikasi pertanyaan 3
                        if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[baris - 1].length) {
                            System.out.println("Nomor baris atau kolom tidak tersedia! Silahkan masukan lagi.");
                        }
                    }
                }
            }
        }
    }
}
