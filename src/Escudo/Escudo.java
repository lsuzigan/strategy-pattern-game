package Escudo;

public class Escudo extends IEscudo
{
	public Escudo(double defesa)
	{
		super(defesa);
	}

	@Override
	public double Defender(double ataque)
	{
		if (Defesa > 0)
		{
			var ataqueDefendido = ataque - Defesa;
			Defesa -= ataque;
			if (Defesa < 0)
				Defesa = 0;

			if (Proximo != null && Proximo.Defesa > 0 && ataqueDefendido > 0)
			{
				Proximo.Defender(ataqueDefendido);
			}

			System.out.println("\tDefesa realizada. Defesa restante = " + Defesa);
			return ataqueDefendido < 0 ? 0 : ataqueDefendido;
		}
		else
		{
			return ataque;
		}
	}
}
