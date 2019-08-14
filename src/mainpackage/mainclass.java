package mainpackage;

import domainpackage.*;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insan insan1 = new insan();
		insan1.boy = 1.78;
		insan1.cinsiyet = "Erkek";
		insan1.yas = 32;
		
		String insan1bilgi = String.format("Örneği oluşturulan insan nesnesinin boyu %f, cinsiyeti %s ve yaşı %d 'dir", insan1.boy, insan1.cinsiyet, insan1.yas);
		System.out.println(insan1bilgi);
		
		araba arac1 = new araba();
		arac1.marka = "Citroen C3";
		arac1.renk = "Kül Gri";
		
		arac1.gazaBas();
		arac1.freneBas();
	}

}
