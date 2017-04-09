package Command;

import java.util.ArrayList;

public class CommandManager {


	public ArrayList<Command> commandList = new ArrayList<Command>();
	
	private static int actualIndex = 0;
	private static int maxIndex = 15;
	
	public void addCommand(Command command){
		this.commandList.add(command);
	}
	
	public void removeCommand(Command command){
		
		if (actualIndex >= maxIndex){
			
			commandList.remove(0);
		}
	}
	
	public void executeCommand( Command commandList){
		//for (Command command :this.commadList){
		//	command.execute();
		//}		
		 commandList.execute();				
	}
	
	public void annuleCommand(int level){
		if (actualIndex > 0){
			if (level > actualIndex){
				System.out.print("Warning no undo to many level");
				level = actualIndex;
			}
						
			if (actualIndex >= 0){
				System.out.print("undo on 1 level");
				((Command) commandList).annule();
				
			} 
			else {
				System.out.print("No command do undo");			
			}			
		}				
	}

	
	
	public static int getActualIndex() {
		return actualIndex;
	}

	public static void setActualIndex(int actualIndex) {
		CommandManager.actualIndex = actualIndex;
	}

	public static int getMaxIndex() {
		return maxIndex;
	}

	public static void setMaxIndex(int maxIndex) {
		CommandManager.maxIndex = maxIndex;
	}
}

