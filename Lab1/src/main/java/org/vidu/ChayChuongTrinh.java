package org.vidu;

public class ChayChuongTrinh {
    public static void main(String[] args) {
        ChuongTrinhChanLe chuongTrinh = new ChuongTrinhChanLe();

        if (args.length != 2) {
            System.out.println("Cach dung: java ChayChuongTrinh <a> <b>");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        String ketQua = chuongTrinh.phanTichHaiSo(a, b);
        System.out.println("Ket qua: " + ketQua);
    }
}