package Command;

public class CommandZoomIn {
		
	private ReceiverImage theImage;

	public CommandZoomIn (ReceiverImage image) {
		this.theImage = image; 
	}

	public void execute (){
		theImage.Undo();
	}
}

