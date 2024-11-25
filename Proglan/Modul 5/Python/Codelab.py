import pandas as pd


def input_data_mahasiswa():
    data = []
    nama_mahasiswa = set()

    print("Input data mahasiswa, ketik 'selesai' untuk menghentikan program")
    while True:
        nama = input("Masukkan Nama: ")
        if nama.lower() == 'selesai':
            break

        if nama in nama_mahasiswa:
            print("Nama sudah ada, masukkan nama yang berbeda.")
            continue

        nama_mahasiswa.add(nama)
        semester = input("Masukkan Semester: ")
        mata_kuliah = input("Masukkan Mata Kuliah: ")
        data.append([nama, semester, mata_kuliah])
        print("Data berhasil ditambahkan!")

    return data


def simpan_data_ke_excel(data):
    df = pd.DataFrame(data, columns=["Nama", "Semester", "Mata Kuliah"])
    df.to_excel("data_mahasiswa.xlsx", index=False)
    print("Data telah disimpan ke dalam file data_mahasiswa.xlsx")


if __name__ == "__main__":
    data_mahasiswa = input_data_mahasiswa()
    simpan_data_ke_excel(data_mahasiswa)
