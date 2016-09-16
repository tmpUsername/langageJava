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
    
}
