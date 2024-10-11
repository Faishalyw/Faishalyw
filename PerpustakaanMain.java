 
// Kelas Utama: PerpustakaanMain
public class PerpustakaanMain {
    public static void main(String[] args) {
        // Membuat objek dari kelas anak Fiksi
        Fiksi fiksi1 = new Fiksi("Harry Potter", "J.K. Rowling", "Fantasi");
        Fiksi fiksi2 = new Fiksi("The Da Vinci Code", "Dan Brown", "Thriller");

        // Membuat objek dari kelas anak NonFiksi
        NonFiksi nonFiksi1 = new NonFiksi("Sapiens", "Yuval Noah Harari", "Sejarah");
        NonFiksi nonFiksi2 = new NonFiksi("The Power of Habit", "Charles Duhigg", "Psikologi");

        // Membuat objek dari kelas anak Pengunjung
        Pengunjung pengunjung1 = new Pengunjung("IPUL", "A001", "Tamsis");
        Pengunjung pengunjung2 = new Pengunjung("UPI", "A002", "Piyungan");

        // Menampilkan informasi buku
        fiksi1.tampilkanInfo();
        fiksi2.tampilkanInfo();
        nonFiksi1.tampilkanInfo();
        nonFiksi2.tampilkanInfo();

        // Menampilkan informasi anggota
        pengunjung1.tampilkanInfoAnggota();
        pengunjung2.tampilkanInfoAnggota();
    }
}