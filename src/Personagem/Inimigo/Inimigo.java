package Personagem.Inimigo;

import Atacar.AtaqueMedio;
import Correr.CorrerMedio;
import Escudo.Escudo;
import Observar.Observado;
import Observar.Observador;
import Personagem.Estado.EstadoForte;
import Personagem.Estado.EstadoMorto;
import Personagem.Estado.EstadoNormal;
import Personagem.Estado.EstadoPerigo;
import Personagem.Personagem;
import Pular.PuloMedio;
import Recompensa.Recompensa;

public abstract class Inimigo extends Personagem implements Observador
{
	public Inimigo(int x, int y)
	{
		super(new AtaqueMedio(), new CorrerMedio(), new PuloMedio(), x, y, new Escudo(50.0));
	}

	@Override
	public void Pular()
	{
		super.getPulo().Pular();
	}

	@Override
	public void Correr(Personagem atacante, Personagem alvo, int x, int y)
	{
		super.getCorrida().Correr(atacante, alvo);
		if (((atacante.getX() - alvo.getX()) == 0) && ((atacante.getY() - alvo.getY()) == 0))
		{
			atacante.Atacar(atacante, alvo);
		}
	}

	@Override
	public void Atacar(Personagem atacante, Personagem alvo)
	{
		super.getAtaque().Atacar(atacante, alvo);
	}

	@Override
	public void PegarRecompensa(Recompensa r)
	{
		super.setVida(super.getVida() + r.Energia);

		// checa o estado
		if (super.getVida() > 0 && super.getVida() < 30 && !(super.getEstado() instanceof EstadoPerigo))
		{
			super.setEstado(new EstadoPerigo());
		}
		else if (super.getVida() >= 30 && super.getVida() < 70 && !(super.getEstado() instanceof EstadoNormal))
		{
			super.setEstado(new EstadoNormal());
		}
		else if (super.getVida() >= 70 && !(super.getEstado() instanceof EstadoForte))
		{
			super.setEstado(new EstadoForte());
		}
		else if (super.getVida() <= 0 && !(super.getEstado() instanceof EstadoMorto))
		{
			super.setEstado(new EstadoMorto());
		}
	}

	@Override
	public void atualizar(Observado o)
	{
		var p = (Personagem) o;
		Correr(this, p, p.getX(), p.getY());
	}
}
