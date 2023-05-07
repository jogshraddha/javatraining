import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JugglerHandler implements ActionListener {
	
	JugglerFrame jugglerFrame ;
	public JugglerHandler(JugglerFrame jugglerFrame) {
		this.jugglerFrame = jugglerFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int firstText = Integer.parseInt(jugglerFrame.getFirstText().getText());
		int secondText = Integer.parseInt(jugglerFrame.getSecondText().getText());
		int thirdText = Integer.parseInt(jugglerFrame.getThirdText().getText());
		
		System.out.println(e.getActionCommand());
		if(e.getActionCommand().equalsIgnoreCase("ClockWise")) {
			jugglerFrame.getFirstText().setText(Integer.toString(thirdText + 1));
			jugglerFrame.getThirdText().setText(Integer.toString(secondText + 1));
			jugglerFrame.getSecondText().setText(Integer.toString(firstText + 1));
		} else {
			jugglerFrame.getFirstText().setText(Integer.toString(secondText - 1));
			jugglerFrame.getThirdText().setText(Integer.toString(firstText - 1));
			jugglerFrame.getSecondText().setText(Integer.toString(thirdText - 1));
		}
		
	}

}
