package Atacar;

import Personagem.Personagem;

public class AtaqueMedio implements IAtaque
{
	private static double ValorAtaque = 12.5;

	@Override
	public void Atacar(Personagem alvo)
	{
		alvo.setVida(alvo.getVida() - ValorAtaque);
	}
}
