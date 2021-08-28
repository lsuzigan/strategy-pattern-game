package Correr;

import Personagem.Personagem;

public class CorrerLento implements ICorrida
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
			if (atacante.getX() > atacante.getX() )
			{
				atacante.setX(atacante.getX() + 2);
			}
			else
			{
				atacante.setX(atacante.getX() - 2);
			}

			if (atacante.getY() > atacante.getY() )
			{
				atacante.setY(atacante.getY() + 2);
			}
			else
			{
				atacante.setY(atacante.getY() - 2);
			}
		}
	}
}
