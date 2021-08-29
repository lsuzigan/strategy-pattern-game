import Observar.Observador;
import Personagem.Estado.EstadoMorto;
import Personagem.Inimigo.Inimigo;
import Personagem.Inimigo.Ogro;
import Personagem.PersonagemUm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Jogo extends JPanel
{
	PersonagemUm personagem = new PersonagemUm(600, 400);
	Ogro ogro = new Ogro(200, 450);

	public Jogo()
	{
		var listener = new MyKeyListener();
		addKeyListener(listener);
		setFocusable(true);
	}

	public class MyKeyListener implements KeyListener
	{

		@Override
		public void keyTyped(KeyEvent e)
		{

		}

		@Override
		public void keyPressed(KeyEvent e)
		{
			if (e.getKeyCode() == KeyEvent.VK_SPACE)
			{
//				System.out.println("ESPACO");
				if (personagem.getObservadores().size() > 0)
				{
					var listaInimigosMortos = new ArrayList<Observador>();
					for (var o : personagem.getObservadores())
					{
						var alvo = (Inimigo) o;
						personagem.Atacar(personagem, alvo);
						if (alvo.getEstado() instanceof EstadoMorto)
						{
							 listaInimigosMortos.add(o);
						}
					}

					for (var o : listaInimigosMortos)
					{
						personagem.getObservadores().remove(o);
					}
				}
			}
		}

		@Override
		public void keyReleased(KeyEvent e)
		{

		}
	}

	public void paint(Graphics g)
	{
		super.paint(g);

		var g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g2d.setColor(Color.GREEN);
		g2d.fillOval(ogro.getX(), ogro.getY(), 40, 40);
		FontMetrics fm = g.getFontMetrics();
		double textWidth = fm.getStringBounds(Double.toString(ogro.getVida()), g).getWidth();
		g2d.setColor(Color.BLACK);
		g2d.drawString(Double.toString(ogro.getVida()),
				(int) (ogro.getX() - textWidth / 2),
				(int) (ogro.getY() + fm.getMaxAscent() / 2));

		fm = g.getFontMetrics();
		textWidth = fm.getStringBounds(Double.toString(ogro.getEscudo().getDefesa()), g).getWidth();
		g2d.setColor(Color.RED);
		g2d.drawString(Double.toString(ogro.getEscudo().getDefesa()),
				(int) (ogro.getX() - textWidth),
				(int) (ogro.getY() + fm.getMaxAscent() * 2));

		g2d.setColor(Color.PINK);
		g2d.fillOval(personagem.getX(), personagem.getY(), 20, 20);
		fm = g.getFontMetrics();
		textWidth = fm.getStringBounds(Double.toString(personagem.getVida()), g).getWidth();
		g2d.setColor(Color.BLACK);
		g2d.drawString(Double.toString(personagem.getVida()),
				(int) (personagem.getX() + 10),
				(int) (personagem.getY()));

	}
}
