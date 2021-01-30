
package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import templates.Frame_Setup;


public class Home extends Frame_Setup
{
    public JPanel button_panel;
    public JButton normal_mode_button,cricket_mode_button;
    
    public Home()
    {
        setContainer();
        setButtonPanel();
        setButtons();
    }
    
    public void setContainer()
    {
        //Method Overriding Contept Used
        super.setContainer();  //Here we get setContainer() of parrent class
        container.setLayout(new BorderLayout(100,100));
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
    
    
    public static void main(String[] args)
    {
        Home frame = new Home();
        frame.setVisible(true);
    }
}
