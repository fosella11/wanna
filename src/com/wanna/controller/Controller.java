package com.wanna.controller;

/**
 * Encargado de comunicar la vista con el modelo.
 *
 */
public class Controller {
	
	private static Controller instance; 
	
	public static Controller getInstance (){
		if (instance==null){
			instance = new Controller();
		}
		return instance;
	}
	
	private Controller(){
		super();
	}

	public void verifyUser() {
		// Esto se llama en la splash screen.
		// Verificar que exista un token, si existe deberia ver la validez, Si
		// es valido. entra a la app, si no es valido pero esta el token va al
		// login de continuar. Si no existe te muesta para loguearse con el
		// video instructivo.

	}

	public void Login() {
		//LLama a la facebook api.
	}
}
