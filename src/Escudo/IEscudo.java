package Escudo;

public abstract class IEscudo
{
	double Defesa;
	IEscudo Proximo = null;

	public IEscudo(double defesa)
	{
		Defesa = defesa;
	}

	public abstract double Defender(double ataque);

	public double getDefesa()
	{
		return Defesa;
	}

	public void setDefesa(double defesa)
	{
		Defesa = defesa;
	}

	public IEscudo getProximo()
	{
		return Proximo;
	}

	public void setProximo(IEscudo proximo)
	{
		Proximo = proximo;
	}
}
