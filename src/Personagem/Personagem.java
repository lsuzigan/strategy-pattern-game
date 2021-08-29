package Personagem;

import Atacar.IAtaque;
import Correr.ICorrida;
import Escudo.IEscudo;
import Observar.Observador;
import Personagem.Estado.EstadoNormal;
import Personagem.Estado.IEstado;
import Pular.IPulo;
import Recompensa.Recompensa;

import java.util.ArrayList;

// CLASSE ABSTRATA DO STRATEGY PERSONAGEM
public abstract class Personagem
{
	private double Vida;
	private IAtaque Ataque;
	private ICorrida Corrida;
	private IPulo Pulo;
	private IEstado Estado;
	private int X;
	private int Y;
	private ArrayList<Observador> Observadores = new ArrayList<Observador>();
	private IEscudo Escudo;

	public Personagem(IAtaque ataque, ICorrida corrida, IPulo pulo, int x, int y, IEscudo escudo)
	{
		Vida = 70;
		Ataque = ataque;
		Corrida = corrida;
		Pulo = pulo;
		Estado = new EstadoNormal();
		X = x;
		Y = y;
		Escudo = escudo;
	}

	public int getX()
	{
		return X;
	}

	public void setX(int x)
	{
		X = x;
	}

	public int getY()
	{
		return Y;
	}

	public void setY(int y)
	{
		Y = y;
	}

	public double getVida()
	{
		return Vida;
	}

	public void setVida(double vida)
	{
		Vida = vida;
	}

	public IAtaque getAtaque()
	{
		return Ataque;
	}

	public void setAtaque(IAtaque ataque)
	{
		Ataque = ataque;
	}

	public ICorrida getCorrida()
	{
		return Corrida;
	}

	public void setCorrida(ICorrida corrida)
	{
		Corrida = corrida;
	}

	public IPulo getPulo()
	{
		return Pulo;
	}

	public void setPulo(IPulo pulo)
	{
		Pulo = pulo;
	}

	public IEstado getEstado()
	{
		return Estado;
	}

	public void setEstado(IEstado estado)
	{
		Estado = estado;
	}

	public ArrayList<Observador> getObservadores()
	{
		return Observadores;
	}

	public IEscudo getEscudo()
	{
		return Escudo;
	}

	public void setEscudo(IEscudo escudo)
	{
		Escudo = escudo;
	}

	public abstract void Pular();
	public abstract void Correr(Personagem atacante, Personagem alvo, int x, int y);
	public abstract void Atacar(Personagem atacante, Personagem alvo);
	public abstract void PegarRecompensa(Recompensa r);
}
