package ojciec_pio_1;

import java.util.Random;

public class Ojciec_Pio_1 {

     public static void main(String[] args) {
        
         int wylosowana, losowana;
         Random rand = new Random();
         int krepo=0;
        
         System.out.print("Witaj, podaj liczbe z zakresu 1-6 \n");
         
         do
         {
            krepo=0;
            
            wylosowana = rand.nextInt(6);
            losowana = rand.nextInt(6);
            
            wylosowana=wylosowana+1;
            losowana=losowana+1;
             
            System.out.print("Probuj szczescia: ");
            
            System.out.print("Mistrz gry wylosowal: " + wylosowana +"\n");
            
            System.out.print("Grasz wylosowal: "+ losowana+ "\n");
            
            if(losowana==6) krepo=krepo+1;
            if(wylosowana==6) krepo=krepo+1;
            
            System.out.print("KREPSON: " + krepo + "\n");
         }
         while(krepo<2);
         
         
    }
    
}

