/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.classes.test;

import junit.framework.Assert;
import org.junit.Test;
import test1.classes.Film;

/**
 *
 * @author admin
 */
public class FilmTest {
    
   @Test
   public void setterEtGetter() {
       Film pulpFiction = new Film();
       
       pulpFiction.setTitre("Pulp Fiction");
       Assert.assertEquals("Pulp Fiction", pulpFiction.getTitre());
   }
    
   @Test
   public void test(){
       Film f1 = new Film();
       f1.setTitre("Pulp Fiction");
       f1.setSynopsis("lalalalala");
       
       Film f2 = new Film();
       f2.setTitre("Kung Fu Panda");
       f2.setSynopsis("lalalalalalalla");
       
       System.out.println(f1);
       System.out.println(f2);
   }
   
}
