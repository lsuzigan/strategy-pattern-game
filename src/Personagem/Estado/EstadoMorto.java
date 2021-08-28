package Personagem.Estado;

import Atacar.AtaqueFraco;
import Correr.CorrerLento;
import Personagem.Personagem;

public class EstadoMorto implements IEstado
{
	@Override
	public void mudaAtaque(Personagem p)
	{
	}

	@Override
	public void mudaCorrida(Personagem p)
	{
	}
}
