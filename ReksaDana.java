public class ReksaDana extends Investasi {
    private double biayaPengelolaan;

    public ReksaDana(int id, String nama, double jumlah, double biayaPengelolaan) {
        super(id, nama, jumlah);
        this.biayaPengelolaan = biayaPengelolaan;
    }

    @Override
    public String getDetail() {
        return super.getDetail() + ", Biaya Pengelolaan: " + biayaPengelolaan;
    }
}
