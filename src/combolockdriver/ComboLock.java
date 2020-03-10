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
    
    public ComboLock(int n1, int n2, int n3){
        combo[0] = n1;
        combo[1] = n2;
        combo[2] = n3;
        isOpen = false;
    }
    
    public ComboLock(){
        for(int i = 0; i < combo.length; i++){
            combo[i] = (int)Math.round(Math.random()*2+1);
        }
        isOpen = false;
    }
    
    public boolean unlock(int n1, int n2, int n3){
        if(combo[0]==n1 && combo[1] == n2 && combo[2] == n3){
            isOpen = true;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean getIsOpen(){
        return isOpen;
    }
}
