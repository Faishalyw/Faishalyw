 // Kelas Anak dari Buku: NonFiksi
public class NonFiksi extends Buku {
    private String topik; // Misalnya, sejarah, biografi

    public NonFiksi(String judul, String penulis, String topik) {
        super(judul, penulis); // Memanggil konstruktor kelas induk
        this.topik = topik;
    }

    public String getTopik() {
        return topik;
    }

    public void setTopik(String topik) {
        this.topik = topik;
    }

    // Overriding method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        System.out.println("Buku Non-Fiksi: " + getJudul() + ", Penulis: " + getPenulis() + ", Topik: " + topik);
    }
}