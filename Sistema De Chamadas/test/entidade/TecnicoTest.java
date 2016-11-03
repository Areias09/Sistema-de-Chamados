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
public class TecnicoTest {
    
    public TecnicoTest() {
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

    /**
     * Test of toString method, of class Tecnico.
     */
    
    @Test
    public void testeCadastrarTecnico() {
        Tecnico t = new Tecnico("Luiz", 55662233);
        assertEquals("Luiz", t.getNome());
        assertEquals(55662233, t.getTelefone());
    }
    
    @Test
    public void mudaTelTest() {
        Tecnico t = new Tecnico("Gabriel", 73354686);
        t.setTelefone(99920203);
        assertEquals(99920203, t.getTelefone());
    }

    
}
