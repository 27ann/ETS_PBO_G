public String tampilkanRincian() {
    String rincian = "";
    for (Investasi i : daftarInvestasi) {
        rincian += i.getDetail() + "\n";
    }
    return rincian;
}
