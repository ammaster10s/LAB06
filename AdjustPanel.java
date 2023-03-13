import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class AdjustPanel extends JPanel{

	public AdjustPanel(String centerText) {
        
		setLayout(new BorderLayout());
        add(new JButton("<<"),BorderLayout.WEST);
        add(new JButton(centerText),BorderLayout.CENTER);
        add(new JButton(">>"),BorderLayout.EAST);
        

	}
}