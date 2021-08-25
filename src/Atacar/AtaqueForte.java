package Atacar;

import Personagem.Personagem;

public class AtaqueForte implements IAtaque
{
	private static double ValorAtaque = 25.0;

	@Override
	public void Atacar(Personagem alvo)
	{
		alvo.setVida(alvo.getVida() - ValorAtaque);
	}
}
