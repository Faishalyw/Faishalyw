 // Kelas Anak dari Buku: Fiksi
public class Fiksi extends Buku {
    private String genre; 

    public Fiksi(String judul, String penulis, String genre) {
        super(judul, penulis); // Memanggil konstruktor kelas induk
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Overriding method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        System.out.println("Buku Fiksi: " + getJudul() + ", Penulis: " + getPenulis() + ", Genre: " + genre);
    }
}


