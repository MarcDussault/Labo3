package Command;

<<<<<<< HEAD
public class CommandZoomIn implements Command{
=======
public class CommandZoomIn {
>>>>>>> refs/remotes/origin/master
		
	private ReceiverImage theImage;

	public CommandZoomIn (ReceiverImage image) {
		this.theImage = image; 
	}

	public void execute (){
<<<<<<< HEAD
		theImage.ImageZoomIn();
	}
	
	public void annule(){
		//theImage.
=======
>>>>>>> refs/remotes/origin/master
		theImage.Undo();
	}
}

