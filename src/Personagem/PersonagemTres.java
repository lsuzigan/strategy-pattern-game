package Personagem;

import Atacar.AtaqueForte;
import Correr.CorrerRapido;
import Escudo.Escudo;
import Observar.Observado;
import Observar.Observador;
import Personagem.Estado.EstadoForte;
import Personagem.Estado.EstadoMorto;
import Personagem.Estado.EstadoNormal;
import Personagem.Estado.EstadoPerigo;
import Pular.PuloBaixo;
import Recompensa.Recompensa;

public class PersonagemTres extends Personagem implements Observado
{
	public PersonagemTres(int x, int y)
	{
		super(new AtaqueForte(), new CorrerRapido(), new PuloBaixo(), x, y, new Escudo(0.0));
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
		notificarObservador();
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
