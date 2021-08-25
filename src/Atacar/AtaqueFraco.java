package Atacar;

import Personagem.Personagem;

public class AtaqueFraco implements IAtaque
{
	private static double ValorAtaque = 5.0;

	@Override
	public void Atacar(Personagem alvo)
	{
		alvo.setVida(alvo.getVida() - ValorAtaque);
	}
}
