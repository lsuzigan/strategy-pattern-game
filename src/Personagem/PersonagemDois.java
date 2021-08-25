package Personagem;

import Atacar.AtaqueMedio;
import Correr.CorrerRapido;
import Pular.PuloAlto;

public class PersonagemDois extends Personagem
{
	// Acoes do personagem
	private PuloAlto Pulo;
	private CorrerRapido Corrida;
	private AtaqueMedio Ataque = new AtaqueMedio();

	public PersonagemDois(double vida)
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
