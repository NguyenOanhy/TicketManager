package test;

import main.TicketManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketManagerTest {

    @Test
    public void testKhachHangBinhThuongSoVeMua0() {
        String loaiKhachHang = "Khách hàng bình thường";
        int soVeMua = 0;
        String expected = "Thông tin không hợp lệ";
        String actual = TicketManager.quanLyGiaVeVaQuaTang(loaiKhachHang, soVeMua);
        assertEquals(expected, actual);
    }

    @Test
    public void testKhachHangBinhThuongSoVeMua2() {
        String loaiKhachHang = "Khách hàng bình thường";
        int soVeMua = 2;
        String expected = "Giá vé: 20$, Không có quà tặng";
        String actual = TicketManager.quanLyGiaVeVaQuaTang(loaiKhachHang, soVeMua);
        assertEquals(expected, actual);
    }

    @Test
    public void testKhachHangBinhThuongSoVeMua5() {
        String loaiKhachHang = "Khách hàng bình thường";
        int soVeMua = 5;
        String expected = "Giá vé: 15$, Không có quà tặng";
        String actual = TicketManager.quanLyGiaVeVaQuaTang(loaiKhachHang, soVeMua);
        assertEquals(expected, actual);
    }

    @Test
    public void testKhachHangBinhThuongSoVeMua7() {
        String loaiKhachHang = "Khách hàng bình thường";
        int soVeMua = 7;
        String expected = "Giá vé: 15$, Không có quà tặng";
        String actual = TicketManager.quanLyGiaVeVaQuaTang(loaiKhachHang, soVeMua);
        assertEquals(expected, actual);
    }

    @Test
    public void testKhachHangBinhThuongSoVeMua15() {
        String loaiKhachHang = "Khách hàng bình thường";
        int soVeMua = 15;
        String expected = "Giá vé: 15$, Không có quà tặng";
        String actual = TicketManager.quanLyGiaVeVaQuaTang(loaiKhachHang, soVeMua);
        assertEquals(expected, actual);
    }

    @Test
    public void testKhachHangUuTienSoVeMua0() {
        String loaiKhachHang = "Khách hàng ưu tiên";
        int soVeMua = 0;
        String expected = "Thông tin không hợp lệ";
        String actual = TicketManager.quanLyGiaVeVaQuaTang(loaiKhachHang, soVeMua);
        assertEquals(expected, actual);
    }

    @Test
    public void testKhachHangUuTienSoVeMua2() {
        String loaiKhachHang = "Khách hàng ưu tiên";
        int soVeMua = 2;
        String expected = "Giá vé: 18$, Không có quà tặng";
        String actual = TicketManager.quanLyGiaVeVaQuaTang(loaiKhachHang, soVeMua);
        assertEquals(expected, actual);
    }

    @Test
    public void testKhachHangUuTienSoVeMua5() {
        String loaiKhachHang = "Khách hàng ưu tiên";
        int soVeMua = 5;
        String expected = "Giá vé: 18$, Không có quà tặng";
        String actual = TicketManager.quanLyGiaVeVaQuaTang(loaiKhachHang, soVeMua);
        assertEquals(expected, actual);
    }

    @Test
    public void testKhachHangUuTienSoVeMua7() {
        String loaiKhachHang = "Khách hàng ưu tiên";
        int soVeMua = 7;
        String expected = "Giá vé: 15$, Không có quà tặng";
        String actual = TicketManager.quanLyGiaVeVaQuaTang(loaiKhachHang, soVeMua);
        assertEquals(expected, actual);
    }

    @Test
    public void testKhachHangUuTienSoVeMua15() {
        String loaiKhachHang = "Khách hàng ưu tiên";
        int soVeMua = 15;
        String expected = "Giá vé: 12$, Nhận quà tặng đặc biệt";
        String actual = TicketManager.quanLyGiaVeVaQuaTang(loaiKhachHang, soVeMua);
        assertEquals(expected, actual);
    }


    @Test
    public void testKhachHangBinhThuongSoVeMua4() {
        String loaiKhachHang = "Khách hàng bình thường";
        int soVeMua = 4;
        String expected = "Giá vé: 15$, Không có quà tặng";
        String actual = TicketManager.quanLyGiaVeVaQuaTang(loaiKhachHang, soVeMua);
        assertEquals(expected, actual);
    }

    @Test
    public void testKhachHangBinhThuongSoVeMuaAm() {
        String loaiKhachHang = "Khách hàng bình thường";
        int soVeMua = -1;
        String expected = "Thông tin không hợp lệ";
        String actual = TicketManager.quanLyGiaVeVaQuaTang(loaiKhachHang, soVeMua);
        assertEquals(expected, actual);
    }
    @Test
    public void testKhachHangUuTienSoVeMua11() {
        String loaiKhachHang = "Khách hàng ưu tiên";
        int soVeMua = 11;
        String expected = "Giá vé: 12$, Nhận quà tặng đặc biệt";
        String actual = TicketManager.quanLyGiaVeVaQuaTang(loaiKhachHang, soVeMua);
        assertEquals(expected, actual);
    }
}
