/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitie;

import java.util.Date;

/**
 *
 * @author Joao Caetano
 */
public class HourContract {
    
    private Date date;
    private double valuePerhour;
    private Integer hours;
    
    public HourContract(){
        
    }
    
    public HourContract(Date date, double valuePerhour, Integer hours){
        this.date = date;
        this.valuePerhour = valuePerhour;
        this.hours = hours;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the valuePerhour
     */
    public double getValuePerhour() {
        return valuePerhour;
    }

    /**
     * @param valuePerhour the valuePerhour to set
     */
    public void setValuePerhour(double valuePerhour) {
        this.valuePerhour = valuePerhour;
    }

    /**
     * @return the hours
     */
    public Integer getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public double totalValue(){
        return valuePerhour * hours;
    }
    
}
