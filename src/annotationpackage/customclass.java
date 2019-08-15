package annotationpackage;

@customannotation(Ad = "custom", Adet = 100)
public class customclass {
	public String Isim;
	public int Yil;
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("CustomClass finalize metodu");
		
		// TODO Auto-generated method stub
		super.finalize();
	}
}
