/**
 * 
 */
package työmaa;

/**
 * @author Josia Nyman
 *
 */
public abstract class Työkalu implements Lyövä {

	@Override
	public void lyö(Säilyketölkki a) {
		// TODO Auto-generated method stub
		System.out.println("PAM pam PAM!!!");
		a.lyöty();
		System.out.println(a.annaTila());
	}
}
