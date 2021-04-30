/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.ArrayList;

/**
 *
 * @author akhil
 */
public class MenuDirectory {
     private ArrayList<Menu> foodList;
    
  public MenuDirectory() {
      foodList = new ArrayList();
  } 

    public ArrayList<Menu> getFoodList() {
        return foodList;
    }

    public void setFoodList(ArrayList<Menu> foodList) {
        this.foodList = foodList;
    }
     public Menu addMenu(){
        Menu c = new Menu();
        foodList.add(c);
        return c;
    }
    
    public void deleteMenu(Menu c){
        foodList.remove(c);
    }
    
}
