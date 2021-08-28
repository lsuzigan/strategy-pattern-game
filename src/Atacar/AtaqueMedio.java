package Atacar;

import Personagem.Estado.EstadoForte;
import Personagem.Estado.EstadoMorto;
import Personagem.Estado.EstadoNormal;
import Personagem.Estado.EstadoPerigo;
import Personagem.Personagem;

public class AtaqueMedio implements IAtaque
{
	private static double ValorAtaque = 12.5;

	@Override
	public void Atacar(Personagem alvo)
	{
		System.out.println("\tRealizando ataque medio: " + ValorAtaque);
		alvo.setVida(alvo.getVida() - ValorAtaque);

		// checa o estado
		if (alvo.getVida() > 0 && alvo.getVida() < 30 && !(alvo.getEstado() instanceof EstadoPerigo))
		{
			alvo.setEstado(new EstadoPerigo());
		}
		else if (alvo.getVida() >= 30 && alvo.getVida() < 70 && !(alvo.getEstado() instanceof EstadoNormal))
		{
			alvo.setEstado(new EstadoNormal());
		}
		else if (alvo.getVida() >= 70 && !(alvo.getEstado() instanceof EstadoForte))
		{
			alvo.setEstado(new EstadoForte());
		}
		else if (alvo.getVida() <= 0 && !(alvo.getEstado() instanceof EstadoMorto))
		{
			alvo.setEstado(new EstadoMorto());
		}
	}
}
