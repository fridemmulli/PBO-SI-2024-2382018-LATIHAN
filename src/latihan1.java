public class latihan1 {
        public static void main(String[] args) {
            int[] array = {1, 2, 3};
            int jumlah = 0;

            // Menggunakan perulangan for untuk menjumlahkan setiap elemen
            for (int i = 0; i < array.length; i++) {
                jumlah += array[i];
            }

            System.out.println("Jumlah semua elemen dalam array adalah: " +jumlah);
       }
    }
