package Personagem.Estado;

import Personagem.Personagem;

public class EstadoNormal implements IEstado
{
	@Override
	public void mudaAtaque(Personagem p)
	{
		p.setAtaque(p.getAtaque());
	}

	@Override
	public void mudaCorrida(Personagem p)
	{
		p.setCorrida(p.getCorrida());
	}
}
