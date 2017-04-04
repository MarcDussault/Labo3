package Views;

import Modeles.*;
import Controller.*;

public class Main
{
	public static void main(String[] args)
	{
		Modeles model = new Modeles();
		VueOutils vueOutils = new VueOutils();
		VueVignette vueVignette = new VueVignette();
		VueZoneDessin vueZoneDessin = new VueZoneDessin();
		ControllerOutils controllerOutils = new ControllerOutils(model, vueOutils);
		ControllerZoneDessin controllerZoneDessin = new ControllerZoneDessin(model, vueZoneDessin);
		
	}
}
