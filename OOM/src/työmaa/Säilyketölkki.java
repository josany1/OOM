package työmaa;

public class Säilyketölkki {
	private enum Tila{EHJÄ, RUTTUINEN, MUODOTON};
	Tila t;
	public Säilyketölkki() {
		t=Tila.EHJÄ;
	}
	public void lyöty(){
		if(t==Tila.EHJÄ){
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
