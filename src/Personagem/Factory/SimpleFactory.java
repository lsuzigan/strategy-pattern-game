package Personagem.Factory;

import Personagem.Personagem;
import Personagem.PersonagemUm;
import Personagem.PersonagemDois;
import Personagem.PersonagemTres;
import Personagem.PersonagemQuatro;
import Personagem.PersonagemCinco;
import Personagem.FactoryMethod;

public class SimpleFactory implements FactoryMethod
{
	private static SimpleFactory instance = new SimpleFactory();

	private SimpleFactory() {}

	public static SimpleFactory getInstance()
	{
		if (instance == null)
			instance = new SimpleFactory();

		return instance;
	}

	public Personagem criaPersonagem(int x, int y)
	{
		var randomPersonagem = Math.random();
		if (randomPersonagem <= 0.2)
		{
			return new PersonagemUm(x, y);
		}
		else if (0.2 < randomPersonagem && randomPersonagem <= 0.4)
		{
			return new PersonagemDois(x, y);
		}
		else if (0.4 < randomPersonagem && randomPersonagem <= 0.6)
		{
			return new PersonagemTres(x, y);
		}
		else if (0.6 < randomPersonagem && randomPersonagem <= 0.8)
		{
			return new PersonagemQuatro(x, y);
		}
		else
		{
			return new PersonagemCinco(x, y);
		}
	}
}
