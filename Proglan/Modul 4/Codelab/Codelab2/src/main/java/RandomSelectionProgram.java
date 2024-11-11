import java.util.Random;
import java.util.Scanner;

public class RandomSelectionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Menghasilkan Bilangan Bulat Acak");
            System.out.println("2. Memilih Elemen Acak dari Array");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nilai minimum: ");
                    int min = scanner.nextInt();
                    System.out.print("Masukkan nilai maksimum: ");
                    int max = scanner.nextInt();

                    if (min > max) {
                        System.out.println("Nilai minimum harus lebih kecil atau sama dengan nilai maksimum.");
                    } else {
                        int randomInt = random.nextInt(max - min + 1) + min;
                        System.out.println("Bilangan bulat acak antara " + min + " dan " + max + ": " + randomInt);
                    }
                    break;

                case 2:
                    System.out.print("Masukkan jumlah elemen dalam array: ");
                    int jumlahElemen = scanner.nextInt();
                    scanner.nextLine();

                    if (jumlahElemen <= 0) {
                        System.out.println("Jumlah elemen harus lebih dari 0.");
                    } else {
                        String[] array = new String[jumlahElemen];
                        for (int i = 0; i < jumlahElemen; i++) {
                            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
                            array[i] = scanner.nextLine();
                        }
                        String elemenAcak = array[random.nextInt(jumlahElemen)];
                        System.out.println("Elemen acak dari array: " + elemenAcak);
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari program.");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println();
        }
        scanner.close();
    }
}
