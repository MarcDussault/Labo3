package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modeles.*;
import Views.*;

public class ControllerOutils implements ActionListener{

	private Modeles theModel;	
	private VueOutils outils;
	
		
	public ControllerOutils(Modeles model, VueOutils vueOutils)
	{
		this.theModel = model;
		this.outils = vueOutils;
		

	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
