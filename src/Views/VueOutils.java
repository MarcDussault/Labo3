package Views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class VueOutils extends JPanel
{

	public VueOutils(JPanel panelGauche)
	{
		// Section global de la section outils
		JPanel panelOutils = new JPanel();
		panelOutils.setPreferredSize(new Dimension(150,300));
		panelOutils.setBorder(BorderFactory.createTitledBorder("Outils"));
		panelOutils.setName("Outils");
		        
		// Section translation de la vue Outils
		JPanel panelTranslation = new JPanel();
		panelTranslation.setPreferredSize(new Dimension(140,140));
		panelTranslation.setBorder(BorderFactory.createTitledBorder("Translation"));
		panelOutils.add(panelTranslation, BorderLayout.NORTH);
		
		JPanel panelZoom = new JPanel();
	    panelZoom.setPreferredSize(new Dimension(140,140));
	    panelZoom.setBorder(BorderFactory.createTitledBorder("Zoom"));
	    panelOutils.add(panelZoom, BorderLayout.CENTER);
		
		panelGauche.add(panelOutils, BorderLayout.CENTER);
		        
		        /*
		        JButton btHaut = new JButton("up");
		        //btGauche.setVerticalTextPosition(AbstractButton.CENTER);
		        //btGauche.setHorizontalTextPosition(AbstractButton.LEADING); //aka LEFT, for left-to-right locales
		        //btGauche.setMnemonic(KeyEvent.VK_D);
		       // btGauche.setActionCommand("disable");
		        btHaut.setSize(new Dimension(200,200));
		        //btHaut.setIcon(iconBoutonDroite);
		        panelTranslation.add(btHaut, BorderLayout.NORTH);
		        
		        ImageIcon iconBoutonGauche = createImageIcon("flecheGauche.png");
		        
		        JButton btGauche = new JButton("<-",iconBoutonGauche);
		        //btGauche.setVerticalTextPosition(AbstractButton.CENTER);
		        //btGauche.setHorizontalTextPosition(AbstractButton.LEADING); //aka LEFT, for left-to-right locales
		        //btGauche.setMnemonic(KeyEvent.VK_D);
		       // btGauche.setActionCommand("disable");
		        btGauche.setSize(new Dimension(200,200));
		        panelTranslation.add(btGauche, BorderLayout.WEST);
		        
		        ImageIcon iconBoutonDroite = createImageIcon("flecheDroite.png");
		        
		        JButton btDroite = new JButton("->");
		        //btGauche.setVerticalTextPosition(AbstractButton.CENTER);
		        //btGauche.setHorizontalTextPosition(AbstractButton.LEADING); //aka LEFT, for left-to-right locales
		        //btGauche.setMnemonic(KeyEvent.VK_D);
		       // btGauche.setActionCommand("disable");
		        btDroite.setSize(new Dimension(100,100));
		        btDroite.setIcon(iconBoutonDroite);
		        panelTranslation.add(btDroite, BorderLayout.EAST);
		        
		        JButton btBas = new JButton("down");
		        //btGauche.setVerticalTextPosition(AbstractButton.CENTER);
		        //btGauche.setHorizontalTextPosition(AbstractButton.LEADING); //aka LEFT, for left-to-right locales
		        //btGauche.setMnemonic(KeyEvent.VK_D);
		       // btGauche.setActionCommand("disable");
		        btBas.setSize(new Dimension(100,100));
		        btBas.setIcon(iconBoutonDroite);
		        panelTranslation.add(btBas, BorderLayout.SOUTH);
		        
		       */		
	}
}


