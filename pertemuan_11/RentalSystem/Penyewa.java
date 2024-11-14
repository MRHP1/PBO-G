public class Penyewa {
    private String nama;
    private Kendaraan kendaraan;

    public Penyewa(String nama) {
        this.nama = nama;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public String getNama() {
        return nama;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }
}
