package com.LichNam;

public class Main {
    public int Nam;
    public boolean NamNhuan;
    public static void main(String[] args) {
	// write your code here
    }

    public int ThuDauTienCuaThang(int Thang){
        int century=this.Nam/100;
        int year=this.Nam%100;
        int month= Thang-2;
        if (month<1) month+=12;
        int weekday=((13*month-1)/5 + (year/4) + (century/4) + 1 + year - 2 * century) % 7;
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
        return;
    }

    public void XuatLichThang(int weekday, int Thang){
        System.out.print ("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
        while (int i<){
            for (int i=0;i<6;i++){
                for (int j=weekday;i<7;i++){

                }
        }
}
