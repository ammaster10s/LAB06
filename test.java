import javax.swing.*;
import java.awt.*;
public class microwave extends JFrame{
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JButton doorbt = new JButton("Sustavo");
    JTextField timetf = new JTextField("Amogus");
    JButton zerobt =  new  JButton("0");
    JButton startbt = new JButton("Start");
    JButton stopbt = new JButton("Stop");

    microwave(String title){
        super(title);
        p1.setLayout(new GridLayout(4,3)); 
        for (int i=1 ; i<10 ; i++){
            p1.add(new JButton(" "+ i));}
        p1.add(zerobt);
        p1.add(startbt);
        p1.add(stopbt);
        p2.setLayout(new BorderLayout());
        p2.add(timetf , BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);

        setLayout(new BorderLayout());
        this.add(doorbt, BorderLayout.CENTER);
        this.add(p2, BorderLayout.EAST);
        }
    

    
public static void main(String[] args){
    microwave Microwaves = new microwave("Nigga");
    Microwaves.setVisible(true);
    Microwaves.setSize(600,300);
    Microwaves.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}