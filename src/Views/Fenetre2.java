package Views;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Fenetre2 extends JFrame {

	
	private JPanel contentPane;
	public JPanel panelVignette;
	public JPanel panelOutils;
	

	void insererImageVignette() throws IOException 
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
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre2 frame2 = new Fenetre2();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Fenetre2() throws IOException {
		
		//JFrame frame = new JFrame();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFileChooser selecteurFichier = new JFileChooser();
		selecteurFichier.setCurrentDirectory(new File(System.getProperty("user.home")));
		FileNameExtensionFilter filtreJPG = new FileNameExtensionFilter("jpg image (*.jpg)","jpg");

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
		
		JMenuItem mntmInsererImage = new JMenuItem("Ins\u00E9rer image");
		mnEdition.add(mntmInsererImage);
		
		mntmInsererImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				selecteurFichier.setFileFilter(filtreJPG);
				int fichierChoisi = selecteurFichier.showOpenDialog(getParent());
				
				if (fichierChoisi == selecteurFichier.APPROVE_OPTION)
				{
					File fichierSelectionner = selecteurFichier.getSelectedFile();
					String strFichier = fichierSelectionner.getName();
					String extFichier = strFichier.substring(strFichier.lastIndexOf("."));
					if (extFichier.equals(".jpg"))
					{
						try 
						{
							insererImageVignette();
							System.out.println("inserer");
						} 
						catch (IOException e1)
						{
							e1.printStackTrace();
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Le fichier selectionné doit être en .jpg", "Erreur", JOptionPane.ERROR_MESSAGE);
					}	
				}
			}

	
		});

		
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
		
		//panelVignette = new VueVignette();
		/*panelVignette = new JPanel();
		
		panelVignette.setSize(new Dimension(160,160));
		panelVignette.setBorder(BorderFactory.createTitledBorder("Vignette"));
        panelVignette.setBackground(Color.RED);
        panelVignette.setName("Vignette");*/
        
  		/*JPanel panelOutils = new JPanel();
		panelOutils.setPreferredSize(new Dimension(60,160));
		panelOutils.setBorder(BorderFactory.createTitledBorder("Outils"));
        //panelOutils.setBackground(Color.GREEN);
        panelOutils.setName("Outils");*/
        
        
        /*JPanel panelTranslation = new JPanel();
        panelTranslation.setPreferredSize(new Dimension(140,140));
        panelTranslation.setBorder(BorderFactory.createTitledBorder("Translation"));
        //panelTranslation.setBackground(Color.YELLOW);
        panelTranslation.setName("Translation");
        panelOutils.add(panelTranslation, BorderLayout.NORTH);*/
        
        /*JButton btHaut = new JButton("up");
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
        
        JPanel panelZoom = new JPanel();
        panelZoom.setPreferredSize(new Dimension(140,140));
        panelZoom.setBorder(BorderFactory.createTitledBorder("Zoom"));
        //panelZoom.setBackground(Color.CYAN);
        panelZoom.setName("ZOOM");
        panelOutils.add(panelZoom, BorderLayout.CENTER);
        */
        
        
        
        panelGauche.add(panelVignette, BorderLayout.NORTH);
        panelGauche.add(panelOutils, BorderLayout.CENTER);
        
        insererImageVignette();
		
	}
	
	public ImageIcon createImageIcon(String path)
	{
	    return new ImageIcon(path);
	}
	
}
