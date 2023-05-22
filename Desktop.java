package quanlyphongmay;
class Desktop extends MayTinh {
    private String kichThuoc;

    public Desktop(String tenMay, String kichThuoc) {
        super(tenMay);
        this.kichThuoc = kichThuoc;
    }

    @Override
    public void kiemTraTinhTrang() {
        System.out.println("Máy tính Desktop " + getTenMay() + " - Kích thước: " + kichThuoc);
        super.kiemTraTinhTrang();
    }

    public String getTenMay() {
        return super.tenMay;
    }
}
