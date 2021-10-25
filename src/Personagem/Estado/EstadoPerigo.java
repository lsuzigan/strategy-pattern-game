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

	@Override
	public void checaEstado(Personagem p)
	{
		if (p.getVida() > 0 && p.getVida() < 30 && !(p.getEstado() instanceof EstadoPerigo))
		{
			p.setEstado(new EstadoPerigo());
		}
		else if (p.getVida() >= 30 && p.getVida() < 70 && !(p.getEstado() instanceof EstadoNormal))
		{
			p.setEstado(new EstadoNormal());
		}
		else if (p.getVida() >= 70 && !(p.getEstado() instanceof EstadoForte))
		{
			p.setEstado(new EstadoForte());
		}
		else if (p.getVida() <= 0 && !(p.getEstado() instanceof EstadoMorto))
		{
			p.setEstado(new EstadoMorto());
		}
	}
}
