
package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import templates.Frame_Setup;


public class Normal_Calculator extends Frame_Setup
{
    public JTextArea output_textarea;
    public JPanel main_panel,button_panel;
    public JButton button_0,button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9,
                    button_plus,button_minus,button_mul,button_div,button_equal,button_clr,button_home,button_point,button_back,button_minus_sign;
    private float num1,num2,result;
    private String sign;
    
    
    public Normal_Calculator(String page_title)
    {
        super(page_title); //Here we are using super key to use parent class's constructor 
        setContainer();
        setMainPanel();
        setNullLabel();    
        setTextArea();
        setButtonPanel();
        setButtons();
        setActionListeners();
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
    
    public void setTextArea()
    {
        output_textarea = new JTextArea("");
        output_textarea.setFont(new Font("Courier New",Font.BOLD,30));
        output_textarea.setBackground(Color.WHITE);
        main_panel.add(output_textarea,BorderLayout.NORTH);
    }
    
    public void setButtonPanel()
    {
        button_panel = new JPanel();
        button_panel.setBackground(Color.WHITE);
        button_panel.setLayout(new GridLayout(4,5));
        main_panel.add(button_panel,BorderLayout.CENTER);
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
    
    public void setButtons()
    {
        button_7 = new JButton(button_7_icon);
        button_7.setBorder(null);
        button_7.setBackground(Color.white);
        button_panel.add(button_7);
        
        
        button_8 = new JButton(button_8_icon);
        button_8.setBorder(null);
        button_8.setBackground(Color.white);
        button_panel.add(button_8);
        
        
        button_9 = new JButton(button_9_icon);
        button_9.setBorder(null);
        button_9.setBackground(Color.white);
        button_panel.add(button_9);
        
        button_div = new JButton(button_div_icon); 
        button_div.setBorder(null);
        button_div.setBackground(Color.white);
        button_panel.add(button_div);
        
        
        button_minus_sign = new JButton(button_minus_sign_icon); 
        button_minus_sign.setBorder(null);
        button_minus_sign.setBackground(Color.white);
        button_panel.add(button_minus_sign);
        
             
        button_4 = new JButton(button_4_icon);
        button_4.setBorder(null);
        button_4.setBackground(Color.white);
        button_panel.add(button_4);
        
        button_5 = new JButton(button_5_icon);
        button_5.setBorder(null);
        button_5.setBackground(Color.white);
        button_panel.add(button_5);
   
        
        button_6 = new JButton(button_6_icon);
        button_6.setBorder(null);
        button_6.setBackground(Color.white);
        button_panel.add(button_6);
        
        
        button_mul = new JButton(button_mul_icon); 
        button_mul.setBorder(null);
        button_mul.setBackground(Color.white);
        button_panel.add(button_mul);
        
        
        button_back = new JButton(button_back_icon); 
        button_back.setBorder(null);
        button_back.setBackground(Color.white);
        button_panel.add(button_back);
        
       
        
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
        
        button_minus = new JButton(button_minus_icon); 
        button_minus.setBorder(null);
        button_minus.setBackground(Color.white);
        button_panel.add(button_minus);
        
        
        button_clr = new JButton(button_clr_icon); 
        button_clr.setBorder(null);
        button_clr.setBackground(Color.white);
        button_panel.add(button_clr);
        
        
        button_0 = new JButton(button_0_icon); 
        button_0.setBorder(null);
        button_0.setBackground(Color.white);
        button_panel.add(button_0); 
        
        button_point = new JButton(button_point_icon); 
        button_point.setBorder(null);
        button_point.setBackground(Color.white);
        button_panel.add(button_point);  
        
        button_equal = new JButton(button_equal_icon); 
        button_equal.setBorder(null);
        button_equal.setBackground(Color.white);
        button_panel.add(button_equal);  
        
        button_plus = new JButton(button_plus_icon); 
        button_plus.setBorder(null);
        button_plus.setBackground(Color.white);
        button_panel.add(button_plus);  
        
        button_home = new JButton(button_home_icon); 
        button_home.setBorder(null);
        button_home.setBackground(Color.white);
        button_panel.add(button_home);   
    }
    
    public void setActionListeners()
    {
        output_textarea.addKeyListener(new KeyListener(){
            
           public void keyTyped(KeyEvent ke) {
           }
   
            public void keyPressed(KeyEvent ke) 
            {
                if(ke.getKeyChar()!='0'&&ke.getKeyChar()!='1'&&ke.getKeyChar()!='2'&&ke.getKeyChar()!='3'&&ke.getKeyChar()!='4'&&ke.getKeyChar()!='5'&&ke.getKeyChar()!='6'&&ke.getKeyChar()!='7'&&ke.getKeyChar()!='8'&&ke.getKeyChar()!='9'&&ke.getKeyChar()!='.')
                {
                    JOptionPane.showMessageDialog(null, "PLEASE ENTER VALID CHARACTERS","ERROR",JOptionPane.ERROR_MESSAGE);
                    output_textarea.setText("");
                } 
                
            }
            public void keyReleased(KeyEvent ke) {
            }
        
        });
        
        button_minus_sign.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e)
            {
                if(!output_textarea.getText().contains("-"))
                {
                    if(output_textarea.getText().contains("."))
                    {
                        button_point.setEnabled(false);
                        output_textarea.setText("-"+output_textarea.getText());
                    }   
                    else
                    {
                        output_textarea.setText("-"+output_textarea.getText());
                        button_point.setEnabled(true);
                    } 
                }
                
            }     
        });
        
        
        button_clr.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                   output_textarea.setText("");
                   button_point.setEnabled(true);
            }     
        });
        
        button_back.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 String str = output_textarea.getText();
                 try
                 {
                     output_textarea.setText(""+str.substring(0, (str.length()-1)));
                     char temp = str.charAt(str.length()-1);
                     if(temp=='.')
                     {
                         button_point.setEnabled(true);
                     }
                 }catch(Exception ex)
                 {
                    JOptionPane.showMessageDialog(null, "NO VALUES LEFT","ERROR",JOptionPane.ERROR_MESSAGE);
                 }
            } 
        });
        
        
        button_0.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                output_textarea.append("0");
            } 
        });
        
        button_1.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 output_textarea.append("1");
            } 
        });
        
        button_2.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 output_textarea.append("2");
            } 
        });
        
        button_3.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 output_textarea.append("3");
                 
            } 
        });
        
        button_4.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 output_textarea.append("4");
            } 
        });
        
        button_5.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 output_textarea.append("5");
            } 
        });
        
        button_6.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 output_textarea.append("6");
            } 
        });
        
        button_7.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 output_textarea.append("7");
            } 
        });
        
        button_8.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                output_textarea.append("8");
            } 
        });
        
        button_9.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 output_textarea.append("9");
            } 
        });
        
        button_point.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 output_textarea.append(".");
                 button_point.setEnabled(false);
            } 
        });
        
        button_plus.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 try{
                 sign="+";
                 num1 = Float.valueOf(output_textarea.getText());
                 output_textarea.setText(""); 
                 button_point.setEnabled(true);}catch(Exception ex)
                 {
                    JOptionPane.showMessageDialog(null, "INVALID INPUT","ERROR",JOptionPane.ERROR_MESSAGE);
                 }
            } 
        });
        
        button_minus.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 try{
                 sign="-";
                 num1 = Float.valueOf(output_textarea.getText());
                 output_textarea.setText("");
                 button_point.setEnabled(true);}catch(Exception ex)
                 {
                    JOptionPane.showMessageDialog(null, "INVALID INPUT","ERROR",JOptionPane.ERROR_MESSAGE);
                 }    
                 
            } 
        });
        
        button_mul.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 try{
                 sign="*";
                 num1 = Float.valueOf(output_textarea.getText());
                 output_textarea.setText("");
                 button_point.setEnabled(true);}catch(Exception ex)
                 {
                    JOptionPane.showMessageDialog(null, "INVALID INPUT","ERROR",JOptionPane.ERROR_MESSAGE);
                 }    
                 
            } 
        });
        
        button_div.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                 try{
                 sign="/";
                 num1 = Float.valueOf(output_textarea.getText());
                 output_textarea.setText("");
                 button_point.setEnabled(true);}catch(Exception ex)
                 {
                    JOptionPane.showMessageDialog(null, "INVALID INPUT","ERROR",JOptionPane.ERROR_MESSAGE);
                 }        
            } 
        });
        
        button_equal.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e)
            {
                try{
                num2 = Float.valueOf(output_textarea.getText());
                 
                if("+".equals(sign))
                {
                    result=(float)(num1+num2);
                }
                if("-".equals(sign))
                {
                    result=(float)(num1-num2);
                }
                if("*".equals(sign))
                {
                    result=(float)(num1*num2);
                }
                if("/".equals(sign))
                {
                    result=(float)(num1/num2);
                }
                
                output_textarea.setText(""+result); 
                button_point.setEnabled(false);
                }catch(Exception ex)
                {
                     JOptionPane.showMessageDialog(null, "INVALID INPUT","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            } 
        });
        
        button_home.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e)
            {
                dispose();
                Home frame = new Home("Home");
                frame.setVisible(true);
            }
        }); 
    }
    
    /*public static void main(String[] args) 
    {
        Normal_Calculator frame = new Normal_Calculator("Normal Mode");     //Can Be Used For Testing
        frame.setVisible(true);
    }*/
}
