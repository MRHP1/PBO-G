public class Main {
    public static void main(String[] args) {
        MakhlukHidup manusia = new Manusia();
        MakhlukHidup hewan = new Hewan();
        MakhlukHidup tumbuhan = new Tumbuhan();

        manusia.info();
        manusia.bernafas();
        manusia.makan();

        System.out.println();

        hewan.info();
        hewan.bernafas();
        hewan.makan();

        System.out.println();

        tumbuhan.info();
        tumbuhan.bernafas();
        tumbuhan.makan();
    }
}
