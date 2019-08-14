package gettersetterpackage;

public class gettersetterclass {
	
	public gettersetterclass() {
		
	}
	
	public gettersetterclass(int _deger) {
		this.deger = _deger;
	}
	
	public gettersetterclass(int _deger, String _ad) {
		this.deger = _deger;
		this.Ad = _ad;
	}
	
	private int deger;
	private String Ad;
	
	public int getDeger() {
		return deger;
	}
	public void setDeger(int deger) {
		this.deger = deger;
	}
	public String getAd() {
		return Ad;
	}
	public void setAd(String ad) {
		Ad = ad;
	}
	
}
