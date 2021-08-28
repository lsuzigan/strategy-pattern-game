package Personagem.Estado;

import Atacar.AtaqueFraco;
import Correr.CorrerLento;
import Personagem.Personagem;

public class EstadoPerigo implements IEstado
{

	@Override
	public void mudaAtaque(Personagem p)
	{
		p.setAtaque(new AtaqueFraco());
	}

	@Override
	public void mudaCorrida(Personagem p)
	{
		p.setCorrida(new CorrerLento());
	}
}
