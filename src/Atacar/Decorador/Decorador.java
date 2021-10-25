package Atacar.Decorador;

import Atacar.Ataque;

public abstract class Decorador extends Ataque
{
	private Ataque Ataque;

	public Decorador(Ataque ataque, double bonus)
	{
		super(ataque.getValorAtaque() + bonus);
		Ataque = ataque;
	}
}
