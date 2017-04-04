package Command;

import java.util.ArrayList;
import java.util.List;
//this is the invoker


public class CommandManager {

	public List<Command> commadList;
	
	public CommandManager(){
		
		this.commadList = new ArrayList<Command>();
	}
	
	public void addCommand(Command command){
		this.commadList.add(command);
	}
	
	public void executeCommand(){
		for (Command command :this.commadList){
			command.execute();
		}
	}
}

