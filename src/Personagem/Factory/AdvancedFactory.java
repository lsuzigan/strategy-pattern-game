package Personagem.Factory;

import Atacar.Decorador.AtaqueAgua;
import Atacar.Decorador.AtaqueFogo;
import Atacar.Decorador.AtaqueGelo;
import Atacar.Decorador.Decorador;
import Personagem.Personagem;
import Personagem.PersonagemUm;
import Personagem.PersonagemDois;
import Personagem.PersonagemTres;
import Personagem.PersonagemQuatro;
import Personagem.PersonagemCinco;
import Personagem.FactoryMethod;

public class AdvancedFactory implements FactoryMethod
{
	private static AdvancedFactory instance = new AdvancedFactory();

	private AdvancedFactory() {}

	public static AdvancedFactory getInstance()
	{
		if (instance == null)
			instance = new AdvancedFactory();

		return instance;
	}

	public Personagem criaPersonagem(int x, int y)
	{
		var randomPersonagem = Math.random();
		if (randomPersonagem <= 0.2)
		{
			var p = new PersonagemUm(x, y);
			p.setAtaque(defineAtaque(p));
			return p;
		}
		else if (0.2 < randomPersonagem && randomPersonagem <= 0.4)
		{
			var p = new PersonagemDois(x, y);
			p.setAtaque(defineAtaque(p));
			return p;
		}
		else if (0.4 < randomPersonagem && randomPersonagem <= 0.6)
		{
			var p = new PersonagemTres(x, y);
			p.setAtaque(defineAtaque(p));
			return p;
		}
		else if (0.6 < randomPersonagem && randomPersonagem <= 0.8)
		{
			var p = new PersonagemQuatro(x, y);
			p.setAtaque(defineAtaque(p));
			return p;
		}
		else
		{
			var p = new PersonagemCinco(x, y);
			p.setAtaque(defineAtaque(p));
			return p;
		}
	}

	private static Decorador defineAtaque(Personagem p)
	{
		var randomAtaque = Math.random();
		if (randomAtaque <= 0.3)
		{
			return new AtaqueAgua(p.getAtaque());
		}
		else if (0.3 < randomAtaque && randomAtaque <= 0.6)
		{
			return new AtaqueFogo(p.getAtaque());
		}
		else
		{
			return new AtaqueGelo(p.getAtaque());
		}
	}
}
