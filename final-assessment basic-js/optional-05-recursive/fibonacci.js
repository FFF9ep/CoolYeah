function generateFibonacci(n) {
  if (n === 0) {
      return [0]; // Kasus dasar: Deret Fibonacci untuk 0 adalah [0]
  } else if (n === 1) {
      return [0, 1]; // Kasus dasar: Deret Fibonacci untuk 1 adalah [0, 1]
  } else {
      const sequence = generateFibonacci(n - 1); // Rekursi untuk n - 1
      const nextValue = sequence[sequence.length - 1] + sequence[sequence.length - 2]; // Hitung angka Fibonacci berikutnya
      sequence.push(nextValue); // Tambahkan angka berikutnya ke dalam deret
      return sequence; // Kembalikan deret Fibonacci
  }
}

// Jangan hapus kode di bawah ini!
export default generateFibonacci;
