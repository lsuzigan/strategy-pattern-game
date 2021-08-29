package Atacar;

import Personagem.Personagem;

public abstract class Ataque
{
	private double ValorAtaque;

	public Ataque(double valorAtaque)
	{
		ValorAtaque = valorAtaque;
	}

	public double getValorAtaque()
	{
		return ValorAtaque;
	}

	public void setValorAtaque(double valorAtaque)
	{
		ValorAtaque = valorAtaque;
	}

	public abstract void Atacar(Personagem atacante, Personagem alvo);
}
