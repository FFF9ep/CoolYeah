class InventoryManager {
  constructor() {
      this.inventoryItems = []; // Properti untuk menyimpan daftar barang
  }

  addNewItem(item) {
      this.inventoryItems.push(item); // Menambahkan barang ke dalam daftar
  }

  deleteItemById(id) {
      this.inventoryItems = this.inventoryItems.filter(item => item.id !== id); // Menghapus barang berdasarkan id
  }

  showAllItems() {
      return this.inventoryItems.map(item => item.displayDetails()).join('\n'); // Mengembalikan rincian semua barang
  }
}

// Jangan hapus kode di bawah ini!
export default InventoryManager;
