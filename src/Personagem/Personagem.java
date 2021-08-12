package Personagem;

public class Personagem
{
	private double Vida;
	private String TipoPulo;

	public Personagem(double vida, String tipoPulo)
	{
		Vida = vida;
		TipoPulo = tipoPulo.toUpperCase();
	}

	public double getVida()
	{
		return Vida;
	}

	public void setVida(double vida)
	{
		Vida = vida;
	}

	public String getTipoPulo()
	{
		return TipoPulo;
	}

	public void setTipoPulo(String tipoPulo)
	{
		TipoPulo = tipoPulo;
	}
}
