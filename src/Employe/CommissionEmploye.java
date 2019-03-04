package Employe;

public class CommissionEmploye extends Employe {
	private int faiz;
	  private int srktgelir;
	  
  public CommissionEmploye(String ad, String soyad,int faiz,int srktgelir) {
		super(ad, soyad);
		setFaiz(faiz);
		setSrktgelir(srktgelir);
	}


	@Override
public String toString() {
	return "CommissionEmploye [getFaiz()=" + getFaiz() + ", getSrktgelir()=" + getSrktgelir() + ", hesabla()="
			+ hesabla() + ", getAd()=" + getAd() + ", getSoyad()=" + getSoyad() + "]";
}


	public int getFaiz() {
	return faiz;
}
public void setFaiz(int faiz) {
	this.faiz = faiz;
}
	
	public int getSrktgelir() {
		return srktgelir;
	}
	public void setSrktgelir(int srktgelir) {
		this.srktgelir = srktgelir;
	}


	@Override
	public int hesabla() {
		return getFaiz()*getSrktgelir()/100;
	}

}
