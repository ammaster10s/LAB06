import javax.swing.*;
import java.awt.*;

//Inherit appropriate superclass 
public class ControlPanel extends JPanel{
	public ControlPanel() {	

        
        
		AdjustPanel p1 = new AdjustPanel("Chanel");
        AdjustPanel p2 = new AdjustPanel("Volume");
        JButton b1 = new JButton("On/ Off");
        setLayout(new GridLayout());
        this.add(p1);
        this.add(p2);
        this.add(b1);

	

	}
}