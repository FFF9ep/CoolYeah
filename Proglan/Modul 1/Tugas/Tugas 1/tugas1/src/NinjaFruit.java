import java.util.Arrays; //harusnya di import dulu
import java.util.ArrayList; //harusnya di import
import java.util.List;

public class NinjaFruit {
    public static void main(String[] args) {
        List<String> buah = Arrays.asList("apple", "pisang", "kiwi", "anggur", "semangka"); //Listnya salah harusnya <>

        System.out.println("Total huruf : " + calculateTotalLenght(buah));
        System.out.println("Kata Terpanjang : " + findLongestWord(buah));
        System.out.println("Daftar kata dalam huruf kapital : " + capitalizeWords(buah));
        System.out.println("Panjang masing - masing kata : " + wordLengths(buah));
    }

    public static int calculateTotalLenght(List<String> words) { //Menghitung jumlah huruf
        int totalLenght = 0;
        for (int i = 0; i < words.size(); i++) { //karena indeks dimulai dari 0 harusnya pakai <
            totalLenght += words.get(i).length();
        }
        return totalLenght;
    }

    public static String findLongestWord(List<String> words) { //Menemukan kata terpanjang
        if (words.isEmpty()) {
            throw new IllegalArgumentException("List Kosong");
        }
        String longestWord = "";
        for (String word : words) {
            if (word != null && word.length() > longestWord.length()) {
                longestWord = word;
            } /*else if (word != null && word.length() <= longestWord.length()) {
                longestWord = word;
            }*/ //ga perlu karna cuma ngebandingin & perbarui kata terpanjang
        }
        return longestWord;
    }

    public static List<String> capitalizeWords(List<String> words) { //Mengubah setiap huruf jadi kapital
        List<String> capitalized = new ArrayList<>();
        for (String word : words) {
            capitalized.add(word.toUpperCase()); //salah karena yang diperluin itu semua uppercase bukan huruf pertama
        }
        return capitalized;
    }

    public static List<Integer> wordLengths(List<String> words) { //Menghitung panjang kata
        List<Integer> lengths = new ArrayList<>();
        for (String word : words) {
            if (word != null) { //salah karena maunya itu tambahin panjang dari kata yang tidak null
                lengths.add(word.length()); //tambahin panjang kata jika tidak null
            }
        }
        return lengths;
    }

}
