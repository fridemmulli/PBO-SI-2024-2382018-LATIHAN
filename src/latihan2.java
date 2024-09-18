 import java.util.Scanner;

    public class latihan2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukkan ukuran tangga (n): ");
            int n = scanner.nextInt();

            for (int i = 1; i <= n; i++) {
                // Cetak spasi di awal baris (kecuali baris terakhir)
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                // Cetak simbol '#' sebanyak i kali
                for (int k = 1; k <= i; k++) {
                    System.out.print("#");
                }

                // Pindah ke baris baru
                System.out.println();
            }
       }
    }
