 import java.util.Scanner;
    public class latihan3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan kata camelCase: ");
            String camelCaseWord = scanner.nextLine();

            int wordCount = 1; // Mulai dengan 1 kata (kata pertama)
            for (int i = 1; i < camelCaseWord.length(); i++) {
                char currentChar = camelCaseWord.charAt(i);
                char previousChar = camelCaseWord.charAt(i - 1);

                if (Character.isUpperCase(currentChar) && Character.isLowerCase(previousChar)) {
                    wordCount++;
                }
            }

            System.out.println("Jumlah kata dalam " + camelCaseWord + " adalah: " + wordCount);
        }
    }