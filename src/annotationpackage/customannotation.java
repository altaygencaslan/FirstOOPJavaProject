package annotationpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Yaz�lan custom annotation'�n �zelle�tirilmesi:
//@Target(ElementType.ANNOTATION_TYPE)	//Sadece annotation'lar i�in
//@Target(ElementType.PACKAGE)			//Sadece paketler i�in
@Target(ElementType.TYPE)				//Sadece s�n�f, enum ve interfaceler i�in
//@Target(ElementType.CONSTRUCTOR)		//Sadece yap�c� metodlar i�in
//@Target(ElementType.METHOD)				//Sadece metodlar i�in
//@Target(ElementType.FIELD)			//Sadece s�n�f �yeleri i�in
//@Target(ElementType.LOCAL_VARIABLE)	//Sadece yerel de�i�kenler i�in

//Yaz�lan custom annotation'�n ne zaman eri�ebilece�i:
//@Retention(RetentionPolicy.CLASS) //
@Retention(RetentionPolicy.RUNTIME) //Derleyicinin derleme an�nda annotation'a eri�mesi i�in
//@Retention(RetentionPolicy.SOURCE)
public @interface customannotation {
	public String Ad();
	public int Adet();
}
