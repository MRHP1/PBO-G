public class Main {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();

        // Tambahkan kendaraan ke dalam sistem
        rentalSystem.tambahKendaraan(new Mobil("Toyota", "Avanza", 2020, 4));
        rentalSystem.tambahKendaraan(new Motor("Honda", "Beat", 2021, 2));
        rentalSystem.tambahKendaraan(new Sepeda("Polygon", "Strattos", 2019, "Balap"));

        // Menampilkan kendaraan yang tersedia
        rentalSystem.tampilkanKendaraanTersedia();

        // Membuat penyewa dan menyewakan kendaraan
        Penyewa penyewa1 = new Penyewa("Risyad");
        Penyewa penyewa2 = new Penyewa("Siti");

        rentalSystem.sewaKendaraan(penyewa1, new Mobil("Toyota", "Avanza", 2020, 4));
        rentalSystem.sewaKendaraan(penyewa2, new Sepeda("Polygon", "Strattos", 2019, "Balap"));

        // Menampilkan daftar penyewa
        rentalSystem.tampilkanDaftarPenyewa();
    }
}
