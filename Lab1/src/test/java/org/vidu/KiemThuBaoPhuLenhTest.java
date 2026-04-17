package org.vidu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KiemThuBaoPhuLenhTest {

    private final ChuongTrinhChanLe chuongTrinh = new ChuongTrinhChanLe();

    @Test
    void traVeToanChanKhiCaHaiSoDeuChan() {
        assertEquals("TOAN_CHAN", chuongTrinh.phanTichHaiSo(2, 4));
    }

    @Test
    void traVeToanLeKhiCaHaiSoDeuLe() {
        assertEquals("TOAN_LE", chuongTrinh.phanTichHaiSo(1, 3));
    }

    @Test
    void traVeHonHopKhiMotChanMotLe() {
        assertEquals("HON_HOP", chuongTrinh.phanTichHaiSo(2, 3));
    }
}