import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class AdjustPanel{

	public AdjustPanel(String centerText) {
        JPanel AdjustPanel = new JPanel();
		AdjustPanel.setLayout(new FlowLayout());
        AdjustPanel.add(new JButton("<<"));
        AdjustPanel.add(new JButton(centerText));
        AdjustPanel.add(new JButton(">>"));

	}
}