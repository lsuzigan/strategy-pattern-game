package Atacar;

import Personagem.Estado.EstadoForte;
import Personagem.Estado.EstadoMorto;
import Personagem.Estado.EstadoNormal;
import Personagem.Estado.EstadoPerigo;
import Personagem.Personagem;

public class AtaqueForte extends Ataque
{
	public AtaqueForte()
	{
		super(20.0);
	}

	@Override
	public void Atacar(Personagem atacante, Personagem alvo)
	{
		if (((atacante.getX() - alvo.getX()) < 5) && ((atacante.getY() - alvo.getY()) < 5))
		{
			System.out.println("\tRealizando ataque forte: " + super.getValorAtaque());
			var ataqueDefendido = alvo.getEscudo().Defender(super.getValorAtaque());
			alvo.setVida(alvo.getVida() - ataqueDefendido);

			// checa o estado
			if (alvo.getVida() > 0 && alvo.getVida() < 30 && !(alvo.getEstado() instanceof EstadoPerigo))
			{
				alvo.setEstado(new EstadoPerigo());
			} else if (alvo.getVida() >= 30 && alvo.getVida() < 70 && !(alvo.getEstado() instanceof EstadoNormal))
			{
				alvo.setEstado(new EstadoNormal());
			} else if (alvo.getVida() >= 70 && !(alvo.getEstado() instanceof EstadoForte))
			{
				alvo.setEstado(new EstadoForte());
			} else if (alvo.getVida() <= 0 && !(alvo.getEstado() instanceof EstadoMorto))
			{
				alvo.setEstado(new EstadoMorto());
			}
		}
	}
}
