/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class CollectionsTest {

    @Test
    public void recupRuby() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Java", "Langage de programmation objet");
        map.put("C", "Langage de programmation structuré");
        map.put("Ruby", "Langage de script Objet");

        Assert.assertSame(map.get("Ruby"), "Langage de script Objet");
    }

    @Test
    public void remplaceDefRubyParSuperLangage() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Java", "Langage de programmation objet");
        map.put("C", "Langage de programmation structuré");
        map.put("Ruby", "Langage de script Objet");

        map.replace("Ruby", "Super langage");

        Assert.assertSame("Super langage", map.get("Ruby"));
    }

    @Test
    public void supprimeLangageC() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Java", "Langage de programmation objet");
        map.put("C", "Langage de programmation structuré");
        map.put("Ruby", "Langage de script Objet");

        map.remove("C");

        Assert.assertFalse(map.containsKey("C"));
    }

    @Test
    public void CreerNouvMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("PHP", "Langage de programmation web");
        map.put("Python", "Langage de script");

        HashMap<String, String> map1 = new HashMap<>();

        map1.put("Java", "Langage de programmation objet");
        map1.put("C", "Langage de programmation structuré");
        map1.put("Ruby", "Langage de script Objet");

        map.putAll(map1);

        for (Map.Entry<String, String> elem : map1.entrySet()) {
            Assert.assertTrue(map.containsKey(elem.getKey()));
        }
    }
}
