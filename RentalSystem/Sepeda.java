public class Sepeda extends Kendaraan {
    private String jenisSepeda;

    public Sepeda(String merk, String model, int tahunProduksi, String jenisSepeda) {
        super(merk, model, tahunProduksi);
        this.jenisSepeda = jenisSepeda;
    }

    @Override
    public String getInfo() {
        return "Sepeda: " + merk + " " + model + " (" + tahunProduksi + "), Jenis: " + jenisSepeda;
    }
}