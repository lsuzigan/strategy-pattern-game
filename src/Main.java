import Atacar.Decorador.AtaqueFogo;
import Personagem.Inimigo.Inimigo;
import Personagem.Inimigo.Ogro;
import Personagem.PersonagemUm;

import javax.swing.*;

public class Main
{
	public static void main(String[] args) throws InterruptedException
	{
		var jogo = new Jogo();
		var frame = new JFrame("Guerra");
		frame.add(jogo);
		frame.setSize(1200, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jogo.personagem.setAtaque(new AtaqueFogo(jogo.personagem.getAtaque().getValorAtaque()));
		jogo.personagem.adicionarObservador(jogo.ogro);
		var vidaP = jogo.personagem.getVida();
		var vidaO = jogo.ogro.getVida();
		while (true)
		{
			if (jogo.personagem.getObservadores().size() == 0)
			{
				System.out.println("Inimigos derrotados");
				break;
			}

			jogo.repaint();
			jogo.personagem.Correr(jogo.personagem, jogo.ogro, 0, 0);

			if (vidaP != jogo.personagem.getVida())
			{
				vidaP = jogo.personagem.getVida();
				System.out.println("Personagem sofreu dano. Vida = " + jogo.personagem.getVida());
			}

			if (vidaO != jogo.ogro.getVida())
			{
				vidaO = jogo.ogro.getVida();
				System.out.println("Ogro sofreu dano. Vida = " + jogo.ogro.getVida());
			}

			Thread.sleep(100);
		}

//		var p1 = new PersonagemUm(0, 0);
//		System.out.println("Personagem tipo 1 criado. Vida = " + p1.getVida() + " | Posicao: (" + p1.getX() + "," + p1.getY() + ")");
//		System.out.println("\tEstado atual: " + p1.getEstado());
//
//		var inimigo = new Ogro(0, 4);
//		System.out.println("Inimigo criado. Vida = " + inimigo.getVida() + " | Posicao: (" + inimigo.getX() + "," + inimigo.getY() + ")");
//		System.out.println("\tEstado atual: " + inimigo.getEstado());
//
//		System.out.println();
//
//		p1.adicionarObservador(inimigo);
//
//		while (true)
//		{
//			System.out.println();
//			System.out.println("Personagem Vida: " + p1.getVida() + " Posicao: (" + p1.getX() + "," + p1.getY() + ")");
//			System.out.println("Inimigo Vida: " + p1.getVida() + " Posicao: (" + inimigo.getX() + "," + inimigo.getY() + ")");
//			Thread.sleep(500);
//
//			p1.Correr(p1, inimigo, 2, 2);
//		}
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