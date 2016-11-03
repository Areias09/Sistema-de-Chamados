/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31539092
 */
public class PessoaTest {
    
    public PessoaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetNome() {
        Pessoa a = new Pessoa("Tche Tche", 12457896);
        a.setNome("Gabriel");
        assertEquals("Gabriel", a.getNome());
    }


    @Test
    public void testSetNome() {
        Pessoa a = new Pessoa("Tche Tche", 12457896);
        a.setNome("Leonardo");
        assertEquals("Leonardo", a.getNome());
    }

    /**
     * Test of getTelefone method, of class Pessoa.
     */
    @Test
    public void testGetTelefone() {
        Pessoa b = new Pessoa("Ingrid", 99895588);
        assertEquals(99895588 ,b.getTelefone());
    }

    /**
     * Test of setTelefone method, of class Pessoa.
     */
    @Test
    public void testSetTelefone() {
        Pessoa c = new Pessoa("Bibiana", 99740204);
        c.setTelefone(99531223);
        assertEquals(99531223, c.getTelefone());
    }
    
}
