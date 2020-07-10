/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author 
 */
public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

       BinaryObserver binaryObserver = new BinaryObserver(subject);

      System.out.println("First state change: 20");	
      subject.setState(20);
      System.out.println("Second state change: 10");	
      subject.setState(10);
   }
}