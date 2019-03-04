
import java.time.LocalTime;
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

    private LocalTime time;

    public TimePanel(LocalTime time) {
        this.time = time;
    }

    private void init() {

        JLabel h1 = new JLabel(getIcon(getZiffer(true, time.getHour())));
        JLabel h2 = new JLabel(getIcon(getZiffer(false, time.getHour())));
        JLabel doppelpoint1 = new JLabel(icon);
        JLabel m1 = new JLabel(getIcon(getZiffer(true, time.getMinute())));
        JLabel m2 = new JLabel(getIcon(getZiffer(false, time.getMinute())));
        JLabel doppelpoint2 = new JLabel(icon);
        JLabel s1 = new JLabel(getIcon(getZiffer(true, time.getSecond())));
        JLabel s2 = new JLabel(getIcon(getZiffer(false, time.getSecond())));

    }

    private ImageIcon getIcon(int ziffer) {
        ImageIcon icon = new ImageIcon();
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
                return Integer.parseInt(x.substring(1, 1));
            }
        }
    }
}
