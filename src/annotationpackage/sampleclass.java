package annotationpackage;

public class sampleclass {
	
	//Deprecated ile s�r�m� eski olan metodlar derleyici taraf�ndan geli�tiriciye bildirilir. 
	@Deprecated
	public void Method_1()
	{
		//Do something...
	}
	
	@SuppressWarnings("Test Deneme 1, 2, 3!")
	public void Method_2()
	{
		//Do again something...
	}
}
