import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    private List<Kendaraan> kendaraanList = new ArrayList<>();
    private List<Penyewa> penyewaList = new ArrayList<>();

    public void tambahKendaraan(Kendaraan kendaraan) {
        kendaraanList.add(kendaraan);
    }

    public void sewaKendaraan(Penyewa penyewa, Kendaraan kendaraan) {
        penyewaList.add(penyewa);
        penyewa.setKendaraan(kendaraan);
    }

    public void tampilkanKendaraanTersedia() {
        System.out.println("Kendaraan Tersedia:");
        for (Kendaraan kendaraan : kendaraanList) {
            System.out.println(kendaraan.getInfo());
        }
    }

    public void tampilkanDaftarPenyewa() {
        System.out.println("Daftar Penyewa:");
        for (Penyewa penyewa : penyewaList) {
            System.out.println("Nama: " + penyewa.getNama() + ", Kendaraan: " + penyewa.getKendaraan().getInfo());
        }
    }
}