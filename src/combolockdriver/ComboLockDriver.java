/*
 * Andrew Thompson
 * March 11, 2020
 * Program that simulates combo locks that can have random or assigned combos
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
        //variable declaration
        ComboLock lock1, lock2;
        //3 input numbers for combo
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        //falg for while loop
        boolean flag = false;

        //get the first number. Must be positive or 0.
        while (!flag) {
            try {
                String input = JOptionPane.showInputDialog("Enter the first number in the combo(must be a positive integer):");

                if (input != null) {

                    n1 = Integer.parseInt(input);
                    if (n1 >= 0) {
                        flag = true;
                    } else {//keep looping if number is negative
                        System.err.println("Invalid input");
                        flag = false;
                    }
                } else {
                    System.exit(0);
                }
            } catch (NullPointerException npe) {//exit program if cancel clicked
                System.exit(0);
            } catch (NumberFormatException nfe) {//keep looping until valid input
                System.err.println("Invalid input");
            }
        }

        //same as above but with secon number
        flag = false;
        while (!flag) {
            try {
                String input = JOptionPane.showInputDialog("Enter the second number in the combo(must be a positive integer):");

                if (input != null) {

                    n2 = Integer.parseInt(input);
                    if (n2 >= 0) {
                        flag = true;
                    } else {//keep looping if number is negative
                        System.err.println("Invalid input");
                        flag = false;
                    }
                } else {
                    System.exit(0);
                }
            } catch (NullPointerException npe) {//exit program if cancel clicked
                System.exit(0);
            } catch (NumberFormatException nfe) {//keep looping until valid input
                System.err.println("Invalid input");
            }
        }

        //same as above but with third number
        flag = false;
        while (!flag) {
            try {
                String input = JOptionPane.showInputDialog("Enter the third number in the combo(must be a positive integer):");

                if (input != null) {

                    n3 = Integer.parseInt(input);
                    if (n3 >= 0) {
                        flag = true;
                    } else {//keep looping if number is negative
                        System.err.println("Invalid input");
                        flag = false;
                    }
                } else {
                    System.exit(0);
                }
            } catch (NullPointerException npe) {//exit program if cancel clicked
                System.exit(0);
            } catch (NumberFormatException nfe) {//keep looping until valid input
                System.err.println("Invalid input");
            }
        }

        //make new lock with combo as input numbers
        lock1 = new ComboLock(n1, n2, n3);

        flag = false;

        //loop until valid input
        while (!flag) {
            try {
                String[] inputs = JOptionPane.showInputDialog("Try to unlock the lock!\nEnter the combo "
                        + "separated by dashes(ex. 1-3-47)").split("-");//get input and split on dashes

                int[] combo = new int[3];

                for (int i = 0; i < combo.length; i++) {
                    combo[i] = Integer.parseInt(inputs[i]);//try to convert to integers
                }

                flag = true;

                if (lock1.unlock(combo)) {//try to unlock the lock
                    System.out.println("The lock is unlocked!");
                } else {
                    System.out.println("The lock is not unlocked. The combo is: ");
                    System.out.println(lock1.getCombo()[0] + " " + lock1.getCombo()[1] + " " + lock1.getCombo()[2]);//tell user combo
                }

            } catch (NumberFormatException nfe) {
                System.err.println("Invalid input. Try again.");
            } catch (NullPointerException npe) {
                System.exit(0);
            } catch (IndexOutOfBoundsException ioobe) {
                System.err.println("Invalid input. Try again.");
            }
        }

        //second lock with random combo
        lock2 = new ComboLock();

        flag = false;

        //same as first lock
        while (!flag) {
            try {
                String input = JOptionPane.showInputDialog("Try to unlock the lock!\nEnter the combo "
                            + "separated by dashes(ex. 1-3-47)");
                if (input != null) {
                    String[] inputs = input.split("-");

                    int[] combo = new int[inputs.length];

                    for (int i = 0; i < inputs.length; i++) {
                        combo[i] = Integer.parseInt(inputs[i]);
                    }

                    if (lock2.unlock(combo)) {
                        System.out.println("The lock is unlocked!");
                    } else {
                        System.out.println("The lock is not unlocked. The combo is: ");
                        System.out.println(lock2.getCombo()[0] + " " + lock2.getCombo()[1] + " " + lock2.getCombo()[2]);
                    }
                }else{
                    System.exit(0);
                }
                flag = true;
            } catch (NumberFormatException nfe) {
                System.err.println("Invalid input. Try again.");
            } catch (NullPointerException npe) {
                System.exit(0);
            } catch (IndexOutOfBoundsException ioobe) {
                System.err.println("Invalid input. Try again.");
            }
        }
    }

}
