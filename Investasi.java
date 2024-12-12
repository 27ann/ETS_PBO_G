public class Investasi {
    private int id;
    private String nama;
    private double jumlah;

    public Investasi(int id, String nama, double jumlah) {
        this.id = id;
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public String getDetail() {
        return "ID: " + id + ", Nama: " + nama + ", Jumlah: " + jumlah;
    }

    public int getId() { return id; }
    public String getNama() { return nama; }
    public double getJumlah() { return jumlah; }
}
