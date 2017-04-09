package Command;


public class CommandZoomOut implements Command{

	private ReceiverImage theImage;

	public CommandZoomOut (ReceiverImage image) {
		this.theImage = image; 
	}

	public void execute (){
		theImage.ImageZoomOut();
	}

	@Override
	public void annule() {
		// TODO Auto-generated method stub
		theImage.Undo();
	}
}


