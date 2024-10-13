package SIMPLESORT;

class SimpleSort {
    int[] array;
    int size;
    int nItem = 0;

    public SimpleSort(int size) {
        this.size = size;
        array = new int[size];
    }

    public void insert(int newData) {
        array[nItem++] = newData;
    }

    public void swap(int indexX, int indexY) {
        int temp = array[indexX];
        array[indexX] = array[indexY];
        array[indexY] = temp;
    }

    public void display() {
        for (int i = 0; i < nItem; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Bidirectional bubble sort (cocktail shaker sort)
    public void bubbleSort() {
        int batasKiri = 0;
        int batasKanan = size - 1;

        while (batasKiri < batasKanan) {
            // Bawa item terbesar dari kiri ke kanan
            for (int i = batasKiri; i < batasKanan; i++) {
                if (array[i] > array[i + 1]) {
                    swap(i, i + 1);
                }
            }
            // Kurangi batas kanan karena item terbesar sudah ditempatkan
            batasKanan--;

            // Bawa item terkecil dari kanan ke kiri
            for (int i = batasKanan; i > batasKiri; i--) {
                if (array[i] < array[i - 1]) {
                    swap(i, i - 1);
                }
            }
            // Tambahkan batas kiri karena item terkecil sudah ditempatkan
            batasKiri++;
        }
    }
}

public class DemoSimpleSort {
    public static void main(String[] args) {
        SimpleSort ss = new SimpleSort(10);
        ss.insert(20);
        ss.insert(10);
        ss.insert(50);
        ss.insert(40);
        ss.insert(30);
        ss.insert(90);
        ss.insert(100);
        ss.insert(60);
        ss.insert(80);
        ss.insert(70);

        System.out.println("Sebelum diurutkan:");
        ss.display();

        ss.bubbleSort();

        System.out.println("Setelah diurutkan:");
        ss.display();
    }
}
