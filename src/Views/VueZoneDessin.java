package Views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VueZoneDessin
{
	public JPanel panelDroite ;
	
	public void insererImage(String str) throws IOException 
	{
		panelDroite.removeAll();
		BufferedImage myPicture = ImageIO.read(new File(str));
		Image myPictureResized = myPicture.getScaledInstance(panelDroite.getHeight() - 200, panelDroite.getHeight() - 200, Image.SCALE_SMOOTH );
		ImageIcon imageIcon = new ImageIcon(myPictureResized);
		JLabel picLabel = new JLabel(imageIcon);
		//Image scaledImage = originalImage.getScaledInstance(jPanel.getWidth(),jPanel.getHeight(),Image.SCALE_SMOOTH);
		panelDroite.setLayout(new GridBagLayout());
		panelDroite.add(picLabel);
	}
	public VueZoneDessin(JPanel panelGlobal)
	{
		panelDroite = new JPanel();
		panelDroite.setPreferredSize(new Dimension(600,600));
		panelDroite.setBorder(BorderFactory.createTitledBorder("Zone de dessin"));
		panelGlobal.add(panelDroite, BorderLayout.CENTER);
	}

}
