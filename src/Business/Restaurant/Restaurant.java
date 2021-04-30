/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String restName;
    private String restLoc;
    private String adminName;
    private String number;
    private String id;
    private static int count;
    
    
    public Restaurant() {
        id = "R"+count;
        count++;
    }
    public String getId() {
        return id;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getRestLoc() {
        return restLoc;
    }

    public void setRestLoc(String restLoc) {
        this.restLoc = restLoc;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
     @Override
    public String toString() {
        return restName;
    }
}
