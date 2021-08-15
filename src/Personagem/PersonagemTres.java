package Personagem;

import Atacar.AtaqueForte;
import Correr.CorrerRapido;
import Pular.PuloBaixo;

public class PersonagemTres implements Personagem
{
	// Atributos do personagem
	private double Vida;

	// Acoes do personagem
	private PuloBaixo Pulo;
	private CorrerRapido Corrida;
	private AtaqueForte Ataque;

	public PersonagemTres(double vida)
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
