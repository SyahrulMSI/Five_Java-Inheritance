/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HirarchicalInheritance;

/**
 *
 * @author Triyas
 */
public class HirarchicalInheritance {
   public static void main(String[] args) {
        ASUS Laptop_ASUS = new ASUS();
        Lenovo Laptop_Lenovo = new Lenovo();
        
        Laptop_ASUS .tampilkanLaptop();
        Laptop_ASUS .tampilASUS();
        
        Laptop_Lenovo.tampilkanLaptop();
        Laptop_Lenovo.tampilLenovo();
    }
} 
