package Correr;

import Personagem.Personagem;

public class CorrerMedio implements ICorrida
{
	@Override
	public void Correr(Personagem atacante, Personagem alvo)
	{
		if (alvo.getX() > atacante.getX())
		{
			atacante.setX(atacante.getX() + (int) (12 * Math.random()));
		} else
		{
			atacante.setX(atacante.getX() - (int) (12 * Math.random()));
		}

		if (alvo.getY() > atacante.getY())
		{
			atacante.setY(atacante.getY() + (int) (12 * Math.random()));
		} else
		{
			atacante.setY(atacante.getY() - (int) (12 * Math.random()));
		}
	}
}
