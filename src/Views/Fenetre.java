package Views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFileChooser;
import java.io.File;
import java.lang.Object;
import java.util.List;
import javax.swing.JEditorPane;
import javax.swing.JList;



public class Fenetre extends JFrame {
	
	public JPanel panel ;
	File fichierSelectionner = new File("");
	/**
	 * Constructeur de la classe. sert à créer la fenetre, les boutons
	 */
	public Fenetre()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(25, 25, 700, 700);
		
		panel = new JPanel(new GridLayout(0,1));
		panel.setBackground(Color.white);

	    /*JScrollPane scrollpane = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	    add(scrollpane);
	    setVisible(true);*/
    
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JFileChooser selecteurFichier = new JFileChooser();
		selecteurFichier.setCurrentDirectory(new File(System.getProperty("user.home")));
		FileNameExtensionFilter filtreXml = new FileNameExtensionFilter("xml files (*.xml)","xml");
		
		Client monClient = new Client();
		
		JButton btTableDesMatieres = new JButton("Table des mati\u00E8res");
		btTableDesMatieres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				monClient.BoutonTableDesMatieres();
			}
		});
		menuBar.add(btTableDesMatieres);
		
		JButton btTexteFormate = new JButton("Texte format\u00E9");
		btTexteFormate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				try {
					monClient.BoutonTexteFormate();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		menuBar.add(btTexteFormate);
		
		JButton btChoisirUnFichier = new JButton("Choisir un fichier");
		btChoisirUnFichier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				selecteurFichier.setFileFilter(filtreXml);
				int fichierChoisi = selecteurFichier.showOpenDialog(getParent());
				
				if (fichierChoisi == selecteurFichier.APPROVE_OPTION)
				{
					fichierSelectionner = selecteurFichier.getSelectedFile();
					String strFichier = fichierSelectionner.getName();
					String extFichier = strFichier.substring(strFichier.lastIndexOf("."));
					
					if (extFichier.equals(".xml"))
					{
						monClient.BoutonChoisirUnFichier();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Le fichier selectionné doit être en .xml", "Erreur", JOptionPane.ERROR_MESSAGE);
					}	
				}
			}
		});
		menuBar.add(btChoisirUnFichier);
		
		
		setContentPane(panel);
		//getContentPane().add(panel, BorderLayout.NORTH);
		
	}
        

	public void initPanel()
	{
		panel.removeAll();
		setContentPane(panel);
	}
	
	public void ecrireTitreLivre (String str)
	{
		
		JLabel labelTitreLivre = new JLabel("<html><h1>"+ str + "</h1></html>");
		panel.add(labelTitreLivre);
		panel.setVisible(true);
		setContentPane(panel);
	}
	
	public void ecrireTitreChapitre (String str)
	{
		JLabel labelTitreChapitre = new JLabel("<html><h2>"+ str + "</h2></html>");
		panel.add(labelTitreChapitre);
		panel.setVisible(true);
		setContentPane(panel);
	}
	
	public void ecrireParagraphe (String str)
	{
		JLabel labelParagraphe = new JLabel("<html>"+ str + "</html>");
		panel.add(labelParagraphe);
		panel.setVisible(true);
		setContentPane(panel);
	}
	
	//Retourne le File sélectionné par l'utilisateur
	public File getFile(){
		
		return fichierSelectionner;
				
	}
	
	//Indique à l'appelant si le fichier est chargé
	public boolean FileLoaded(){
		
		if(fichierSelectionner.exists()){
			
			return true;
			
		}
		
		return false;
		
	}
}
