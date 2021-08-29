package Correr;

import Personagem.Personagem;

public class CorrerRapido implements ICorrida
{
	@Override
	public void Correr(Personagem atacante, Personagem alvo)
	{
		if (((atacante.getX() - alvo.getX()) == 0) && ((atacante.getY() - alvo.getY()) == 0))
		{
			atacante.Atacar(atacante, alvo);
		}
		else
		{
			if (alvo.getX() > atacante.getX())
			{
				atacante.setX(atacante.getX() + (int)(8 * Math.random()));
			}
			else
			{
				atacante.setX(atacante.getX() - (int)(8 * Math.random()));
			}

			if (alvo.getY() > atacante.getY())
			{
				atacante.setY(atacante.getY() + (int)(8 * Math.random()));
			}
			else
			{
				atacante.setY(atacante.getY() - (int)(8 * Math.random()));
			}
		}
	}
}
