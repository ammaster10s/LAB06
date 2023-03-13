import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class BarPanel extends JPanel{
	public BarPanel() {
		ControlPanel ct1 = new ControlPanel();
        JTextField tx1 = new JTextField("CH 35 VOL 45");
        this.setLayout(new BorderLayout());
        this.add(ct1,BorderLayout.CENTER);
        this.add(tx1,BorderLayout.WEST);
    }
}     

    

    


