/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

/**
 *
 * @author PC
 */
public class Prueba {
    
}
/*
    
s
    
    
}
/*
public class Inventario {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;

        str = sc.nextLine();
        String[] split = str.split("&");
        Perecedero[] per = new Perecedero[10];
        noPerecedero[] noper = new noPerecedero[10];
        int i = 0;
        int j = 0;
        while(!"3".equals(split[0])){
            if(split[0].equals("1")){  
                if(split[1].equals("Perecedero")){ 
                    per[i] = new Perecedero(split[2],split[3],split[4],split[5],split[6]);
                    i++;
                }else if(split[1].equals("NoPerecedero")){
                    noper[j] = new noPerecedero(split[2],split[3],split[4],split[5]);
                    j++;
                }
            }else if(split[0].equals("2")){
                System.out.println("***Inventario de Productos***");
                for(int k=0;k<i;k++){
                    per[k].mostrar();
                    noper[k].mostrar();
                }
            }
            str = sc.nextLine();
            split = str.split("&");
        }       
    }
}
*/