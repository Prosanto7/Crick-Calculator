
package templates;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import project.Home;


public class Cricket_Mode extends Frame_Setup
{
    public JPanel main_panel,textfield_panel,button_panel;
    public JLabel match_type_label;
    public JTextArea runs_textarea,wickets_textarea,overs_textarea,extra_textarea;
    public JButton button_0,button_1,button_2,button_3,button_4,button_6,button_wicket,button_wide_ball,button_no_ball,button_home,button_refresh,button_extra;    
    public int runs=0,wickets=0,balls=0,extras=0,overs,overlimit,session,daycount;
    
    
    public Cricket_Mode(String page_title,String match_type) 
    {
        super(page_title);      //Here we are using super key to use parent class's constructor 
        setContainer();
        setMainPanel();
        setNullLabel(match_type);
        setTextFieldPanel();
        setButtonPanel();
        setTextFields();
        setButtons();
        setMatchTypeLabel(match_type);
        setActionListeners(match_type);
    }
    
    public void setContainer()
    {
        //Method Overriding Contept Used
        super.setContainer();  //Here we get setContainer() of parrent class
        container.setLayout(new BorderLayout(50,50));   //50 is Horizontal gap and 50 is Vertical Gap
        container.setBackground(Color.WHITE);
    }
    
    public void setMainPanel()
    {
        main_panel = new JPanel();
        main_panel.setBackground(Color.WHITE);
        main_panel.setLayout(new BorderLayout(0,30));     //0 is Horizontal gap and 30 is Vertical Gap
        container.add(main_panel,BorderLayout.CENTER);
    }
    
    public void setNullLabel(String match_type)
    {   
        match_type_label = new JLabel(match_type);
        match_type_label.setFont(new Font("Courier New",Font.BOLD,28));
        match_type_label.setHorizontalAlignment(JLabel.CENTER);
        container.add(match_type_label,BorderLayout.NORTH);
        null_label = new JLabel();
        container.add(null_label,BorderLayout.SOUTH);
        null_label = new JLabel();
        container.add(null_label,BorderLayout.EAST);
        null_label = new JLabel();
        container.add(null_label,BorderLayout.WEST);
    }
    
    public void setTextFieldPanel()
    {
        textfield_panel = new JPanel();
        textfield_panel.setBackground(Color.WHITE);
        textfield_panel.setLayout(new GridLayout(1,4));
        main_panel.add(textfield_panel,BorderLayout.NORTH);
    }
    
    public void setButtonPanel()
    {
        button_panel = new JPanel();
        button_panel.setBackground(Color.WHITE);
        button_panel.setLayout(new GridLayout(4,5));
        main_panel.add(button_panel,BorderLayout.CENTER);
    }
    
    public void setTextFields()
    {
        runs_textarea = new JTextArea("Run");
        runs_textarea.setFont(new Font("Courier New",Font.BOLD,30));
        runs_textarea.setEditable(false);
        textfield_panel.add(runs_textarea);
        
        wickets_textarea = new JTextArea("W");
        wickets_textarea.setFont(new Font("Courier New",Font.BOLD,30));
        wickets_textarea.setEditable(false);
        textfield_panel.add(wickets_textarea);
        
        overs_textarea = new JTextArea("Over");
        overs_textarea.setFont(new Font("Courier New",Font.BOLD,30));
        overs_textarea.setEditable(false);
        textfield_panel.add(overs_textarea);
        
        extra_textarea = new JTextArea("Extra");
        extra_textarea.setFont(new Font("Courier New",Font.BOLD,28));
        extra_textarea.setEditable(false);
        textfield_panel.add(extra_textarea);
    }
    
    public void setButtons()
    {
        button_0 = new JButton(button_0_icon);
        button_0.setBorder(null);
        button_0.setBackground(Color.white);
        button_panel.add(button_0);
        
        button_1 = new JButton(button_1_icon);
        button_1.setBorder(null);
        button_1.setBackground(Color.white);
        button_panel.add(button_1);
           
        button_2 = new JButton(button_2_icon);
        button_2.setBorder(null);
        button_2.setBackground(Color.white);
        button_panel.add(button_2);
        
        button_3 = new JButton(button_3_icon);
        button_3.setBorder(null);
        button_3.setBackground(Color.white);
        button_panel.add(button_3);
        
        button_4 = new JButton(button_4_icon);
        button_4.setBorder(null);
        button_4.setBackground(Color.white);
        button_panel.add(button_4);
        
        button_6 = new JButton(button_6_icon);
        button_6.setBorder(null);
        button_6.setBackground(Color.white);
        button_panel.add(button_6);
        
        button_wide_ball = new JButton(button_wide_ball_icon);
        button_wide_ball.setBorder(null);
        button_wide_ball.setBackground(Color.white);
        button_panel.add(button_wide_ball);
   
        button_no_ball = new JButton(button_no_ball_icon);
        button_no_ball.setBorder(null);
        button_no_ball.setBackground(Color.white);
        button_panel.add(button_no_ball);
        
        button_wicket = new JButton(button_wicket_icon);
        button_wicket.setBorder(null);
        button_wicket.setBackground(Color.white);
        button_panel.add(button_wicket);
        
        button_home = new JButton(button_home_icon);
        button_home.setBorder(null);
        button_home.setBackground(Color.white);
        button_panel.add(button_home);
        
        button_refresh = new JButton(button_refresh_icon);
        button_refresh.setBorder(null);
        button_refresh.setBackground(Color.white);
        button_panel.add(button_refresh);
       
        button_extra = new JButton(button_extra_icon);
        button_extra.setBorder(null);
        button_extra.setBackground(Color.white);
        button_panel.add(button_extra);      
    }
    
    public void setActionListeners(String match_type)
    {
        if(match_type.equals("One Day Match"))
        {
            overlimit = 50;
        }
        if(match_type.equals("T20 Match"))
        {
            overlimit = 20;
        }
        if(match_type.equals("Test Match"))
        {
            overlimit = 450;
        }
        
        button_home.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Home frame = new Home("Home");
                frame.setVisible(true);
            }
        });
        
        button_0.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
               setMatchTypeLabel(match_type);
               
               if((int)(balls/6)<overlimit) 
               {
               runs = runs + 0;
               balls = balls +1;
               runs_textarea.setText(""+runs);
               overs_textarea.setText((int)(balls/6)+"."+balls%6);
               }
               else
               {
                  JOptionPane.showMessageDialog(null, "NO BALLS LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                  All_Disable();
               }
            }
        });
        
        button_1.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
               setMatchTypeLabel(match_type); 
                
               if((int)(balls/6)<overlimit) 
               {
               runs = runs + 1;
               balls = balls +1;
               runs_textarea.setText(""+runs);
               overs_textarea.setText((int)(balls/6)+"."+balls%6);
               }
               else
               {
                  JOptionPane.showMessageDialog(null, "NO BALLS LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                  All_Disable();
               }
            }
        });
         
        button_2.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
               setMatchTypeLabel(match_type); 
                
               if((int)(balls/6)<overlimit) 
               {
               runs = runs + 2;
               balls = balls +1;
               runs_textarea.setText(""+runs);
               overs_textarea.setText((int)(balls/6)+"."+balls%6);
               }
               else
               {
                  JOptionPane.showMessageDialog(null, "NO BALLS LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                  All_Disable();
               }
            }
        });
         
        button_3.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
               setMatchTypeLabel(match_type); 
                
               if((int)(balls/6)<overlimit) 
               {
               runs = runs + 3;
               balls = balls +1;
               runs_textarea.setText(""+runs);
               overs_textarea.setText((int)(balls/6)+"."+balls%6);
               }
               else
               {
                  JOptionPane.showMessageDialog(null, "NO BALLS LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                  All_Disable();
               }
            }
        });
         
        button_4.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
               setMatchTypeLabel(match_type); 
                
               if((int)(balls/6)<overlimit) 
               {
               runs = runs + 4;
               balls = balls +1;
               runs_textarea.setText(""+runs);
               overs_textarea.setText((int)(balls/6)+"."+balls%6);
               }
               else
               {
                  JOptionPane.showMessageDialog(null, "NO BALLS LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                  All_Disable();
               }
            }
         });
         
        button_6.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
               setMatchTypeLabel(match_type);
               
               if((int)(balls/6)<overlimit) 
               {
               runs = runs + 6;
               balls = balls +1;
               runs_textarea.setText(""+runs);
               overs_textarea.setText((int)(balls/6)+"."+balls%6);
               }
               else
               {
                  JOptionPane.showMessageDialog(null, "NO BALLS LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                  All_Disable();
               }
            }   
        });
        
        button_wicket.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
               setMatchTypeLabel(match_type);
                
               if((int)(balls/6)<overlimit) 
               {
                    if(wickets<9)
                    {
                      wickets = wickets + 1;
                      balls = balls +1;
                      wickets_textarea.setText("/"+wickets);
                      overs_textarea.setText((int)(balls/6)+"."+balls%6);
                    }
                    else
                    {
                     wickets_textarea.setText("/"+(wickets+1));
                     balls = balls +1;
                     overs_textarea.setText((int)(balls/6)+"."+balls%6); 
                     JOptionPane.showMessageDialog(null, "NO MORE BATSMAN LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                     All_Disable();
                    }
                }
               else
               {
                  JOptionPane.showMessageDialog(null, "NO BALLS LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                  All_Disable();
               }
            }
        });
        
        button_wide_ball.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            { 
              setMatchTypeLabel(match_type);
                
              if((int)(balls/6)<overlimit) 
              {  
                    try{
                    int temp = Integer.valueOf(JOptionPane.showInputDialog(null, "Extra Runs On That Ball"));
                    runs = runs + 1 + temp;
                    runs_textarea.setText(""+runs); }catch(Exception ex){}
              }
              else
              {
                 JOptionPane.showMessageDialog(null, "NO BALLS LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                 All_Disable();
              }
              
            }
        });
        
        button_no_ball.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
              setMatchTypeLabel(match_type);
              
              if((int)(balls/6)<overlimit) 
              {
                try{  
                int temp = Integer.valueOf(JOptionPane.showInputDialog(null, "Extra Runs On That Ball"));
                runs = runs + 1 + temp;
                runs_textarea.setText(""+runs);   }catch(Exception ex){}
              }
              else
              {
                 JOptionPane.showMessageDialog(null, "NO BALLS LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                 All_Disable();
              }
            }
        });
        
        button_refresh.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                setMatchTypeLabel(match_type);
                button_0.setEnabled(true);
                button_1.setEnabled(true);
                button_2.setEnabled(true);
                button_3.setEnabled(true);
                button_4.setEnabled(true);
                button_6.setEnabled(true);
                button_wide_ball.setEnabled(true);
                button_no_ball.setEnabled(true);
                button_wicket.setEnabled(true);
                runs=0;wickets=0;balls=0;
                runs_textarea.setText(""+runs);
                wickets_textarea.setText("/"+wickets);
                overs_textarea.setText((int)(balls/6)+"."+balls%6);              
            }
        });
    }
    
    public void setMatchTypeLabel(String match_type)
    {
        if(match_type.equals("Test Match"))
        {
            overs = (int)balls/6;
            session = overs/30;
            daycount = 1+ (int) overs/90;
            
            if((session%3)==0)
            {
                match_type_label.setText("Day "+daycount+", Session 1(Morning)");
            }
            else if((session%3)==1)
            {
                match_type_label.setText("Day "+daycount+", Session 2(Afternoon)");
            }
            else if((session%3)==2)
            {
                match_type_label.setText("Day "+daycount+", Session 3(Evening)");
            }   
        }
    }
    
    public void All_Disable()
    {
        button_0.setEnabled(false);
        button_1.setEnabled(false);
        button_2.setEnabled(false);
        button_3.setEnabled(false);
        button_4.setEnabled(false);
        button_6.setEnabled(false);
        button_wide_ball.setEnabled(false);
        button_no_ball.setEnabled(false);
        button_wicket.setEnabled(false);
    }
    
    
    public static void main(String[] args)
    {
        Cricket_Mode frame = new Cricket_Mode("Cricket Mode","One Day Match");  //Can Be Used For Testing
        frame.setVisible(true);
    }
}
