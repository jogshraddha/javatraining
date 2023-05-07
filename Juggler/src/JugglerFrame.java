import java.awt.TextField;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class JugglerFrame extends Frame {
	
	private TextField firstText;
	
	public TextField getFirstText() {
		return firstText;
	}

	public void setFirstText(TextField firstText) {
		this.firstText = firstText;
	}

	public TextField getSecondText() {
		return secondText;
	}

	public void setSecondText(TextField secondText) {
		this.secondText = secondText;
	}

	public TextField getThirdText() {
		return thirdText;
	}

	public void setThirdText(TextField thirdText) {
		this.thirdText = thirdText;
	}

	private TextField secondText;
	
	private TextField thirdText;
	
	public JugglerFrame() {
		setBounds(100,100,500,450);
		setTitle("Juggler");
		setVisible(true);
		this.setLayout(null);
		
		firstText = new TextField();
		firstText.setBounds(140,100,80,20);
		add(firstText);
		
		secondText = new TextField();
		secondText.setBounds(300,100,80,20);
		add(secondText);
		
		thirdText = new TextField();
		thirdText.setBounds(200,200,80,20);
		add(thirdText);
		
		Button clockWise = new Button("ClockWise");
		clockWise.setBounds(100,250,80,30);
		add(clockWise);
		clockWise.addActionListener(new JugglerHandler(this));
		
		
		Button antiClockWise = new Button("AntiClockWise");
		antiClockWise.setBounds(300,250,150,30);
		add(antiClockWise);
		antiClockWise.addActionListener(new JugglerHandler(this));
		
		this.addWindowListener(new WindowAdapter() {
			 @Override
			public void windowClosing(WindowEvent e) {
				 JugglerFrame jf = (JugglerFrame)e.getSource();
				 jf.dispose();
			 }
		});
	}

}
