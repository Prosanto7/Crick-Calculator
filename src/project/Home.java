
package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import templates.Frame_Setup;


public class Home extends Frame_Setup
{
    public JPanel button_panel;
    public JButton normal_mode_button,cricket_mode_button;
    
    public Home(String page_title)
    {
        super(page_title);  //Here we are using super key to use parent class's constructor 
        setContainer();
        setButtonPanel();
        setButtons();
        setActionListeners();
        
    }
    
    public void setContainer()
    {
        //Method Overriding Contept Used
        super.setContainer();  //Here we get setContainer() of parrent class
        container.setLayout(new BorderLayout(100,100));  //100 is Horizontal gap and 100 is Vertical Gap
        //container.setBackground(Color.white);
    }
    
    public void setButtonPanel()
    {
        button_panel = new JPanel();
        button_panel.setLayout(new GridLayout(2,1));
        button_panel.setBackground(Color.WHITE);
        container.add(button_panel,BorderLayout.CENTER);
        setNullLabel();
    }
    
    public void setButtons()
    {
        normal_mode_button = new JButton(normal_mode_icon);
        normal_mode_button.setBackground(Color.WHITE);
        normal_mode_button.setBorder(null);
        normal_mode_button.setFocusPainted(false);
        button_panel.add(normal_mode_button);
        
        cricket_mode_button = new JButton(cricket_mode_icon);
        cricket_mode_button.setBackground(Color.WHITE);
        cricket_mode_button.setBorder(null);
        cricket_mode_button.setFocusPainted(false);
        button_panel.add(cricket_mode_button);
    }
    
    public void setNullLabel()
    {
        null_label = new JLabel();
        container.add(null_label,BorderLayout.EAST);
        null_label = new JLabel();
        container.add(null_label,BorderLayout.WEST);
        null_label = new JLabel();
        container.add(null_label,BorderLayout.NORTH);
        null_label = new JLabel();
        container.add(null_label,BorderLayout.SOUTH);
    }
    
    public void setActionListeners()
    {
        normal_mode_button.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Normal_Calculator frame = new Normal_Calculator("Normal Mode");
                frame.setVisible(true);
            }
        });
        
        cricket_mode_button.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Cricket_Calculator frame = new Cricket_Calculator("Cricket Mode","T20 Match");
                frame.setVisible(true);
            }
        
        });
        
    }
    
    /*public static void main(String[] args)
    {
        Home frame = new Home("Home");      //Can Be Used For Testing Home 
        frame.setVisible(true);
    }*/
}
