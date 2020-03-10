/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combolockdriver;

/**
 *
 * @author antho6229
 */
import javax.swing.JOptionPane;

public class ComboLockDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComboLock lock1, lock2;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        boolean flag = false;
        while (!flag) {
            try {
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number in the combo(must be a positive integer):"));
                if (n1 >= 0) {
                    flag = true;
                } else {
                    flag = false;
                }
            } catch (NumberFormatException nfe) {
                System.err.println("Invalid input");
            } catch (NullPointerException npe) {
                System.exit(0);
            }
        }

        flag = false;
        while (!flag) {
            try {
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number in the combo(must be a positive integer):"));
                if (n2 >= 0) {
                    flag = true;
                } else {
                    flag = false;
                }
            } catch (NumberFormatException nfe) {
                System.err.println("Invalid input");
            } catch (NullPointerException npe) {
                System.exit(0);
            }
        }

        flag = false;
        while (!flag) {
            try {
                n3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the third number in the combo(must be a positive integer):"));
                if (n3 >= 0) {
                    flag = true;
                } else {
                    flag = false;
                }
            } catch (NumberFormatException nfe) {
                System.err.println("Invalid input");
            } catch (NullPointerException npe) {
                System.exit(0);
            }
        }

        lock1 = new ComboLock(n1, n2, n3);

        flag = false;

        while (!flag) {
            try {
                String[] inputs = JOptionPane.showInputDialog("Try to unlock the lock!\nEnter the combo "
                        + "separated by dashes(ex. 1-3-47)").split("-");

                int[] combo = new int[inputs.length];
            } catch (NumberFormatException nfe) {

            } catch (NullPointerException npe) {
                System.exit(0);
            }
        }
    }

}
