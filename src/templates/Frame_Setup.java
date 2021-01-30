
package templates;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Frame_Setup extends JFrame
{
    public Container container;
    
    
    public Frame_Setup()
    {
        setFrame();
        setContainer();
        setAllIconsDeclared();
        setAppIcon();
    }
    
    public void setFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450, 500);
        this.setLocationRelativeTo(null);
    }
    
    public void setContainer()
    {
        container = this.getContentPane();
        container.setBackground(Color.white);
        container.setLayout(null);
    }
    
    public void setAllIconsDeclared()
    {
        ImageIcon button_0_icon = new ImageIcon(getClass().getResource("/icons/button_0.png"));
        ImageIcon button_1_icon = new ImageIcon(getClass().getResource("/icons/button_1.png"));
        ImageIcon button_2_icon = new ImageIcon(getClass().getResource("/icons/button_2.png"));
        ImageIcon button_3_icon = new ImageIcon(getClass().getResource("/icons/button_3.png"));
        ImageIcon button_4_icon = new ImageIcon(getClass().getResource("/icons/button_4.png"));
        ImageIcon button_5_icon = new ImageIcon(getClass().getResource("/icons/button_5.png"));
        ImageIcon button_6_icon = new ImageIcon(getClass().getResource("/icons/button_6.png"));
        ImageIcon button_7_icon = new ImageIcon(getClass().getResource("/icons/button_7.png"));
        ImageIcon button_8_icon = new ImageIcon(getClass().getResource("/icons/button_8.png"));
        ImageIcon button_9_icon = new ImageIcon(getClass().getResource("/icons/button_9.png"));
        ImageIcon button_point_icon = new ImageIcon(getClass().getResource("/icons/button_point.png"));
        ImageIcon button_equal_icon = new ImageIcon(getClass().getResource("/icons/button_equal.png"));
        ImageIcon button_plus_icon = new ImageIcon(getClass().getResource("/icons/button_plus.png"));
        ImageIcon button_minus_icon = new ImageIcon(getClass().getResource("/icons/button_minus.png"));
        ImageIcon button_minus_sign_icon = new ImageIcon(getClass().getResource("/icons/button_minus_sign.png"));
        ImageIcon button_mul_icon = new ImageIcon(getClass().getResource("/icons/button_mul.png"));
        ImageIcon button_div_icon = new ImageIcon(getClass().getResource("/icons/button_div.png"));
        ImageIcon button_clr_icon = new ImageIcon(getClass().getResource("/icons/button_clr.png"));
        ImageIcon button_back_icon = new ImageIcon(getClass().getResource("/icons/button_back.png"));
        ImageIcon button_home_icon = new ImageIcon(getClass().getResource("/icons/button_home.png"));
        ImageIcon button_wide_ball_icon = new ImageIcon(getClass().getResource("/icons/button_wide_ball.png"));
        ImageIcon button_no_ball_icon = new ImageIcon(getClass().getResource("/icons/button_no_ball.png"));
        ImageIcon button_wicket_icon = new ImageIcon(getClass().getResource("/icons/button_wicket.png"));
        ImageIcon button_refresh_icon = new ImageIcon(getClass().getResource("/icons/button_refresh.png"));
           
    }
    
    public void setAppIcon()
    {
        ImageIcon appIcon = new ImageIcon(getClass().getResource("/icons/calculatorIcon.png"));
        this.setIconImage(appIcon.getImage());
    }
    
    
    /*public static void main(String[] args)
    {
        Frame_Setup frame = new Frame_Setup();      //Can Be Used For Testing Frame Setup
        frame.setVisible(true);
    }*/
}
