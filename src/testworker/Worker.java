/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testworker;

/**
 *
 * @author YanJun Fang
 */
public class Worker {
    private String name;
    private double rate;
    
    public Worker(){
    
    }
    public Worker(String n, double r){
        this.setName(n);
        this.setRate(r);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(double rate) {
        this.rate = rate;
    }   
    
    public double weeklyPay(){           
           return 0;   
    }
    
    public String toString(){
        return ""+this.getName() + this.getRate();
    }
}

