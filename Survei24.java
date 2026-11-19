import java.util.Scanner;

public class Survei24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int JUMLAH_RESPONDEN = 10;
        final int JUMLAH_PERTANYAAN = 6;

        int[][] survei = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];

        //1.
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                System.out.print(" Nilai pertanyaan ke-" + (j + 1) + " (1-5): ");
                survei[i][j] = sc.nextInt();
            }
        }

        //2.
        System.out.println("=== Rata-rata Setiap Responden ===");
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            double totalPerResponden = 0;
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                totalPerResponden += survei [i][j];
            }
            double rataResponden = totalPerResponden / JUMLAH_PERTANYAAN;
            System.out.println("Responden ke-" + (i + 1) + ": " + rataResponden);
        }

        //3.
        System.out.println("=== Rata-rata Setiap Pertanyaan ===");
        for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
            double totalPerPertanyaan = 0;
            for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
                totalPerPertanyaan += survei[i][j];
            }
            double rataPertanyaan = totalPerPertanyaan / JUMLAH_RESPONDEN;
            System.out.println("Pertanyaan ke- " + (j + 1) + ": " + rataPertanyaan);
        }

        //4.
        double totalKeseluruhan = 0;
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                totalKeseluruhan += survei[i] [j];
            }
        }
        double rataKeseluruhan = totalKeseluruhan / (JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN);
        System.out.println("=== Rata-rata Keseluruhan ===");
        System.out.println("Rata-rata keseluruhan: " + rataKeseluruhan);
    }
}
