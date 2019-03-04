
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben
 */
public class TimePanel extends JPanel {
    
    private void init(){
        
        JLabel h1 = new JLabel(getIcon(1));
        JLabel h2 = new JLabel(icon);
        JLabel doppelpoint1 = new JLabel(icon);
        JLabel m1 = new JLabel(icon);
        JLabel m2 = new JLabel(icon);
        JLabel doppelpoint2 = new JLabel(icon);
        JLabel s1 = new JLabel(icon);
        JLabel s2 = new JLabel(icon);
        
        
    }
    
    private ImageIcon getIcon(int ziffer){
        ImageIcon icon = new ImageIcon();
        return icon;
    }
    
}
