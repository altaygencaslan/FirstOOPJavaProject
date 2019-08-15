package mainpackage;

import java.lang.annotation.Annotation;

import accessmodifierspackage.accessclass;
import annotationpackage.customannotation;
import annotationpackage.customclass;
import constructorpackage.someoneclass;
import domainpackage.*;
import primitivereferencetypes.typeofReference;
import staticpackage.staticsampleclass;
import enumpackage.enumanimals;

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
		
		String insan1bilgi = String.format("�rne�i olu�turulan insan nesnesinin boyu %f, cinsiyeti %s ve ya�� %d 'dir", insan1.boy, insan1.cinsiyet, insan1.yas);
		System.out.println(insan1bilgi);
		
		araba arac1 = new araba();
		arac1.marka = "Citroen C3";
		arac1.renk = "K�l Gri";
		
		arac1.gazaBas();
		arac1.freneBas();
		*/
		
		//Value Type - Reference Type
		/*
		//De�er tipler ba�ka brmetoda g�nderildiklerinde asl�nda bir kopyalar� g�nderilmi� olur.
		int a = 5;
		System.out.println(String.format("Eski De�er: %d", a));
		KendisiyleCarp(a);
		System.out.println(String.format("Yeni De�er: %d", a));
		
		//Referans tipler ba�ka bir metoda g�nderildiklerinde bellekteki adresiyle kendisi g�nderilmi� olur.
		typeofReference ornektip = new typeofReference();
		ornektip.val = 10;
		System.out.println(String.format("Eski De�er: %d", ornektip.val));
		KendisiyleCarp(ornektip);
		System.out.println(String.format("Yeni De�er: %d", ornektip.val));
		*/
		
		
		//Constructor'lar
		/*
		someoneclass orneksinif1 = new someoneclass();
		someoneclass orneksinif2 = new someoneclass(1987);
		someoneclass orneksinif3 = new someoneclass(1987, 06);
		System.out.println(String.format("�rnek1 s�n�fa ait De�er1: %d ve De�er2: %d", orneksinif1.deger1, orneksinif1.deger2));
		System.out.println(String.format("�rnek2 s�n�fa ait De�er1: %d ve De�er2: %d", orneksinif2.deger1, orneksinif2.deger2));
		System.out.println(String.format("�rnek3 s�n�fa ait De�er1: %d ve De�er2: %d", orneksinif3.deger1, orneksinif3.deger2));
		*/
		
		//Access Modifiers
		/*
		//Farkl� Paket i�iden eri�im:
		accessclass accessmodifiersexample = new accessclass();
		//String test1_1 = accessmodifiersexample.Value1; //Private
		//String test1_2 = accessmodifiersexample.Value2; //Protected
		String test1_3 = accessmodifiersexample.Value3; //Public
		//String test1_4 = accessmodifiersexample.Value4; //default

		//Ayn� Paket i�iden eri�im:
		accessclass2 accessmodifiersexample2 = new accessclass2();
		//String test2_1 = accessmodifiersexample2.Value1; //Private
		String test2_2 = accessmodifiersexample2.Value2; //Protected
		String test2_3 = accessmodifiersexample2.Value3; //Public
		String test2_4 = accessmodifiersexample2.Value4; //default

		//Ayn� s�n�f i�iden eri�im:
		String test3_1 = Value1; //Private
		String test3_2 = Value2; //Protected
		String test3_3 = Value3; //Public
		String test3_4 = Value4; //default
		*/
		
		//Static Classes
		/*
		System.out.println(String.format("Static s�n�f sayi de�eri: %d 'dir", staticsampleclass.Sayi));
		staticsampleclass sampleclass1 = new staticsampleclass("Altay", "Gen�aslan");
		staticsampleclass sampleclass2 = new staticsampleclass("Nergiz", "Gen�aslan");
		staticsampleclass sampleclass3 = new staticsampleclass("Ahmet Deniz", "Gen�aslan");
		System.out.println(String.format("Static s�n�f sayi de�eri: %d 'dir", staticsampleclass.Sayi));
		*/

		//Enums
		/*
		//Enumlar�n de�eri
		System.out.println(enumanimals.AT);
		System.out.println(enumanimals.HOROZ);
		System.out.println(enumanimals.KEDI);
		System.out.println(enumanimals.KOPEK);
		System.out.println(enumanimals.KOYUN);
		
		//Enumlar�n i�inde olu�turulan de�i�ken bilgisi
		System.out.println(enumanimals.AT.adet);
		System.out.println(enumanimals.HOROZ.adet);
		System.out.println(enumanimals.KEDI.adet);
		System.out.println(enumanimals.KOPEK.adet);
		System.out.println(enumanimals.KOYUN.adet);
		
		//Enumlar�n indis bilgisi
		System.out.println(enumanimals.AT.ordinal());
		System.out.println(enumanimals.HOROZ.ordinal());
		System.out.println(enumanimals.KEDI.ordinal());
		System.out.println(enumanimals.KOPEK.ordinal());
		System.out.println(enumanimals.KOYUN.ordinal());
		*/		
		
		//Annotation & Custom Annotation
		customclass customsinif = new customclass();
		customsinif.Isim = "Altay";
		customsinif.Yil = 1987;
		
		//S�n�f�n sahip oldu�unu bildi�imiz spesifik annotation:
		customannotation customA = customsinif.getClass().getAnnotation(customannotation.class);
		String customAd = customA.Ad();
		int customAdet = customA.Adet();
		System.out.println("customAd: " + customAd);
		System.out.println("customAdet: " + customAdet);
		
		//S�n�f�n sahip oldu�u t�m annotation'lar:
		Annotation[] listofAnnotation = customsinif.getClass().getAnnotations();
		System.out.println("Count of Annotation(s) " + listofAnnotation.length);
		for (Annotation annotation: listofAnnotation)
		{			
			if (annotation instanceof customannotation)
			{
				customannotation cannotation = (customannotation)annotation;
				
				customAd = cannotation.Ad();
				customAdet = cannotation.Adet();
				System.out.println("customAd: " + customAd);
				System.out.println("customAdet: " + customAdet);
			}
		}

		customclass customsinif2 = new customclass();
		
		
		//Garbage Collactor v1
		Runtime.getRuntime().gc();
		
		//Garbage Collactor v2
		System.gc();
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
