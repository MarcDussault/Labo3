package Views;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Fenetre extends JFrame
{

	public ClasseMain classeMain;
	
	private void InsererImage() 
	{
		JFileChooser selecteurFichier = new JFileChooser();
		selecteurFichier.setCurrentDirectory(new File(System.getProperty("user.home")));
		FileNameExtensionFilter filtreJPG = new FileNameExtensionFilter("jpg image (*.jpg)","jpg");
		
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
					classeMain.vueVignette.insererImageVignette();
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

	
	public void CreationMenu()
	{
		// création du menu en haut
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
				
		// Onglet Fichier
		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);
				
		JMenuItem mntmOuvrirProjet = new JMenuItem("Ouvrir projet");
		mnFichier.add(mntmOuvrirProjet);
				
		JMenuItem mntmSauvegarderProjet = new JMenuItem("Sauvegarder projet");
		mnFichier.add(mntmSauvegarderProjet);
		
		// Onglet édition			
		JMenu mnEdition = new JMenu("Edition");
		menuBar.add(mnEdition);
			
		JMenuItem mntmInsererImage = new JMenuItem("Insérer image");
		mnEdition.add(mntmInsererImage);
		
		mntmInsererImage.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				InsererImage();
			}	
		});
		
		JMenuItem mntmUndo = new JMenuItem("Undo");
		mnEdition.add(mntmUndo);
	}
	

	public Fenetre ()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 1000, 600); 			
		
		CreationMenu();
		
	}
	/*private JFrame frame = null;
	private JPanel contentPane = null;
	private JSpinner spinner = null;
	private SpinnerNumberModel spinnerModel = null;
	private JButton button = null;*/
	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre frame = new Fenetre();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	//}
}


