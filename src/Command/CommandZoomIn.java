package Command;

public class CommandZoomIn implements Command{
		
	private ReceiverImage theImage;

	public CommandZoomIn (ReceiverImage image) {
		this.theImage = image; 
	}

	public void execute (){
		theImage.ImageZoomIn();
	}
	
	public void annule(){
		//theImage.
		theImage.Undo();
	}
}

