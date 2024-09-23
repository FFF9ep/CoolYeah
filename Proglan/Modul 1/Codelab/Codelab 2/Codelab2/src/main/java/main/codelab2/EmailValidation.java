package main.codelab2;

import java.util.Scanner;

// Custom exception untuk email tidak valid
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class EmailValidation {
    // Method untuk validasi email
    public static void validateEmail(String email) throws InvalidEmailException {
        // Memeriksa apakah email diakhiri dengan '@webmail.umm.ac.id'
        if (!email.endsWith("@webmail.umm.ac.id")) {
            throw new InvalidEmailException("Email harus diakhiri dengan '@webmail.umm.ac.id'");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidEmail = false;

        while (!isValidEmail) {
            System.out.println("Masukkan Alamat Email Anda (Harus diakhiri dengan '@webmail.umm.ac.id'):");
            String email = scanner.nextLine().trim();

            try {
                validateEmail(email);  // Validasi email
                isValidEmail = true;   // Jika valid, ubah status email menjadi valid
                System.out.println("Alamat Email Anda Adalah: " + email);
            } catch (InvalidEmailException e) {
                // Jika email tidak valid, tampilkan pesan kesalahan
                System.out.println("Kesalahan validasi email: " + e.getMessage());
                System.out.println("Silakan Coba Lagi");
            }
        }

        scanner.close();  // Menutup Scanner setelah input selesai
    }
}
