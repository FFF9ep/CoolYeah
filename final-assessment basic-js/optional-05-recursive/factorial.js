function calculateFactorial(n) {
  if (n <= 1) {
      return 1; // Kasus dasar: Faktorial dari 0 atau 1 adalah 1
  }
  return n * calculateFactorial(n - 1); // Rekursi: n * faktorial(n - 1)
}

// Jangan hapus kode di bawah ini!
export default calculateFactorial;
