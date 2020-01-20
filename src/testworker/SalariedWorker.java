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
public class SalariedWorker extends Worker{
    private double res;
    
    public SalariedWorker(){
    
    }
    
    public SalariedWorker(String n, double r){
        super(n,r);
    }
    
    @Override
    public double weeklyPay(){           
            res = 40*this.getRate();
            return res;
    }
    
//    public String toString(){
//        String str = super.toString() + String.format("Salary:%.2f", this.res);
//        return str;
//    }

}
