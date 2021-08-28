import Personagem.Inimigo.Inimigo;
import Personagem.Inimigo.Ogro;
import Personagem.PersonagemUm;

public class Main
{
	public static void main(String[] args) throws InterruptedException
	{
		var p1 = new PersonagemUm(0, 0);
		System.out.println("Personagem tipo 1 criado. Vida = " + p1.getVida() + " | Posicao: (" + p1.getX() + "," + p1.getY() + ")");
		System.out.println("\tEstado atual: " + p1.getEstado());

		var inimigo = new Ogro(0, 4);
		System.out.println("Inimigo criado. Vida = " + inimigo.getVida() + " | Posicao: (" + inimigo.getX() + "," + inimigo.getY() + ")");
		System.out.println("\tEstado atual: " + inimigo.getEstado());

		System.out.println();

		p1.adicionarObservador(inimigo);

		while (true)
		{
			System.out.println();
			System.out.println("Personagem Vida: " + p1.getVida() + " Posicao: (" + p1.getX() + "," + p1.getY() + ")");
			System.out.println("Inimigo Vida: " + p1.getVida() + " Posicao: (" + inimigo.getX() + "," + inimigo.getY() + ")");
			Thread.sleep(500);

			p1.Correr(p1, inimigo, 2, 2);
		}
	}
}


//		p1.Atacar(inimigo);
//		System.out.println("Ataque realizado no personagem 2 Vida = " + inimigo.getVida());
//		System.out.println("Estado atual: " + inimigo.getEstado());
//
//		System.out.println();
//
//		p1.Atacar(inimigo);
//		System.out.println("Ataque realizado no personagem 2 Vida = " + inimigo.getVida());
//		System.out.println("Estado atual: " + inimigo.getEstado());
//
//		System.out.println();
//
//		p1.Atacar(inimigo);
//		System.out.println("Ataque realizado no personagem 2 Vida = " + inimigo.getVida());
//		System.out.println("Estado atual: " + inimigo.getEstado());
//
//		System.out.println();
//
//		inimigo.PegarRecompensa(new Recompensa());
//		System.out.println("Personagem 2 encontrou uma recompensa de energia. Vida = " + inimigo.getVida());
//		System.out.println("Estado atual: " + inimigo.getEstado());
//
//		System.out.println();
//
//		p1.Atacar(inimigo);
//		System.out.println("Ataque realizado no personagem 2 Vida = " + inimigo.getVida());
//		System.out.println("Estado atual: " + inimigo.getEstado());