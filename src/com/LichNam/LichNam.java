package com.LichNam;

public class LichNam {
    public int Nam;
    public boolean NamNhuan;

    public int ThuDauTienCuaThang(int Thang){
        int century=this.Nam/100;
        int year=this.Nam%100;
        int month= Thang-2;
        if (month<1) month+=12;
        int weekday=(((13*month-1)/5) + (year/4) + (century/4) + 18 + year - 2 * century) % 7;
        return weekday;
    }

    public void XetNamNhuan(){
        if ((this.Nam%400)==0) {
            this.NamNhuan=true;
            return;
        }
        if ((this.Nam%4==0)&&(this.Nam%100!=0)) {
            this.NamNhuan=true;
            return;
        }
        this.NamNhuan=false;
    }

    public int SoNgayTrongThang(int Thang){
        switch (Thang){
            case 1:
                return 31;
            case 2:
                if (this.NamNhuan) return 29;
                else return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                System.out.println("Thang bi sai");
        }
        return 0;
    }

    public void XuatLichThang(int weekday, int SoNgayTrongThang) {
        System.out.print("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
        System.out.println();
        int[][] Mang=new int[6][7];
        int n=1;

        //In dòng đầu của tháng
        for (int i=0;i<1;i++)
            for (int j =weekday;j<7;j++) {
                Mang[i][j] = n;
                n++;
            }

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                Mang[i][j] = n;
                n++;
                if (n > SoNgayTrongThang) break;
            }
            if (n > SoNgayTrongThang) break;
        }
        for (int i=0; i<6;i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(Mang[i][j]);
                System.out.print("     ");
            }
            System.out.println();
        }
    }
}
