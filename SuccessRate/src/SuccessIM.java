/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class SuccessIM {
    
    public static void main(String[] args){
        
        int attemps = 0;
        int succ = 1;
        int success = 0;
        int fail = 0;
        
        while(succ != 10){
            int chance = (int)(Math.random()*100) + 1;
            if(chance <=50){
                succ+=1;
                attemps+=1; 
                success +=1;
            }
            else{
                succ = 1;
                attemps+=1; 
                fail+=1;
                
            }
            
        }
        
        System.out.println("Totat attemps");
        System.out.println(attemps);
        System.out.println("Totat fails");
        System.out.println(fail);
        System.out.println("Total success");
        System.out.println(success);
        System.out.println("Final level achived");
        System.out.println(succ);
           
    }
    
}
