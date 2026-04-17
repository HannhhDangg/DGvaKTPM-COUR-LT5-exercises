package org.vidu;

public class ChuongTrinhChanLe {

    public String phanTichHaiSo(int a, int b) {
        int soLuongChan = 0;
        int[] danhSachSo = { a, b };

        for (int so : danhSachSo) {
            if (so % 2 == 0) {
                soLuongChan++;
            }
        }

        if (soLuongChan == 2) {
            return "TOAN_CHAN";
        } else if (soLuongChan == 0) {
            return "TOAN_LE";
        } else {
            return "HON_HOP";
        }
    }
}