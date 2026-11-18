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
                        //Modifikasi pertanyaan 4
                        else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi oleh " + penonton[baris -1][kolom - 1] + "! Pilih baris dan kolom lain.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            break;
                        }
                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    pilihan = sc.nextLine();
                    if (pilihan.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                System.out.println("--- Daftar Penonton ---");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Baris " + (i + 1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        //Modifikasi pertanyaan 5
                        String tampil = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.print(tampil + "\t" );
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.println("Terimakasih, program selesai.");
                break;
            } else {
                System.out.println("Menu tidak valid!");
            }
        }
    }
}
