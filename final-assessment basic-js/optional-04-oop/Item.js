class Product {
  constructor(id, name, quantity, price) {
      this.id = id;              // Properti untuk ID barang
      this.name = name;          // Properti untuk nama barang
      this.quantity = quantity;  // Properti untuk jumlah barang
      this.price = price;        // Properti untuk harga barang
  }

  modifyDetails(name, quantity, price) {
      this.name = name;          // Mengubah nama barang
      this.quantity = quantity;  // Mengubah jumlah barang
      this.price = price;        // Mengubah harga barang
  }

  displayDetails() {
      return `ID: ${this.id}, Name: ${this.name}, Quantity: ${this.quantity}, Price: ${this.price}`; // Menampilkan detail barang
  }
}

// Jangan hapus kode di bawah ini!
export default Product;
