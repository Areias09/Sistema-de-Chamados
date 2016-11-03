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
public class EmpresaTest {
    
    public EmpresaTest() {
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
     * Test of getNumeroContrato method, of class Empresa.
     */
    @Test
    public void testGetNumeroContrato() {
        Empresa e = new Empresa(192138,"Intel");
        assertEquals(192168,e.getNumeroContrato());
    }

    /**
     * Test of setNumeroContrato method, of class Empresa.
     */
    @Test
    public void testSetNumeroContrato() {
        Empresa e = new Empresa(192168,"Intel");
        e.setNumeroContrato(192168);
        assertEquals(192168,e.getNumeroContrato());
    }

    /**
     * Test of getNomeEmpresa method, of class Empresa.
     */
    @Test
    public void testGetNomeEmpresa() {
        Empresa e = new Empresa(192138,"Intel");
        assertEquals("Intel",e.getNomeEmpresa());
    }

    /**
     * Test of setNomeEmpresa method, of class Empresa.
     */
    @Test
    public void testSetNomeEmpresa() {
         Empresa e = new Empresa(192138,"Intel");
         e.setNomeEmpresa("AMD");
         assertEquals("AMD",e.getNomeEmpresa());
    }

    /**
     * Test of toString method, of class Empresa.
     */
    @Test
    public void testToString() {
         Empresa em = new Empresa(168192,"AMD");
        assertEquals(" 168192 - AMD ",em.toString());
    }
    
}
