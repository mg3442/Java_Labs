/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10.entity;

import Lab10.exceptions.PackagePlansExceptions;
import java.io.IOException;

/**
 *
 * @author Aliaksiej Protas
 */
public class HolyShtPlan extends SnatchPackagePlans{

    public HolyShtPlan(int id, int payment,int outcomingToHardLife3G, int outcomingToOtherOperators2G, int internetTraffic, int numberOfUsers ) throws IOException, PackagePlansExceptions {
        super(id);
        setPayment(payment);
        setOutcomingToHardLife3G(outcomingToHardLife3G);
        setOutcomingToOtherOperators2G(outcomingToOtherOperators2G);
        setInternetTraffic(internetTraffic);
        setNumberOfUsers(numberOfUsers);   
        
        }

    
     @Override
     public String connectItems(){return "Activate new plan";};
     public String disconnectItems(){return "Deactivate plan";}; 
     
     
     @Override
     public String toString() {
         
         StringBuilder msg = new StringBuilder();
         msg.append("The information about ItsARobberyPlan: " + "\n");
         msg.append("The payment is ").append(getPayment()).append(", \n");
         msg.append("Outcoming calls to other operators ").append(getOutcomingToOtherOperators2G()).append(", \n");
         msg.append("Volume of internet traffic ").append(getInternetTraffic()).append("\n");
         msg.append("The Number of users ").append(getNumberOfUsers()).append("\n");
         
         return msg.toString();
     }
}

