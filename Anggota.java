 // Kelas Induk Kedua: Anggota
class Anggota {
    private String namaAnggota;
    private String idAnggota;

    // Konstruktor dengan parameter
    public Anggota(String namaAnggota, String idAnggota) {
        this.namaAnggota = namaAnggota;
        this.idAnggota = idAnggota;
    }

    // Getter dan Setter
    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    // Method untuk menampilkan informasi anggota (akan di override oleh kelas anak)
    public void tampilkanInfoAnggota() {
        System.out.println("Anggota: " + namaAnggota + ", ID: " + idAnggota);
    }
}