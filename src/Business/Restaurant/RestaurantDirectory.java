/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.DeliveryMan.DeliveryMan;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantList;

    
     public RestaurantDirectory() {
        restaurantList = new ArrayList();
    }
     
    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
      public Restaurant addRestaurant(){
        Restaurant c = new Restaurant();
        restaurantList.add(c);
        return c;
    }
    
    public void deleteRestaurant(Restaurant c){
        restaurantList.remove(c);
    }
    
    public boolean checkIfUsernameIsUnique(String name){
        for (Restaurant ua : restaurantList){
            if (ua.getRestName().equals(name))
                return false;
        }
        return true;
    }
    
   
}
