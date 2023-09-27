package main;

public class TicketManager {

    public static String quanLyGiaVeVaQuaTang(String loaiKhachHang, int soVeMua) {
        if (soVeMua <= 0 || (!loaiKhachHang.equals("Khách hàng bình thường") && !loaiKhachHang.equals("Khách hàng ưu tiên"))) {
            return "Thông tin không hợp lệ";
        }

        int giaVe = 0;
        String quaTang = "Không có quà tặng";

        if (loaiKhachHang.equals("Khách hàng bình thường")) {
            if (soVeMua <= 3) {
                giaVe = 20;
            } else {
                giaVe = 15;
            }
        } else if (loaiKhachHang.equals("Khách hàng ưu tiên")) {
            if (soVeMua <= 5) {
                giaVe = 18;
            } else if (soVeMua <= 10) {
                giaVe = 15;
            } else {
                giaVe = 12;
                quaTang = "Nhận quà tặng đặc biệt";
            }
        }

        return "Giá vé: " + giaVe + "$, " + quaTang;
    }

    public static void main(String[] args) {
        // Test cases
        testTicketPriceAndGift("Khách hàng bình thường", 0);
        testTicketPriceAndGift("Khách hàng bình thường", 2);
        testTicketPriceAndGift("Khách hàng bình thường", 5);
        testTicketPriceAndGift("Khách hàng bình thường", 7);
        testTicketPriceAndGift("Khách hàng bình thường", 15);
        testTicketPriceAndGift("Khách hàng ưu tiên", 0);
        testTicketPriceAndGift("Khách hàng ưu tiên", 2);
        testTicketPriceAndGift("Khách hàng ưu tiên", 5);
        testTicketPriceAndGift("Khách hàng ưu tiên", 7);
        testTicketPriceAndGift("Khách hàng ưu tiên", 15);

        testTicketPriceAndGift("Khách hàng bình thường", 2);
        testTicketPriceAndGift("Khách hàng bình thường", 4);
        testTicketPriceAndGift("Khách hàng bình thường", 7);
        testTicketPriceAndGift("Khách hàng bình thường", -1);
        testTicketPriceAndGift("Khách hàng ưu tiên", 2);
        testTicketPriceAndGift("Khách hàng ưu tiên", 7);
        testTicketPriceAndGift("Khách hàng ưu tiên", 11);
        testTicketPriceAndGift("Khách hàng ưu tiên", 0);
    }

    public static void testTicketPriceAndGift(String loaiKhachHang, int soVeMua) {
        System.out.println("Loại khách hàng: " + loaiKhachHang + ", Số vé đã mua: " + soVeMua);
        String result = quanLyGiaVeVaQuaTang(loaiKhachHang, soVeMua);
        System.out.println(result);
        System.out.println();
    }
}
