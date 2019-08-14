package mainpackage;

import constructorpackage.someoneclass;
import domainpackage.*;
import primitivereferencetypes.typeofReference;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// OOP and Class
		/*
		insan insan1 = new insan();
		insan1.boy = 1.78;
		insan1.cinsiyet = "Erkek";
		insan1.yas = 32;
		
		String insan1bilgi = String.format("Örneði oluþturulan insan nesnesinin boyu %f, cinsiyeti %s ve yaþý %d 'dir", insan1.boy, insan1.cinsiyet, insan1.yas);
		System.out.println(insan1bilgi);
		
		araba arac1 = new araba();
		arac1.marka = "Citroen C3";
		arac1.renk = "Kül Gri";
		
		arac1.gazaBas();
		arac1.freneBas();
		*/
		
		//Value Type - Reference Type
		/*
		//Deðer tipler baþka brmetoda gönderildiklerinde aslýnda bir kopyalarý gönderilmiþ olur.
		int a = 5;
		System.out.println(String.format("Eski Deðer: %d", a));
		KendisiyleCarp(a);
		System.out.println(String.format("Yeni Deðer: %d", a));
		
		//Referans tipler baþka bir metoda gönderildiklerinde bellekteki adresiyle kendisi gönderilmiþ olur.
		typeofReference ornektip = new typeofReference();
		ornektip.val = 10;
		System.out.println(String.format("Eski Deðer: %d", ornektip.val));
		KendisiyleCarp(ornektip);
		System.out.println(String.format("Yeni Deðer: %d", ornektip.val));
		*/
		
		//Constructor'lar
		someoneclass orneksinif = new someoneclass(1987);
		System.out.println(String.format("Örnek sýnýfa ait Deðer1: %d ve Deðer2: %d", orneksinif.deger1, orneksinif.deger2));
	}
	
	private static void KendisiyleCarp(int a)
	{
		a = a * a;
	}
	
	private static void KendisiyleCarp(typeofReference type)
	{
		type.val = type.val * type.val;
	}
	
	

}
