public class Saham extends Investasi {
    private double dividen;

    public Saham(int id, String nama, double jumlah, double dividen) {
        super(id, nama, jumlah); // Memanggil constructor parent class
        this.dividen = dividen;
    }

    @Override
    public String getDetail() {
        return super.getDetail() + ", Dividen: " + dividen;
    }

    public double getDividen() { return dividen; }
}
