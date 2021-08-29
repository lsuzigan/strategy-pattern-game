package Correr;

import Personagem.Personagem;

public class CorrerLento implements ICorrida
{
	@Override
	public void Correr(Personagem atacante, Personagem alvo)
	{
		if (alvo.getX() > atacante.getX())
		{
			atacante.setX(atacante.getX() + (int) (4 * Math.random()));
		} else
		{
			atacante.setX(atacante.getX() - (int) (4 * Math.random()));
		}

		if (alvo.getY() > atacante.getY())
		{
			atacante.setY(atacante.getY() + (int) (4 * Math.random()));
		} else
		{
			atacante.setY(atacante.getY() - (int) (4 * Math.random()));
		}
	}
}
