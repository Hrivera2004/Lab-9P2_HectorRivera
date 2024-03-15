package lab.pkg9p2_hectorrivera;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class barraProgreso extends Thread {

    private JProgressBar progBar;
    private JTextArea text;
    private boolean avanzar;
    private boolean vive;
    private String string;
    
    public barraProgreso() {
    }

    public barraProgreso(JProgressBar progBar, JTextArea text, String string) {
        this.progBar = progBar;
        this.text = text;
        this.avanzar = true;
        this.vive = true;
        this.string = string;
    }


    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
                progBar.setValue(progBar.getValue() + 1);
                if (progBar.getValue() == 100) {
                    vive = false;
                }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
        
        text.setText(string);
        JOptionPane.showMessageDialog(null, "File finished loading");
    }

}
