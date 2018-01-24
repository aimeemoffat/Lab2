/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import MyPackage.PackageClass;

/**
 *
 * @author aimeemoffat
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This is a java app");
        
        MyClassOne class1 = new MyClassOne();
        PackageClass packageClass = new PackageClass();
        
        class1.MethodOne();
        
        System.out.println(class1.AddNumber(2, 3));
        
        System.out.println(packageClass.PackageMethod());
    }
    
}
