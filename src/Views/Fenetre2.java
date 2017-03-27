package Views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Fenetre2 extends JFrame {

	private JPanel contentPane;
	private JPanel panelVignette;

	

	void insererImage() throws IOException 
	{
		
			BufferedImage myPicture = ImageIO.read(new File("Warriors.jpg"));
			Image myPictureResized = myPicture.getScaledInstance(panelVignette.getWidth() - 30, panelVignette.getHeight() - 30, Image.SCALE_SMOOTH );
			ImageIcon imageIcon = new ImageIcon(myPictureResized);
			
			JLabel picLabel = new JLabel(imageIcon);
			
			//Image scaledImage = originalImage.getScaledInstance(jPanel.getWidth(),jPanel.getHeight(),Image.SCALE_SMOOTH);
			panelVignette.add(picLabel);			
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre2 frame = new Fenetre2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Fenetre2() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);
		
		JMenuItem mntmOuvrir = new JMenuItem("Ouvrir");
		mnFichier.add(mntmOuvrir);
		
		JMenuItem mntmSauvegarder = new JMenuItem("Sauvegarder");
		mnFichier.add(mntmSauvegarder);
		
		JMenu mnEdition = new JMenu("Edition");
		menuBar.add(mnEdition);
		
		JMenuItem mntmInsrerImage = new JMenuItem("Ins\u00E9rer image");
		mnEdition.add(mntmInsrerImage);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelGlobal = new JPanel(new BorderLayout(1,1));
		contentPane.add(panelGlobal, BorderLayout.CENTER);
		
		JPanel panelGauche = new JPanel(new BorderLayout(3,3));
		panelGlobal.add(panelGauche, BorderLayout.WEST);
		
		JPanel panelDroite = new JPanel();
		panelDroite.setBorder(BorderFactory.createTitledBorder("Zone de dessin"));
		//panelDroite.setBackground(Color.BLUE);
		panelGlobal.add(panelDroite, BorderLayout.CENTER);
		
		panelVignette = new JPanel();
		
		panelVignette.setSize(new Dimension(150,150));
		panelVignette.setBorder(BorderFactory.createTitledBorder("Vignette"));
        //panelVignette.setBackground(Color.RED);
        panelVignette.setName("Vignette");
        
  		JPanel panelOutils = new JPanel();
		panelOutils.setPreferredSize(new Dimension(60,120));
		panelOutils.setBorder(BorderFactory.createTitledBorder("Outils"));
        //panelOutils.setBackground(Color.GREEN);
        panelOutils.setName("Outils");
        
        
        JPanel panelTranslation = new JPanel();
        panelTranslation.setPreferredSize(new Dimension(150,150));
        panelTranslation.setBorder(BorderFactory.createTitledBorder("Translation"));
        //panelTranslation.setBackground(Color.YELLOW);
        panelTranslation.setName("Translation");
        panelOutils.add(panelTranslation, BorderLayout.NORTH);
        
        JPanel panelZoom = new JPanel();
        panelZoom.setPreferredSize(new Dimension(150,150));
        panelZoom.setBorder(BorderFactory.createTitledBorder("Zoom"));
        //panelZoom.setBackground(Color.CYAN);
        panelZoom.setName("ZOOM");
        panelOutils.add(panelZoom, BorderLayout.CENTER);
        
        panelGauche.add(panelVignette, BorderLayout.NORTH);
        panelGauche.add(panelOutils, BorderLayout.CENTER);
        
        insererImage();
		
	}
	
}
