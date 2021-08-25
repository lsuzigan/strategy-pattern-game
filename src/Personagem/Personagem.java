package Personagem;

public abstract class Personagem
{
	private double Vida;

	public double getVida()
	{
		return Vida;
	}

	public void setVida(double vida)
	{
		Vida = vida;
	}

	public Personagem(double vida)
	{
		Vida = vida;
	}

	public abstract void Pular();
	public abstract void Correr();
	public abstract void Atacar(Personagem alvo);
}
