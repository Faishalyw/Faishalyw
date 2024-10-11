// Kelas Induk Pertama: Buku
public class Buku {
    // Properti dengan enkapsulasi
    private String judul;
    private String penulis;

    // Konstruktor tanpa parameter (Overloading Constructor)
    public Buku() {
        this.judul = "Judul Default";
        this.penulis = "Penulis Default";
    }

    // Konstruktor dengan parameter (Overloading Constructor)
    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    // Getter dan Setter untuk properti judul
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Getter dan Setter untuk properti penulis
    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    // Method untuk menampilkan informasi buku (akan di override oleh kelas anak)
    public void tampilkanInfo() {
        System.out.println("Judul Buku: " + judul + ", Penulis: " + penulis);
    }
}
