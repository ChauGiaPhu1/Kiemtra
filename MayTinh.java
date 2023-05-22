package quanlyphongmay;
class MayTinh {
    String tenMay;
    private String tinhTrang;

    public MayTinh(String tenMay) {
        this.tenMay = tenMay;
        this.tinhTrang = "Sẵn sàng";
    }

    public void kiemTraTinhTrang() {
        System.out.println("Máy tính " + tenMay + " - Tình trạng: " + tinhTrang);
    }

    public void capNhatTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
