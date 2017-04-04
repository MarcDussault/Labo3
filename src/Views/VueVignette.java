package Views;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class VueVignette extends JPanel
{
	private JPanel panelVignette;
	
	public VueVignette()
	{
		panelVignette = new JPanel();
		
		panelVignette.setSize(new Dimension(160,160));
		panelVignette.setBorder(BorderFactory.createTitledBorder("Vignette"));
        panelVignette.setBackground(Color.RED);
        panelVignette.setName("Vignette");
	}
	
	
}
