import Personagem.PersonagemUm;
import Personagem.PersonagemDois;
import Personagem.PersonagemTres;

public class Main
{
	public static void main(String[] args)
	{
		var p1 = new PersonagemUm(100);
		System.out.println("Personagem tipo 1 criado. Vida = " + p1.getVida());

		var p2 = new PersonagemDois(100);
		System.out.println("Personagem tipo 2 criado. Vida = " + p2.getVida());

		var p3 = new PersonagemTres(100);
		System.out.println("Personagem tipo 2 criado. Vida = " + p3.getVida());

		p1.Atacar(p2);
		System.out.println("Ataque realizado no personagem 2 Vida = " + p2.getVida());

		p2.Atacar(p1);
		System.out.println("Ataque realizado no personagem 1 Vida = " + p1.getVida());
	}
}
