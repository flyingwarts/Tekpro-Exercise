/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hargi
 */
public class FacadePatternClient {  
    public static void main(String args[]){  
      Dealer sk=new Dealer();  
      sk.YamahaSale();  
      sk.KawasakiSale();
      sk.HarleySale();
    }
}  