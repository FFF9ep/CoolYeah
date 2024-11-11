import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Sebuah Kalimat: ");
        String kalimat = scanner.nextLine();

        String kapital = kalimat.toUpperCase();
        System.out.println("Huruf Kapital: " + kapital);

        System.out.print("Masukkan kata yang ingin diganti: ");
        String kataAsli = scanner.nextLine();

        System.out.print("Masukkan kata pengganti: ");
        String kataPengganti = scanner.nextLine();

        String kalimatDiganti = kalimat.replace(kataAsli, kataPengganti);
        System.out.println("Setelah mengganti kata: " + kalimatDiganti);

        StringBuilder sb = new StringBuilder(kalimat);
        String kalimatTerbalik = sb.reverse().toString();
        System.out.println("Kalimat terbalik: " + kalimatTerbalik);

        scanner.close();
    }
}
