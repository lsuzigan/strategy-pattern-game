package Observar;

public interface Observado
{
	void adicionarObservador(Observador o);
	void removerObservador(Observador o);
	void notificarObservador();
}
