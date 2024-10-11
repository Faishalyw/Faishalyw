// Kelas Anak dari Anggota: Pengunjung
public class Pengunjung extends Anggota {
    private String alamat;

    public Pengunjung(String namaAnggota, String idAnggota, String alamat) {
        super(namaAnggota, idAnggota); // Memanggil konstruktor kelas induk
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Overriding method tampilkanInfoAnggota
    @Override
    public void tampilkanInfoAnggota() {
        System.out.println("Pengunjung: " + getNamaAnggota() + ", ID: " + getIdAnggota() + ", Alamat: " + alamat);
    }
}
