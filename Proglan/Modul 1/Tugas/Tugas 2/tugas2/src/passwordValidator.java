import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class InvalidPasswordException extends Exception { //custom exception untuk yg ga valid
    public InvalidPasswordException(String errorMessage) {
        super(errorMessage);
    }
}

public class passwordValidator { //method utama check password
    public static void validatepassword(String password) throws InvalidPasswordException { //validasi menggunakan if
        List<String> errorMessages = new ArrayList<>();
        if (password.length() < 8) {
            errorMessages.add("Password harus terdiri dari 8 karakter");
        }
        if (!password.matches(".*[a-z].*")) {
            errorMessages.add("Password harus memiliki minimal satu huruf kecil");
        }
        if (!password.matches(".*[A-Z].*")) {
            errorMessages.add("Password harus memiliki minimal satu huruf besar");
        }
        if (!password.matches(".*[0-9].*")) {
            errorMessages.add("Password harus memiliki minimal satu angka");
        }
        if (!password.matches(".*[!@#$%^&*()].*")) {
            errorMessages.add("Password harus memiliki minimal satu karakter spesial (!@#$%^&*)");
        }
        if (!errorMessages.isEmpty()) {
            throw new InvalidPasswordException(String.join("\n", errorMessages)); //jika ada errorMessages, munculin errorMessages
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;

        while(!valid) {
            System.out.println("Input Password e mas : ");
            String password = scanner.nextLine();

            try {
                validatepassword(password); //validasi password dari method password validate password
                System.out.println("Valid bang");
                valid = true; //klo valid pw nya biar keluar dari loop
            } catch (InvalidPasswordException e) {
                System.out.println("Error : \n" + e.getMessage()); //tangkep exception and munculin error message
                System.out.println("Coba lagi coy\n");
            }
        }

        scanner.close();
    }
}
