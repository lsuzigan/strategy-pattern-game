package Correr;

import Personagem.Personagem;

public class CorrerMedio implements ICorrida
{
	@Override
	public void Correr(Personagem atacante, Personagem alvo, int x, int y)
	{
		if (((atacante.getX() - x) == 2) && ((atacante.getY() - y) == 2))
		{
			atacante.Atacar(alvo);
		}
		else
		{
			if (alvo.getX() > atacante.getX())
			{
				atacante.setX(atacante.getX() + 4);
			}
			else
			{
				atacante.setX(atacante.getX() - 4);
			}

			if (alvo.getY() > atacante.getY())
			{
				atacante.setY(atacante.getY() + 4);
			}
			else
			{
				atacante.setY(atacante.getY() - 4);
			}
		}
	}
}
