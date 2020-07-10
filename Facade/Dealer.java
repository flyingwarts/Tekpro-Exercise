/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hargi
 */
public class Dealer {  
    private Motorcycle Kawasaki;  
    private Motorcycle Harley;  
    private Motorcycle Yamaha;  
      
    public Dealer(){  
        Kawasaki = new Kawasaki();  
        Yamaha = new Yamaha();  
        Harley = new Harley();  
    }  
    public void KawasakiSale(){  
        Kawasaki.model();  
        Kawasaki.price();  
    }  
    public void YamahaSale(){  
        Yamaha.model();  
        Yamaha.price();  
    }  
    public void HarleySale(){  
        Harley.model();  
        Harley.price();  
        }  
}  

