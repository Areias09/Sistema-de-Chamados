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
public class ClienteEmpresaTest {
    
    public ClienteEmpresaTest() {
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
     * Test of getCodigo method, of class ClienteEmpresa.
     */
    @Test
    public void testGetCodigo() {
        Empresa e = new Empresa(312134, "Askov");
        ClienteEmpresa ce = new ClienteEmpresa(3534,e,54689,"Roberto",67485943);
        assertEquals(ce.getCodigo(),ce.getCodigo());
    }

    /**
     * Test of setCodigo method, of class ClienteEmpresa.
     */
    @Test
    public void testSetCodigo() {
         Empresa e = new Empresa(312134, "Askov");
        ClienteEmpresa ce = new ClienteEmpresa(3534,e,54689,"Roberto",67485943);
        ce.setCodigo(312134);
       assertEquals(ce.getCodigo(),ce.getCodigo());
    }

    /**
     * Test of getCpf method, of class ClienteEmpresa.
     */
    @Test
    public void testGetCpf() {
        Empresa e = new Empresa(312134, "Askov");
        ClienteEmpresa ce = new ClienteEmpresa(3534,e,54689,"Roberto",67485943);
        
        assertEquals(54689,ce.getCpf());
    }

    /**
     * Test of setCpf method, of class ClienteEmpresa.
     */
    @Test
    public void testSetCpf() {
        Empresa e = new Empresa(312134, "Askov");
        ClienteEmpresa ce = new ClienteEmpresa(3534,e,54689,"Roberto",67485943);
        ce.setCpf(312134);
        assertEquals(312134,ce.getCpf());
    }

    /**
     * Test of getEmpresa method, of class ClienteEmpresa.
     */
    @Test
    public void testGetEmpresa() {
      Empresa e = new Empresa(312134, "Askov");
        ClienteEmpresa ce = new ClienteEmpresa(3534,e,54689,"Roberto",67485943);
        assertEquals(e, ce.getEmpresa());
    }

    /**
     * Test of toString method, of class ClienteEmpresa.
     */
    @Test
    public void testToString() {
        Empresa e = new Empresa(312134, "Askov");
        ClienteEmpresa ce = new ClienteEmpresa(3534,e,54689,"Roberto",67485943);
        assertEquals("312134,Askov,54689,Roberto",ce.toString());
    }
    
}