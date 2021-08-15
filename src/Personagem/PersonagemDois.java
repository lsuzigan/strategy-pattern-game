package Personagem;

import Atacar.AtaqueMedio;
import Correr.CorrerRapido;
import Pular.PuloAlto;

public class PersonagemDois implements Personagem
{
	// Atributos do personagem
	private double Vida;

	// Acoes do personagem
	private PuloAlto Pulo;
	private CorrerRapido Corrida;
	private AtaqueMedio Ataque;

	public PersonagemDois(double vida)
	{
		Vida = vida;
	}

	public double getVida()
	{
		return Vida;
	}

	public void setVida(double vida)
	{
		Vida = vida;
	}

	@Override
	public void Pular()
	{
		Pulo.Pular();
	}

	@Override
	public void Correr()
	{
		Corrida.Correr();
	}

	@Override
	public void Atacar()
	{
		Ataque.Atacar();
	}
}
