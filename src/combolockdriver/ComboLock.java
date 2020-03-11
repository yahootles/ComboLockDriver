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
public class ComboLock {
    int[] combo = new int[3];
    boolean isOpen;
    
    /**
     * Constructor that creates a user defined combo lock
     * @param n1 - first number in the combo
     * @param n2 - second number in the combo
     * @param n3 - third number in the combo 
     */
    public ComboLock(int n1, int n2, int n3){
        combo[0] = n1;
        combo[1] = n2;
        combo[2] = n3;
        isOpen = false;
    }
    
    /**
     * Constructor that creates random combo
     */
    public ComboLock(){
        for(int i = 0; i < combo.length; i++){
            combo[i] = (int)Math.round(Math.random()*2+1);
        }
        isOpen = false;
    }
    
    /**
     * Method that returns the state of the lock after comparing the input combo vs the actual combo
     * @param nums - the input combo
     * @return - true is combo is correct, false if incorrect
     */
    public boolean unlock(int[] nums){
        if(combo[0]== nums[0] && combo[1] == nums[1] && combo[2] == nums[2]){
            isOpen = true;
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Method that locks the lock
     */
    public void lock(){
        isOpen = false;
    }
    
    /**
     * 
     * @return - whether the lock is open or not
     */
    public boolean getIsOpen(){
        return isOpen;
    }
    
    public int[] getCombo(){
        
        return combo;
    }
}
