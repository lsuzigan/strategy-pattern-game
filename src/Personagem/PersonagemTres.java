package Personagem;

import Atacar.AtaqueForte;
import Correr.CorrerRapido;
import Pular.PuloBaixo;

public class PersonagemTres extends Personagem
{
	// Acoes do personagem
	private PuloBaixo Pulo;
	private CorrerRapido Corrida;
	private AtaqueForte Ataque = new AtaqueForte();

	public PersonagemTres(double vida)
	{
		super(vida);
	}

	@Override
	public void Pular()
	{
		Pulo.Pular();
	}

	@Override
	public void Correr()
	{
		Corrida.Correr();
	}

	@Override
	public void Atacar(Personagem alvo)
	{
		Ataque.Atacar(alvo);
	}
}
