import java.awt.*;
import javax.swing.*;

public class Microwave extends JFrame {
	public Microwave() {
		
		MicrowaveComponents();
		setVisible(true);
		setSize(550,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
	}
	
	public void MicrowaveComponents() {

        
        JPanel panal01_MicrowaveLayout = new JPanel();
        panal01_MicrowaveLayout.setLayout(new BorderLayout());
	
		panal01_MicrowaveLayout.add(new JButton("Food to be placed here"),BorderLayout.CENTER);
		
		
		
		
        JPanel panel02_NumberLayout = new JPanel();
        panel02_NumberLayout.setLayout(new BorderLayout());
        
		

		
        panel02_NumberLayout.add(new JTextField("Microwave Time Display"),BorderLayout.NORTH);

		JPanel grid01 = new JPanel();
        grid01.setLayout(new GridLayout(4,3));
        for (int i=1 ; i<10 ; i++){
            grid01.add(new JButton(" "+ i));}
		
		
        grid01.add(new JButton("Stop"));
        grid01.add(new JButton("0"));
        grid01.add(new JButton("Start"));

		panel02_NumberLayout.add(grid01,BorderLayout.CENTER);
        panal01_MicrowaveLayout.add(panel02_NumberLayout,BorderLayout.EAST);
		
        setLayout(new BorderLayout());
        this.add(panel02_NumberLayout,BorderLayout.EAST);
        this.add(panal01_MicrowaveLayout,BorderLayout.CENTER);
	}



   
}