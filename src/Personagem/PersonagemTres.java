package Personagem;

public class PersonagemTres implements Personagem
{
	private double Vida;

	public PersonagemTres(double vida)
	{
		Vida = vida;
	}

	public double getVida()
	{
		return Vida;
	}

	public void setVida(double vida)
	{
		Vida = vida;
	}

	@Override
	public void Pular()
	{

	}

	@Override
	public void Correr()
	{

	}

	@Override
	public void Atacar()
	{

	}
}
