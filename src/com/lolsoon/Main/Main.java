package com.lolsoon.Main;

import java.util.Scanner;

import menu.lolsoon.hinhhoc.HinhTron;
import menu.lolsoon.hinhhoc.HinhVuong;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println(" Vui long lua chon hinh :");
		System.out.println("1 - tinh chu vi va dien tich hinh vuong");
		System.out.println("2 - tinh chu vi va dien tich hinh tron");
		int x = scan.nextInt();
//
//		switch (x) {
//		case 1:
//			System.out.println("ban da lua chon 1");
//			float chieuDaiCanh = scan.nextFloat();
//			System.out.println(" chu vi cua hinh vuong la :" + HinhVuong.chuVi(chieuDaiCanh));
//			System.out.println("dien tich cua hinh vuong la :" + HinhVuong.dienTich(chieuDaiCanh));
//			break;
//		case 2:
//			System.out.println("ban da lua chon 2");
//			float banKinh = scan.nextFloat();
//			System.out.println("chu vi cua hinh tron la :" + HinhTron.chuVi(banKinh));
//			System.out.println("dien tich cua hinh tron la :" + HinhTron.dienTich(banKinh));
//			break;
//		default:
//			System.out.println("ban chua lua chon hoac lua chon sai");
//		}
//		System.out.println("ket thuc chuong trinh");
		// dung if else

		if (x == 1) {
			System.out.println("ban da lua chon 1 vui long nhap do dai");
			float chieuDaiCanh = scan.nextFloat();
			System.out.println("chu vi cua hinh vuong la :" + HinhVuong.chuVi(chieuDaiCanh));
			System.out.println("dien tich cua hinh vuong la :" + HinhVuong.dienTich(chieuDaiCanh));
		} else if (x == 2) {
			System.out.println("ban da lua chon 2 vui long nhap ban kinh hinh tron");
			float banKinh = scan.nextFloat();
			System.out.println(" chu vi hinh tron la :" + HinhTron.chuVi(banKinh));
			System.out.println(" dien tich hinh tron la :" + HinhTron.dienTich(banKinh));
		} else {
			System.out.println("ban chon sai vui long nhap lai");
		}
	}

}
