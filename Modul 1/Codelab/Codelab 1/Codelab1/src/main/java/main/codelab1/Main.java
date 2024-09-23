package main.codelab1;

public class Main {

    public static void main(String[] args) {

        int[] angka = {22, 67, 31, 11, 5};
        int hasil = hitungTotal(angka);
        System.out.println("Hasilnya adalah: " + hasil);
    }

    public static int hitungTotal(int[] array) {
        int hasil = 0;

        // Perbaikan pada for-loop yang awalnya dari indeks 1
        for (int i = 0; i < array.length; i++) {  // Loop dari indeks 0 hingga panjang array

            hasil += array[i];  // Menambahkan elemen array ke variabel hasil
        }
        return hasil;  // Mengembalikan hasil total
    }
}
