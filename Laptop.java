package quanlyphongmay;
class Laptop extends MayTinh {
    private final double trongLuong;

    public Laptop(String tenMay, double trongLuong) {
        super(tenMay);
        this.trongLuong = trongLuong;
    }

    @Override
    public void kiemTraTinhTrang() {
        System.out.println("Máy tính Laptop " + getTenMay() + " - Trọng lượng: " + trongLuong + "kg");
        super.kiemTraTinhTrang();
    }

    public String getTenMay() {
        return super.tenMay;
    }
}
