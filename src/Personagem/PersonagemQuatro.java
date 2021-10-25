package Personagem;

import Atacar.AtaqueForte;
import Correr.CorrerMedio;
import Escudo.Escudo;
import Observar.Observado;
import Observar.Observador;
import Pular.PuloMedio;
import Recompensa.Recompensa;

public class PersonagemQuatro extends Personagem implements Observado
{
	public PersonagemQuatro(int x, int y)
	{
		super(new AtaqueForte(), new CorrerMedio(), new PuloMedio(), x, y, new Escudo(20.0));
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
	}

	@Override
	public void adicionarObservador(Observador o)
	{
		super.getObservadores().add(o);
	}

	@Override
	public void removerObservador(Observador o)
	{
		super.getObservadores().remove(o);
	}

	@Override
	public void notificarObservador()
	{
		for (var o : getObservadores())
		{
			o.atualizar(this);
		}
	}
}
