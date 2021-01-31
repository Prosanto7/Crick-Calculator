
package templates;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import project.Home;


public class Cricket_Mode extends Frame_Setup
{
    public JPanel main_panel,textfield_panel,button_panel;
    public JLabel match_type_label,run_rate_extra_label;
    public JTextArea runs_textarea,wickets_textarea,overs_textarea,extra_textarea;
    public JButton button_0,button_1,button_2,button_3,button_4,button_6,button_wicket,button_home,button_refresh,button_extra,null_button;    
    public int runs=0,wickets=0,balls=0,extras=0,no_balls=0,wide_balls=0,byes=0,leg_byes=0,penalty=0,overs,overlimit,session,daycount;
    
    
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
        this.setSize(650,500);   //Here we are changing our frame size according to out use
                                 //This frame size is different from the size of Frame_Setup class   
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
        match_type_label.setFont(new Font("Courier New",Font.BOLD,25));
        match_type_label.setHorizontalAlignment(JLabel.CENTER);
        container.add(match_type_label,BorderLayout.NORTH);
        null_label = new JLabel();
        container.add(null_label,BorderLayout.WEST);
        null_label = new JLabel();
        container.add(null_label,BorderLayout.EAST);
        run_rate_extra_label = new JLabel("Run Rate & Extra");
        run_rate_extra_label.setFont(new Font("Courier New",Font.BOLD,20));
        run_rate_extra_label.setHorizontalAlignment(JLabel.CENTER);
        container.add(run_rate_extra_label,BorderLayout.SOUTH);
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
        
        button_wicket = new JButton(button_wicket_icon);
        button_wicket.setBorder(null);
        button_wicket.setBackground(Color.white);
        button_panel.add(button_wicket);
        
        button_extra = new JButton(button_extra_icon);
        button_extra.setBorder(null);
        button_extra.setBackground(Color.white);
        button_panel.add(button_extra); 
        
        button_refresh = new JButton(button_refresh_icon);
        button_refresh.setBorder(null);
        button_refresh.setBackground(Color.white);
        button_panel.add(button_refresh);
       
        null_button = new JButton();
        null_button.setBorder(null);
        null_button.setBackground(Color.white);
        null_button.setEnabled(false);
        button_panel.add(null_button);
        
        button_home = new JButton(button_home_icon);
        button_home.setBorder(null);
        button_home.setBackground(Color.white);
        button_panel.add(button_home);
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
               setAllValues();
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
               setAllValues();
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
               setAllValues();
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
               setAllValues();
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
               setAllValues();
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
               setAllValues();
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
                      setAllValues();
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
        
        button_extra.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                setChoiceFrame(); 
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
                button_extra.setEnabled(true);
                button_wicket.setEnabled(true);
                runs=0;wickets=0;balls=0;extras=0;no_balls=0;wide_balls=0;byes=0;leg_byes=0;penalty=0;
                setAllValues(); 
                run_rate_extra_label.setText("Run Rate 0.00 Extra(b "+byes+",lb "+leg_byes+",w "+wide_balls+",nb "+no_balls+",p "+penalty+")");     

            }
        });
    }
    
    public void setMatchTypeLabel(String match_type)
    {
        if(match_type.equals("Test Match"))
        {
            overs = (int)balls/6;
            session = overs/30;
            daycount = 1 + (int) overs/90;
            
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
        if(match_type.equals("One Day Match"))
        {
            overs = (int)balls/6;
            
            if(overs<10)
            {
                match_type_label.setText("One Day Match,Powerplay 1");
            }
            else if(overs<40)
            {
                match_type_label.setText("One Day Match,Powerplay 2");
            }
            else if(overs<50)
            {
                match_type_label.setText("One Day Match,Powerplay 3");
            }   
        }
        
        if(match_type.equals("T20 Match"))
        {
            overs = (int)balls/6;
            
            if(overs<6)
            {
                match_type_label.setText("T20 Match,Powerplay 1");
            }
            else if(overs<16)
            {
                match_type_label.setText("T20 Match,Powerplay 2");
            }
            else if(overs<20)
            {
                match_type_label.setText("T20 Match,Powerplay 3");
            }   
        }
    }
    
    public void setChoiceFrame()
    { 
        JFrame choice_frame = new JFrame();
        choice_frame.setVisible(true);
        choice_frame.setSize(500, 200);
        choice_frame.setLocationRelativeTo(null);
        choice_frame.setLayout(new GridLayout(3,1));
        
        JLabel input_label = new JLabel(" Enter Extra Run Taken On That Ball");
        input_label.setFont(new Font("Courier New",Font.BOLD,18));
        choice_frame.add(input_label);
        
        JTextField input_textfield = new JTextField();
        input_textfield.setFont(new Font("Courier New",Font.BOLD,18));
        choice_frame.add(input_textfield);
        
        JPanel button_panel = new JPanel();
        button_panel.setLayout(new GridLayout(1,5));
        choice_frame.add(button_panel);
        
        JButton no_ball_button = new JButton("No Ball");
        button_panel.add(no_ball_button);
        
        JButton wide_ball_button = new JButton("Wide Ball");
        button_panel.add(wide_ball_button);
        
        JButton bye_button = new JButton("Bye");
        button_panel.add(bye_button);
        
        JButton leg_bye_button = new JButton("Leg Bye");
        button_panel.add(leg_bye_button);
        
        JButton penalty_button = new JButton("Penalty");
        button_panel.add(penalty_button);
        
        input_textfield.addKeyListener(new KeyListener(){
            
            public void keyTyped(KeyEvent ke) {
            }
            
            public void keyPressed(KeyEvent ke) {
                
                if(ke.getKeyChar()!='0'&&ke.getKeyChar()!='1'&&ke.getKeyChar()!='2'&&ke.getKeyChar()!='3'&&ke.getKeyChar()!='4'&&ke.getKeyChar()!='5'&&ke.getKeyChar()!='6'&&ke.getKeyChar()!='7'&&ke.getKeyChar()!='8'&&ke.getKeyChar()!='9')
                {
                    JOptionPane.showMessageDialog(null, "PLEASE ENTER VALID NUMBER","ERROR",JOptionPane.ERROR_MESSAGE);
                    input_textfield.setText("");
                } 
            }
          
            public void keyReleased(KeyEvent ke) {
            }             
        });
        
        no_ball_button.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                try{
                int value = Integer.parseInt(input_textfield.getText());
                extras = extras + 1 + value;
                byes = byes + value;
                no_balls = no_balls + 1;
                runs = runs + 1 + value;
                setAllValues();
                choice_frame.dispose();
                }catch(Exception ex) 
                {
                    JOptionPane.showMessageDialog(null, "PLEASE ENTER VALID NUMBER","ERROR",JOptionPane.ERROR_MESSAGE);
                    input_textfield.setText("");
                }
            }
        });
        
        wide_ball_button.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                try{
                int value = Integer.parseInt(input_textfield.getText());
                extras = extras + 1 + value;
                byes = byes + value;
                wide_balls = wide_balls + 1;
                runs = runs + 1 + value;
                setAllValues();
                choice_frame.dispose(); 
                }catch(Exception ex) 
                {
                    JOptionPane.showMessageDialog(null, "PLEASE ENTER VALID NUMBER","ERROR",JOptionPane.ERROR_MESSAGE);
                    input_textfield.setText("");
                }
            }
        });
        
        bye_button.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                try{
                int value = Integer.parseInt(input_textfield.getText());
                extras = extras  + value;
                byes = byes + value;
                runs = runs + value;
                balls = balls + 1;
                setAllValues();
                choice_frame.dispose(); 
                }catch(Exception ex) 
                {
                    JOptionPane.showMessageDialog(null, "PLEASE ENTER VALID NUMBER","ERROR",JOptionPane.ERROR_MESSAGE);
                    input_textfield.setText("");
                }
            }
        });
        
        leg_bye_button.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                try{
                int value = Integer.parseInt(input_textfield.getText());
                extras = extras  + value;
                leg_byes = leg_byes + value;
                runs = runs + value;
                balls = balls + 1;
                setAllValues();
                choice_frame.dispose(); 
                }catch(Exception ex) 
                {
                    JOptionPane.showMessageDialog(null, "PLEASE ENTER VALID NUMBER","ERROR",JOptionPane.ERROR_MESSAGE);
                    input_textfield.setText("");
                }
            }
        });
        
        penalty_button.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                try{
                int value = Integer.parseInt(input_textfield.getText());
                extras = extras  + value;
                penalty = penalty + value;
                runs = runs + value;
                balls = balls + 1;
                setAllValues();
                choice_frame.dispose(); 
                }catch(Exception ex) 
                {
                    JOptionPane.showMessageDialog(null, "PLEASE ENTER VALID NUMBER","ERROR",JOptionPane.ERROR_MESSAGE);
                    input_textfield.setText("");
                }
            }
        });
    }
    
    public void setAllValues()
    {
        float overs = (float)balls/6;
        float run_rate = runs / overs;
       
        runs_textarea.setText("Run "+runs);
        overs_textarea.setText((int)(balls/6)+"."+balls%6);
        wickets_textarea.setText("/"+wickets);
        extra_textarea.setText("Ext "+extras);
        run_rate_extra_label.setText("Run Rate "+String.format("%.2f", run_rate)+" Extra(b "+byes+",lb "+leg_byes+",w "+wide_balls+",nb "+no_balls+",p "+penalty+")");     
    }
    
    public void All_Disable()
    {
        button_0.setEnabled(false);
        button_1.setEnabled(false);
        button_2.setEnabled(false);
        button_3.setEnabled(false);
        button_4.setEnabled(false);
        button_6.setEnabled(false);
        button_extra.setEnabled(false);
        button_wicket.setEnabled(false);
    }
    
    /*public static void main(String[] args)
    {
        Cricket_Mode frame = new Cricket_Mode("Cricket Mode","T20 Match");  //Can Be Used For Testing
        frame.setVisible(true);
    }*/
}
