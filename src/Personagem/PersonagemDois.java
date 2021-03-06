package Personagem;

import Atacar.AtaqueForte;
import Atacar.AtaqueMedio;
import Correr.CorrerMedio;
import Correr.CorrerRapido;
import Escudo.Escudo;
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
		super(new AtaqueMedio(), new CorrerRapido(), new PuloAlto(), x, y, new Escudo(10.0));
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
