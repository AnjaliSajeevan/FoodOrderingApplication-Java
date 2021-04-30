/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryManList;
    
    public DeliveryManDirectory() {
        deliveryManList = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
     public DeliveryMan addDeliveryMan(){
        DeliveryMan c = new DeliveryMan();
        deliveryManList.add(c);
        return c;
    }
    
    public void deleteDeliveryMan(DeliveryMan c){
        deliveryManList.remove(c);
    }
    
    public boolean checkIfUsernameIsUnique(String name){
        for (DeliveryMan ua : deliveryManList){
            if (ua.getName().equals(name))
                return false;
        }
        return true;
    }
}
