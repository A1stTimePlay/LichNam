package com.LichNam;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        LichNam Lich=new LichNam();
        Scanner input=new Scanner(System.in);
        System.out.println("Moi nhap nam: ");
        Lich.Nam=input.nextInt();
        Lich.XetNamNhuan();
        for (int i=1;i<=12;i++) {
            System.out.println("Thang "+i);
            int ThuDauTienCuaThang = Lich.ThuDauTienCuaThang(i);
            int SoNgayTrongThang = Lich.SoNgayTrongThang(i);
            Lich.XuatLichThang(ThuDauTienCuaThang, SoNgayTrongThang);
            System.out.println();
        }
    }
}
