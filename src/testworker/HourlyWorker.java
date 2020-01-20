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
public class HourlyWorker extends Worker{
    int actualHour;
    double sum;
    
    public HourlyWorker(){
    
    }
//    public HourlyWorker(int ac){
//        this.setActualHour(ac);
//    }
    public HourlyWorker(String n, double r, int a){
        super(n,r);
        this.actualHour = a;       
    }

    /**
     * @return the actualHour
     */
    public int getActualHour() {
        return actualHour;
    }

    /**
     * @param actualHour the actualHour to set
     */
    public void setActualHour(int actualHour) {
        this.actualHour = actualHour;
    }
   
    
    @Override
    public double weeklyPay(){           
            sum = this.actualHour*this.getRate();
            return sum;
    
    }
//    public String toString(){
//        String str = super.toString()+ String.format("Salary:%.2f", this.sum);
//        return str;
//    }
}
