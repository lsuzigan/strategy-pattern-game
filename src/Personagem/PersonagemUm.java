package Personagem;
import Pular.IPular;

public class PersonagemUm implements Personagem
{
	private double Vida;
	private IPular TipoPulo;

	public PersonagemUm(double vida)
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
