package mainpackage;

import accessmodifierspackage.accessclass;
import constructorpackage.someoneclass;
import domainpackage.*;
import primitivereferencetypes.typeofReference;

public class mainclass {
	//Access Modifiers
	private static String Value1;
	protected static String Value2;
	public static String Value3;
	static String Value4;
	//Access Modifiers
	
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
		/*
		someoneclass orneksinif1 = new someoneclass();
		someoneclass orneksinif2 = new someoneclass(1987);
		someoneclass orneksinif3 = new someoneclass(1987, 06);
		System.out.println(String.format("Örnek1 sýnýfa ait Deðer1: %d ve Deðer2: %d", orneksinif1.deger1, orneksinif1.deger2));
		System.out.println(String.format("Örnek2 sýnýfa ait Deðer1: %d ve Deðer2: %d", orneksinif2.deger1, orneksinif2.deger2));
		System.out.println(String.format("Örnek3 sýnýfa ait Deðer1: %d ve Deðer2: %d", orneksinif3.deger1, orneksinif3.deger2));
		*/
		
		//Access Modifiers
		//Farklý Paket içiden eriþim:
		accessclass accessmodifiersexample = new accessclass();
		//String test1_1 = accessmodifiersexample.Value1; //Private
		//String test1_2 = accessmodifiersexample.Value2; //Protected
		String test1_3 = accessmodifiersexample.Value3; //Public
		//String test1_4 = accessmodifiersexample.Value4; //default

		//Ayný Paket içiden eriþim:
		accessclass2 accessmodifiersexample2 = new accessclass2();
		//String test2_1 = accessmodifiersexample2.Value1; //Private
		String test2_2 = accessmodifiersexample2.Value2; //Protected
		String test2_3 = accessmodifiersexample2.Value3; //Public
		String test2_4 = accessmodifiersexample2.Value4; //default

		//Ayný sýnýf içiden eriþim:
		String test3_1 = Value1; //Private
		String test3_2 = Value2; //Protected
		String test3_3 = Value3; //Public
		String test3_4 = Value4; //default
		
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
