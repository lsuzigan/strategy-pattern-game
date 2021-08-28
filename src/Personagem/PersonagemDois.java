package Personagem;

import Atacar.AtaqueForte;
import Atacar.AtaqueMedio;
import Correr.CorrerMedio;
import Correr.CorrerRapido;
import Observar.Observado;
import Observar.Observador;
import Personagem.Estado.EstadoForte;
import Personagem.Estado.EstadoMorto;
import Personagem.Estado.EstadoNormal;
import Personagem.Estado.EstadoPerigo;
import Pular.PuloAlto;
import Pular.PuloMedio;
import Recompensa.Recompensa;

public class PersonagemDois extends Personagem implements Observado
{
	public PersonagemDois(int x, int y)
	{
		super(new AtaqueMedio(), new CorrerRapido(), new PuloAlto(), x, y);
	}

	@Override
	public void Pular()
	{
		super.getPulo().Pular();
	}

	@Override
	public void Correr(Personagem atacante, Personagem alvo, int x, int y)
	{
		super.getCorrida().Correr(atacante, alvo, x, y);
		notificarObservador();
	}

	@Override
	public void Atacar(Personagem alvo)
	{
		super.getAtaque().Atacar(alvo);
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
	public void adicionarObservador(Observador o)
	{

	}

	@Override
	public void removerObservador(Observador o)
	{

	}

	@Override
	public void notificarObservador()
	{

	}
}
