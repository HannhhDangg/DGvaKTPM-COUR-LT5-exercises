package org.vidu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KiemThuBaoPhuDuongDiTest {

    private final ChuongTrinhChanLe chuongTrinh = new ChuongTrinhChanLe();

    @Test
    void duongDi1_caHaiSoChan() {
        assertEquals("TOAN_CHAN", chuongTrinh.phanTichHaiSo(2, 4));
    }

    @Test
    void duongDi2_caHaiSoLe() {
        assertEquals("TOAN_LE", chuongTrinh.phanTichHaiSo(1, 3));
    }

    @Test
    void duongDi3_chanRoiLe() {
        assertEquals("HON_HOP", chuongTrinh.phanTichHaiSo(2, 3));
    }

    @Test
    void duongDi4_leRoiChan() {
        assertEquals("HON_HOP", chuongTrinh.phanTichHaiSo(1, 2));
    }
}