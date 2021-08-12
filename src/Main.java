import Personagem.PersonagemUm;

public class Main
{
	public static void main(String[] args)
	{
		var p1 = new PersonagemUm(100);
		System.out.println("Tipo personagem = " + p1.getClass());
		System.out.println("Vida = " + p1.getVida());
		System.out.println("Tipo pulo = " + p1.getTipoPulo());
	}
}
