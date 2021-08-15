package Personagem;

import Atacar.AtaqueForte;
import Correr.CorrerMedio;
import Pular.PuloMedio;

public class PersonagemUm implements Personagem
{
	// Atributos do personagem
	private double Vida;

	// Acoes do personagem
	private PuloMedio Pulo;
	private CorrerMedio Corrida;
	private AtaqueForte Ataque;

	public PersonagemUm(double vida)
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
