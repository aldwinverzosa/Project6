
import java.awt.Font;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 *
 *
 * @author Aldwin
 */
public class Project6 {

    public static void showOutput(String output) {
        JTextArea jt = new JTextArea(output);
        jt.setFont(new Font("Monotype Corsiva", Font.ITALIC, 72));
        JOptionPane.showMessageDialog(null, jt);

    }

    public static int getHighest(int x[]) {
        int hi = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > hi) {
                hi = x[i];
            }
        }
        return hi;
    }

    public static int getLowest(int x[]) {

        int lo = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < lo) {
                lo = x[i];
            }
        }
        return lo;

    }

    public static int[] getData(String input) {
        String data[] = input.trim().split("\\s+");
        int x[] = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            try {
                x[i] = Integer.parseInt(data[i]);
            } catch (NumberFormatException nfe) {
                System.err.println("Invalid input, assigning zero");
                x[i]=0;
            }
        }
        return x;
    }

    public static float getAverage(int x[]) {
        float total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }

        return total / x.length;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x[] = new int[6];

        int[] y = {10, 20, 30};
    }

}
