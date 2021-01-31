
package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import templates.Cricket_Mode;
import templates.Frame_Setup;


public class Cricket_Calculator extends Frame_Setup
{
    public JPanel button_panel;
    public JButton one_day_match_button,t20_match_button,test_match_button,home_button;
    
    public Cricket_Calculator(String page_title) 
    {
        super(page_title);      //Here we are using super key to use parent class's constructor 
        setContainer();
        setButtonPanel();
        setButtons();
        setActionListeners();
    }
    
    public void setContainer()
    {
        //Method Overriding Contept Used
        super.setContainer();  //Here we get setContainer() of parrent class
        container.setLayout(new BorderLayout(70,50));  //100 is Horizontal gap and 100 is Vertical Gap
        container.setBackground(Color.white);
    }
    
    public void setButtonPanel()
    {
        button_panel = new JPanel();
        button_panel.setLayout(new GridLayout(4,1));
        button_panel.setBackground(Color.WHITE);
        container.add(button_panel,BorderLayout.CENTER);
        setNullLabel();
    }
    
    public void setButtons()
    {
        one_day_match_button = new JButton(one_day_match_button_icon);
        one_day_match_button.setBackground(Color.WHITE);
        one_day_match_button.setBorder(null);
        one_day_match_button.setFocusPainted(false);
        button_panel.add(one_day_match_button);
        
        t20_match_button = new JButton(t20_match_button_icon);
        t20_match_button.setBackground(Color.WHITE);
        t20_match_button.setBorder(null);
        t20_match_button.setFocusPainted(false);
        button_panel.add(t20_match_button);
        
        test_match_button = new JButton(test_match_button_icon);
        test_match_button.setBackground(Color.WHITE);
        test_match_button.setBorder(null);
        test_match_button.setFocusPainted(false);
        button_panel.add(test_match_button);
        
        home_button = new JButton(button_home_icon);
        home_button.setBackground(Color.WHITE);
        home_button.setBorder(null);
        home_button.setFocusPainted(false);
        button_panel.add(home_button);
    }
    
    public void setActionListeners()
    {
        one_day_match_button.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Cricket_Mode frame = new Cricket_Mode("Cricket_Mode","One Day Match");
                frame.setVisible(true);
            }
        });
        
        t20_match_button.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Cricket_Mode frame = new Cricket_Mode("Cricket_Mode","T20 Match");
                frame.setVisible(true);
            }
        });
        
        test_match_button.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Cricket_Mode frame = new Cricket_Mode("Cricket_Mode","Test Match");
                frame.setVisible(true);
            }
        });
        
        home_button.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Home frame = new Home("Home");
                frame.setVisible(true);
            }
        });
        
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
        Cricket_Calculator frame = new Cricket_Calculator("Cricket Mode");
        frame.setVisible(true);
    }
}
