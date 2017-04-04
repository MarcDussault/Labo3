package Command;

public class CommandZoomOut {
	private ReceiverImage theImage;

	public CommandZoomOut (ReceiverImage image) {
		this.theImage = image; 
	}

	public void execute (){
		theImage.Undo();
	}
}


