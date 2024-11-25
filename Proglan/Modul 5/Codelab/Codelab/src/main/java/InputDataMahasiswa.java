import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InputDataMahasiswa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> namaMahasiswa = new HashSet<>(); // Untuk melacak nama yang sudah ada
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Data Mahasiswa");

        System.out.println("Masukkan data mahasiswa. Ketik 'selesai' pada nama untuk mengakhiri.");

        while (true) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            if (namaMahasiswa.contains(nama)) {
                System.out.println("Nama sudah ada, masukkan nama yang berbeda.");
                continue;
            }

            namaMahasiswa.add(nama);
            System.out.print("Masukkan Semester: ");
            String semester = scanner.nextLine();
            System.out.print("Masukkan Mata Kuliah: ");
            String mataKuliah = scanner.nextLine();

            int lastRow = sheet.getLastRowNum();
            Row row = sheet.createRow(lastRow + 1);
            row.createCell(0).setCellValue(nama);
            row.createCell(1).setCellValue(semester);
            row.createCell(2).setCellValue(mataKuliah);

            System.out.println("Data berhasil ditambahkan!");
        }

        try (FileOutputStream outputStream = new FileOutputStream("data_mahasiswa.xlsx")) {
            workbook.write(outputStream);
            System.out.println("Data telah disimpan ke dalam file data_mahasiswa.xlsx");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan file: " + e.getMessage());
        }
    }
}