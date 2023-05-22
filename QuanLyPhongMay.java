package quanlyphongmay;
public class QuanLyPhongMay {
    public static void main(String[] args) {
        MayTinh mayTinh1 = new Desktop("Desktop 1", "ATX");
        MayTinh mayTinh2 = new Laptop("Laptop 1", 2.5);

        mayTinh1.kiemTraTinhTrang();
        mayTinh2.kiemTraTinhTrang();

        mayTinh1.capNhatTinhTrang("Đang sử dụng");
        mayTinh2.capNhatTinhTrang("Đang sửa chữa");

        mayTinh1.kiemTraTinhTrang();
        mayTinh2.kiemTraTinhTrang();
    }
}
