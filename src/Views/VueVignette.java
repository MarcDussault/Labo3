package Views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VueVignette extends JPanel
{
	
	JPanel panelVignette ;
	
	
	
	public VueVignette(JPanel panelGauche)
	{
		panelVignette = new JPanel();
		panelVignette.setPreferredSize(new Dimension(150,150));
		//panelVignette.setSize(new Dimension(160,160));
		panelVignette.setBorder(BorderFactory.createTitledBorder("Vignette"));
        panelGauche.add(panelVignette, BorderLayout.NORTH);
	}
	
	public void insererImageVignette(String str) throws IOException 
	{
<<<<<<< HEAD
		
		BufferedImage myPicture = ImageIO.read(new File("Warriors.jpg"));
=======
		panelVignette.removeAll();
		BufferedImage myPicture = ImageIO.read(new File(str));
>>>>>>> refs/remotes/origin/master
		Image myPictureResized = myPicture.getScaledInstance(panelVignette.getWidth() - 30, panelVignette.getHeight() - 30, Image.SCALE_SMOOTH );
		ImageIcon imageIcon = new ImageIcon(myPictureResized);
		JLabel picLabel = new JLabel(imageIcon);
		//Image scaledImage = originalImage.getScaledInstance(jPanel.getWidth(),jPanel.getHeight(),Image.SCALE_SMOOTH);
		panelVignette.add(picLabel);
<<<<<<< HEAD
		
		//panelGauche.add(panelVignette, BorderLayout.NORTH);
		//ClasseMain.
=======
>>>>>>> refs/remotes/origin/master
	}
}
