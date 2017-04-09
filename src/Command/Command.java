package Command;

public interface Command {
	public static CommandManager  commandManager = getInstance();
	
	public void execute();
	
	public void annule();
	
	
	/**
	* Retourne l'instance unique du CommandManager
	*
	* @return Instance unique du CommandManager.
	*/
	public static CommandManager getInstance() {
		CommandManager instance = null;
		if (instance == null) {
			synchronized(CommandManager.class) {
				if (instance == null) { 
					instance = new CommandManager();
				}
			}
	   }
	   return instance;
	}

}
