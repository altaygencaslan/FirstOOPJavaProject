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
		someoneclass orneksinif = new someoneclass(1987);
		System.out.println(String.format("�rnek s�n�fa ait De�er1: %d ve De�er2: %d", orneksinif.deger1, orneksinif.deger2));
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
