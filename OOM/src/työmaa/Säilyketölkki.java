package ty�maa;

public class S�ilyket�lkki {
	private enum Tila{EHJ�, RUTTUINEN, MUODOTON};
	Tila t;
	public S�ilyket�lkki() {
		t=Tila.EHJ�;
	}
	public void ly�ty(){
		if(t==Tila.EHJ�){
			t=Tila.RUTTUINEN;
		}
		else if (t==Tila.RUTTUINEN) {
			t=Tila.MUODOTON;
		}
	}
	public String annaTila(){
		return t.toString();
	}
}
