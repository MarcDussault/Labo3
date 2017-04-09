package Views;

import Modeles.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.*;

public class ClasseMain
{

	public static JPanel contentPane ;
	public static VueVignette vueVignette ;
	public static VueOutils vueOutils ;
	public static VueZoneDessin vueZoneDessin ;
	public static JPanel panelGauche;
	public static JPanel panelGlobal;
	
	public static void CreationFenetre()
	{
		Fenetre frame = new Fenetre();
		frame.setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		frame.setContentPane(contentPane);
		
		panelGlobal = new JPanel(new BorderLayout(1,1));
		contentPane.add(panelGlobal, BorderLayout.CENTER);
		
		panelGauche = new JPanel(new BorderLayout(3,3));
		panelGlobal.add(panelGauche, BorderLayout.WEST);
		
		vueVignette = new VueVignette(panelGauche);
		vueOutils = new VueOutils(panelGauche);
		vueZoneDessin = new VueZoneDessin(panelGlobal);
		//insererImageVignette ("lol");
	}
	
	public static void insererImageVignette (String strFichier) /*throws IOException*/
	{
<<<<<<< HEAD
		System.out.println("appel de vue vignette pour inserer image");
		try
		{
			vueVignette.insererImageVignette(strFichier);
=======
		try
		{
			vueVignette.insererImageVignette(strFichier);
			vueZoneDessin.insererImage(strFichier);
>>>>>>> refs/remotes/origin/master
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		panelGauche.revalidate();
		panelGauche.repaint();
<<<<<<< HEAD
=======
		/*panelGlobal.revalidate();
		panelGlobal.repaint();*/
>>>>>>> refs/remotes/origin/master
	}
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					CreationFenetre();
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
				
			}
		
		});
		
		//Modeles model = new Modeles();
		
		//VueOutils vueOutils = new VueOutils();
		//VueVignette vueVignette = new VueVignette();
		//VueZoneDessin vueZoneDessin = new VueZoneDessin();
		//ControllerOutils controllerOutils = new ControllerOutils(model, vueOutils);
		//ControllerZoneDessin controllerZoneDessin = new ControllerZoneDessin(model, vueZoneDessin);
		
	}
}
