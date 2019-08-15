package annotationpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Yazýlan custom annotation'ýn özelleþtirilmesi:
//@Target(ElementType.ANNOTATION_TYPE)	//Sadece annotation'lar için
//@Target(ElementType.PACKAGE)			//Sadece paketler için
@Target(ElementType.TYPE)				//Sadece sýnýf, enum ve interfaceler için
//@Target(ElementType.CONSTRUCTOR)		//Sadece yapýcý metodlar için
//@Target(ElementType.METHOD)				//Sadece metodlar için
//@Target(ElementType.FIELD)			//Sadece sýnýf üyeleri için
//@Target(ElementType.LOCAL_VARIABLE)	//Sadece yerel deðiþkenler için

//Yazýlan custom annotation'ýn ne zaman eriþebileceði:
//@Retention(RetentionPolicy.CLASS) //
@Retention(RetentionPolicy.RUNTIME) //Derleyicinin derleme anýnda annotation'a eriþmesi için
//@Retention(RetentionPolicy.SOURCE)
public @interface customannotation {
	public String Ad();
	public int Adet();
}
