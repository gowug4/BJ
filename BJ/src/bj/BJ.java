/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bj;
import java.lang.Math.*;
import java.io.*;
/**
 *
 * @author asus
 */
public class BJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        // TODO code application logic here
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
        //---------------------------
        int card[];
        card = new int[52];
        char symbol[]={0x2663,0x2666,0x2665,0x2660};
        int flagOfCard=2;
        //---------------------------
        int i,j,temp;
        int random;
        boolean stop=false;
        int AI_c[]={0};
        //------------------------------
        int Player1_c[];
        Player1_c = new int[7];
        Player1_c[6]=0;
        //---------------------------------
        int set=0;
        double add=0.0;
        
        for(i = 0; i<52; i++)
        {
            card[i] = i;
        }
        //wash
        for(j = 0; j<52; j++)
        {
            random = (int )(Math.random() * (52-j));    
            //System.out.println(""+symbol[(card[j]/13)]+ (card[j]%13));
            temp = card[random];
            card[random] =  card[51-j] ; 
            card[51-j] = temp;            
        }
        System.out.println("****************************");
        //發
       for(i=0;i<2;i++)
        {
            Player1_c[Player1_c[6]]=card[i];
            System.out.print(""+symbol[(Player1_c[Player1_c[6]]/13)]+ ((Player1_c[Player1_c[6]]%13)+1));
            Player1_c[6]++;
        }
        while(stop!=true)
        {
        String key = keyin.readLine();
            switch(key)
            {
                case ("c"):            
                    //flagOfCard=flagOfCard+1;
                    Player1_c[Player1_c[6]]=card[flagOfCard++];
                    System.out.print(""+symbol[(Player1_c[Player1_c[6]]/13)]+ ((Player1_c[Player1_c[6]]%13)+1));
                    Player1_c[6]++;
                    /*Player1_c[6]++;
                    for(i=0;i<flagOfCard;i++)
                    {
                        System.out.print(""+symbol[(Player1_c[i]/13)]+ ((Player1_c[i]%13)+1));
                    }    */ 
                    if(Player1_c[6]==5)
                         stop=true;
                    break;
                case ("s"): 
                    stop=true;                
            }
        }
        
        System.out.println(" "); 
        for(i=0;i<Player1_c[6];i++)
        {
            if((Player1_c[i]%13)+1<10)
                Player1_c[5] += ((Player1_c[i]%13)+1);
            else
                Player1_c[5] += 10;
            System.out.print(""+symbol[(Player1_c[i]/13)]+ ((Player1_c[i]%13)+1));
        }
            System.out.println("total="+Player1_c[5]);
            //            break;     
            //default: return;
        
    }
    
    
}
