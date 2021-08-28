package Personagem.Estado;

import Atacar.IAtaque;
import Correr.ICorrida;
import Personagem.Personagem;

public interface IEstado
{
	void mudaAtaque(Personagem p);
	void mudaCorrida(Personagem p);
}
