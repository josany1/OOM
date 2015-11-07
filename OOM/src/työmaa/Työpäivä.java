package työmaa;

public class Työpäivä {

	public static void main(String[] args) {
		Vasara höyryvasara=new Vasara();
		Säilyketölkki ananas=new Säilyketölkki();
		System.out.println(ananas.annaTila());
		for(int i=0;i<3;i++){
			höyryvasara.lyö(ananas);
		}
	}

}
