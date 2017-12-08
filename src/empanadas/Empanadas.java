/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empanadas;

/**
 *
 * @author PC12
 */
public class Empanadas {

    enum Provincia {SALTA, TUCUMAN, CATAMARCA, JUJUY};

    public static int  promocionLocal (Provincia provincias, int empanadasSalteñas, int empanadasTucumanas ){
        int cajasSalta = 0;
        int cajasTucuman = 0;
        int rst=0;
        
       if (provincias==Provincia.SALTA) {
           
            cajasSalta = empanadasSalteñas /4;
            cajasTucuman = empanadasTucumanas /2;
       } else
       if (provincias==Provincia.TUCUMAN) {
           
            cajasSalta = empanadasSalteñas /2;
            cajasTucuman = empanadasTucumanas /4;
            }else
       if (provincias==Provincia.CATAMARCA)  {
           
            cajasSalta = empanadasSalteñas /3;
            cajasTucuman = empanadasTucumanas /3;
            }else
           if (provincias==Provincia.JUJUY)  {
           
            cajasSalta = empanadasSalteñas /3;
            cajasTucuman = empanadasTucumanas /3;
            }
       
        return Math.min(cajasSalta, cajasTucuman);
   }
   
    public static void main(String[] args) {
        // TODO code application logic here
       // System.out.println(Provincia.Jujuy);
        System.out.println("la cantidad de cajas salta es : " + promocionLocal(Provincia.SALTA, 4, 2));
        System.out.println("lacantidad de cajas para tucuman es : " + promocionLocal(Provincia.TUCUMAN, 2, 4));
        System.out.println("lacantidad de cajas para catamarca es : " + promocionLocal(Provincia.CATAMARCA, 3, 3));
        System.out.println("lacantidad de cajas para jujuy es : " + promocionLocal(Provincia.JUJUY, 6, 6));
        
    }
    
}
   