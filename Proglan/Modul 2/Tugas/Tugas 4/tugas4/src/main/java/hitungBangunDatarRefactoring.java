import java.util.Scanner;

public class hitungBangunDatarRefactoring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                hitungLuasPersegi(scanner);
                break;
            case 2:
                hitungLuasPersegiPanjang(scanner);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        scanner.close();
    }

    public static void hitungLuasPersegi(Scanner scanner) {
        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = scanner.nextDouble();
        double luas = calculateLuasPersegi(sisi);
        printHasil("Persegi", luas);
    }

    public static void hitungLuasPersegiPanjang(Scanner scanner) {
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();
        double luas = calculateLuasPersegiPanjang(panjang, lebar);
        printHasil("Persegi Panjang", luas);
    }

    public static double calculateLuasPersegi(double sisi) {
        return sisi * sisi;
    }

    public static double calculateLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static void printHasil(String bentuk, double luas) {
        System.out.println("Luas " + bentuk + " adalah: " + luas);
    }
}
