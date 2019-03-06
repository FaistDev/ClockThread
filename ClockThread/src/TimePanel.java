
import java.awt.GridLayout;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class TimePanel extends JPanel implements Runnable {

    private ZonedDateTime time;
    private ZoneId zid;
    private String timezone;
    private JLabel h1,h2,m1,m2,s1,s2,doublepoint1,doublepoint2;

    public TimePanel(String timezone) {
        this.timezone=timezone;
        zid =  ZoneId.of(timezone);
        time = ZonedDateTime.ofInstant(Instant.now(),zid);
        init();
    }
    

    private void init() {
        this.setLayout(new GridLayout(1,9));
        JLabel timezone = new JLabel(this.timezone);
        h1 = new JLabel(getIcon(getZiffer(true, time.getHour())));
        h2 = new JLabel(getIcon(getZiffer(false, time.getHour())));
        m1 = new JLabel(getIcon(getZiffer(true, time.getMinute())));
        m2 = new JLabel(getIcon(getZiffer(false, time.getMinute())));
        s1 = new JLabel(getIcon(getZiffer(true, time.getSecond())));
        s2 = new JLabel(getIcon(getZiffer(false, time.getSecond())));
        doublepoint1 = new JLabel(new ImageIcon("icons/doppelpoint.png"));
        doublepoint2 = new JLabel(new ImageIcon("icons/doppelpoint.png"));
        
        this.add(timezone);
        this.add(h1);
        this.add(h2);
        this.add(doublepoint1);
        this.add(m1);
        this.add(m2);
        this.add(doublepoint2);
        this.add(s1);
        this.add(s2);
    }
    
    private void setDigits(){
        time = ZonedDateTime.ofInstant(Instant.now(),zid);
        h1.setIcon(getIcon(getZiffer(true, time.getHour())));
        h2.setIcon(getIcon(getZiffer(false, time.getHour())));
        m1.setIcon(getIcon(getZiffer(true, time.getMinute())));
        m2.setIcon(getIcon(getZiffer(false, time.getMinute())));
        s1.setIcon(getIcon(getZiffer(true, time.getSecond())));
        s2.setIcon(getIcon(getZiffer(false, time.getSecond())));
    }

    private ImageIcon getIcon(int ziffer) {
        ImageIcon icon = new ImageIcon("icons/"+ziffer+".png");
        return icon;
    }

    private int getZiffer(boolean zifferPos, int digits) {
        if (zifferPos) {
            if (digits < 10) {
                return 0;
            } else {
                String x = "" + digits;
                return Integer.parseInt(x.substring(0, 1));
            }
        } else {
           if (digits < 10) {
                return digits;
            } else {
                String x = "" + digits;
                return Integer.parseInt(x.substring(1, 2));
            }
        }
    }

    @Override
    public void run() {
        while(true){
            setDigits();
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TimePanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
