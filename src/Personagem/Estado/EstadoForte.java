package Personagem.Estado;

import Atacar.AtaqueForte;
import Atacar.AtaqueFraco;
import Correr.CorrerLento;
import Correr.CorrerRapido;
import Personagem.Personagem;

public class EstadoForte implements IEstado
{
	@Override
	public void mudaAtaque(Personagem p)
	{
		p.setAtaque(new AtaqueForte());
	}

	@Override
	public void mudaCorrida(Personagem p)
	{
		p.setCorrida(new CorrerRapido());
	}
}
