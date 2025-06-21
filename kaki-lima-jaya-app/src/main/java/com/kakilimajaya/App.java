package com.kakilimajaya;

// Mengimpor kelas pembantu yang sudah kita buat dari package 'util'
import com.kakilimajaya.util.DatabaseUtil;
// Mengimpor kelas Connection dari library standar Java
import java.sql.Connection;

/**
 * Kelas utama untuk mengetes koneksi database.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Mencoba menghubungkan ke database...");

        // Memanggil method static getConnection() dari kelas DatabaseUtil kita
        // dan menyimpan hasilnya di variabel 'conn'.
        Connection conn = DatabaseUtil.getConnection();

        // Melakukan pengecekan sederhana terhadap hasil koneksi
        if (conn != null) {
            System.out.println("Status: Terhubung!");
            System.out.println("Selamat! Aplikasi Java Anda sudah bisa berbicara dengan MySQL.");
            // Nanti kita bisa melakukan operasi database (INSERT, SELECT, dll.) di sini
        } else {
            System.out.println("Status: Gagal terhubung.");
            System.out.println("Silakan periksa detail koneksi di DatabaseUtil.java atau log error di atas.");
        }
    }
}