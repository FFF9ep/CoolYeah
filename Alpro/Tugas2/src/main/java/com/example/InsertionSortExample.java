package com.example;

import java.util.Arrays;

public class InsertionSortExample {

    // Metode untuk mengurutkan dalam urutan menurun
    public static void insertionSort2(int[] array) {
        int n = array.length;

        // Perulangan untuk setiap elemen mulai dari elemen kedua
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Memindahkan elemen larik [0..i-1] yang lebih kecil dari kunci
            // ke satu posisi di depan posisi mereka saat ini
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    // Metode untuk mengurutkan dalam urutan menaik mulai dari sisi kanan
    public static void insertionSort3(int[] array) {
        int n = array.length;

        // Perulangan dimulai dari elemen kedua hingga terakhir dan bergerak ke kiri
        for (int i = n - 2; i >= 0; i--) {
            int key = array[i];
            int j = i + 1;

            // Memindahkan elemen larik [i+1..n-1] yang lebih besar dari kunci
            // ke satu posisi di belakang posisi mereka saat ini
            while (j < n && array[j] < key) {
                array[j - 1] = array[j];
                j = j + 1;
            }
            array[j - 1] = key;
        }
    }

    // Method print array
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array1 = {20, 50, 90, 30, 10, 40, 70, 80, 100, 60};
        int[] array2 = {20, 50, 90, 30, 10, 40, 70, 80, 100, 60};

        System.out.println("Original Array:");
        printArray(array1);

        // Mengurutkan array1 dalam urutan menurun
        insertionSort2(array1);
        System.out.println("\nHasil (insertionSort2):");
        printArray(array1);

        // Mengurutkan array2 dalam urutan menaik mulai dari kanan
        insertionSort3(array2);
        System.out.println("\nhasil (insertionSort3):");
        printArray(array2);
    }
}
