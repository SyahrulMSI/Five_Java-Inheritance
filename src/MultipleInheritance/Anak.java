/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultipleInheritance;

/**
 *
 * @author Triyas
 */
    public class Anak implements Paman, Bibi{
        
        @Override
        public void TampilkanPaman(){
           System.out.print("Paman : Ilham Prasetya || ");
        }
 
  @Override
  public void TampilkanBibi(){
      System.out.print("Bibi : Yaswa Putri || ");
   
  }
    
   public void TampilkanAnak(){
       System.out.println("Anak : Zahra Hawyas Saputri");
   }
}
  