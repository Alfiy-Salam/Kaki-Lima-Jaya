package com.kakilimajaya.util;

// Mengimpor kelas-kelas yang dibutuhkan untuk koneksi database dari library standar Java (JDBC)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

    // --- Detail Koneksi Database Kita ---
    // Alamat ini menunjuk ke service 'db' di port 3306, dan langsung memilih database 'kaki_lima_jaya_db'
    private static final String JDBC_URL = "jdbc:mysql://db:3306/kaki_lima_jaya_db";
    
    // Username untuk login ke MySQL
    private static final String USERNAME = "root";
    
    // Password yang kita atur di file docker-compose.yml
    private static final String PASSWORD = "kakilimajaya11";

    /**
     * Ini adalah method static yang bisa kita panggil dari mana saja
     * untuk mendapatkan sebuah koneksi aktif ke database.
     */
    public static Connection getConnection() {
        try {
            // Mencoba membuat dan mengembalikan koneksi menggunakan detail di atas
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            System.out.println("Koneksi ke database BERHASIL!");
            return connection;
        } catch (SQLException e) {
            // Ini akan dieksekusi jika koneksi gagal (misal: password salah, server mati)
            // 'e.getMessage()' akan menampilkan pesan error dari database.
            System.err.println("Koneksi ke database GAGAL! Error: " + e.getMessage());
            return null; // Mengembalikan 'null' yang menandakan tidak ada koneksi.
        }
    }
}