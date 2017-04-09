package Command;

<<<<<<< HEAD
public class CommandZoomOut implements Command{
=======
public class CommandZoomOut {
>>>>>>> refs/remotes/origin/master
	private ReceiverImage theImage;

	public CommandZoomOut (ReceiverImage image) {
		this.theImage = image; 
	}

	public void execute (){
<<<<<<< HEAD
		theImage.ImageZoomOut();
	}

	@Override
	public void annule() {
		// TODO Auto-generated method stub
		
=======
>>>>>>> refs/remotes/origin/master
		theImage.Undo();
	}
}


