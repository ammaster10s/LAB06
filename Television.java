import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class Television extends JFrame {
	
	public Television(String title) {
        super(title);
		TelevisionComponents();
        
        setVisible(true);
		setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
		
        
	}
	
	public void TelevisionComponents() {
		//create abutton_TelevisionScreen and panal_TelevisionButtonBar
		JButton abutton_televisionscreen = new JButton();
        
		//Add to this Television
        
       
        
        BarPanel bar1 =new BarPanel();
        setLayout(new BorderLayout());
        this.add(abutton_televisionscreen,BorderLayout.CENTER);
        this.add(bar1,BorderLayout.SOUTH);
	}
}