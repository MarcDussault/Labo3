package Views;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class VueZoneDessin
{

	public VueZoneDessin(JPanel panelGlobal)
	{
		JPanel panelDroite = new JPanel();
		panelDroite.setPreferredSize(new Dimension(600,600));
		panelDroite.setBorder(BorderFactory.createTitledBorder("Zone de dessin"));
		panelGlobal.add(panelDroite, BorderLayout.CENTER);
	}

}
