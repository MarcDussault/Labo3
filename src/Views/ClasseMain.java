package Views;

import Modeles.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.*;

public class ClasseMain
{

	public static JPanel contentPane ;
	public static VueVignette vueVignette ;
	public static VueOutils vueOutils ;
	public static VueZoneDessin vueZoneDessin ;
	
	public static void CreationFenetre()
	{
		Fenetre frame = new Fenetre();
		frame.setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		frame.setContentPane(contentPane);
		
		JPanel panelGlobal = new JPanel(new BorderLayout(1,1));
		contentPane.add(panelGlobal, BorderLayout.CENTER);
		
		JPanel panelGauche = new JPanel(new BorderLayout(3,3));
		panelGlobal.add(panelGauche, BorderLayout.WEST);
		
		vueVignette = new VueVignette(panelGauche);
		vueOutils = new VueOutils(panelGauche);
		vueZoneDessin = new VueZoneDessin(panelGlobal);
		
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
