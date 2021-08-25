package Personagem;

import Atacar.AtaqueForte;
import Correr.CorrerMedio;
import Pular.PuloMedio;

public class PersonagemUm extends Personagem
{
	// Acoes do personagem
	private PuloMedio Pulo;
	private CorrerMedio Corrida;
	private AtaqueForte Ataque = new AtaqueForte();

	public PersonagemUm(double vida)
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
