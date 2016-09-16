/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class CollectionsTest {
    
    @Test
    public void recupRuby(){
        HashMap<String, String> map = new HashMap<>();
        
        map.put("Java", "Langage de programmation objet");
        map.put("C", "Langage de programmation structuré");
        map.put("Ruby", "Langage de script Objet");
        
        Assert.assertSame(map.get("Ruby"),"Langage de script Objet");
    }
    
    @Test
    public void remplaceDefRubyParSuperLangage(){
        HashMap<String, String> map = new HashMap<>();
        
        map.put("Java", "Langage de programmation objet");
        map.put("C", "Langage de programmation structuré");
        map.put("Ruby", "Langage de script Objet");
        
        map.replace("Ruby", "Super langage");
        
        Assert.assertSame("Super langage", map.get("Ruby"));
    }
}
