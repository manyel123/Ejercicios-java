
public class SuccessRate {
    
    public static void main(String[] args){
        
        int attemps = 0;
        int succ = 0;
        int success = 0;
        int fail = 0;
        
        while(succ != 10){
            int chance = (int)(Math.random()*100) + 1;
            if(chance <=35){
                succ+=1;
                attemps+=1; 
                success +=1;
            }
            else{
                if(succ<0){
                    succ=0;
                    fail+=1;
                    attemps+=1;
                }else{
                    fail+=1;
                    succ-=1;
                    attemps+=1;
                }
                
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
