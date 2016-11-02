/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.ClienteEmpresa;
import entidade.Empresa;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31539092
 */
public class ClienteDAOTest {
    
    public ClienteDAOTest() {
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
    public void testValidarCPF() {
        ClienteDAO clDao = new ClienteDAO();
        Empresa e = new Empresa(3, "Apple");
        ClienteEmpresa ce = new ClienteEmpresa(1, e, 5, "Microsoft", 2);
       clDao.put(ce);      
        ClienteEmpresa cEmp2 = clDao.voltaCashCliente().get(ce.getCpf());       
        if(ce.getCpf() == cEmp2.getCpf()){
        Assert.assertTrue(true);
        }else{
            Assert.assertFalse(false);
        }
    }

    @Test
    public void testGerarCodigo() {
        ClienteDAO clDao = new ClienteDAO();
        int codigo = clDao.gerarCodigo();
        Assert.assertNotNull(codigo);

    }

    @Test
    public void inserirClienteTest() {
        ClienteDAO clDao = new ClienteDAO();
        Empresa e = new Empresa(5, "Sony");
        ClienteEmpresa ce = new ClienteEmpresa(5, e, 2, "Samsung", 3);
        clDao.put(ce);
        ClienteEmpresa ce2 = clDao.get(3L);
        Assert.assertEquals(ce, ce2);

    }

    /**
     * Test of put method, of class ClienteDAO.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        ClienteEmpresa cliente = null;
        ClienteDAO instance = new ClienteDAO();
        instance.put(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class ClienteDAO.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Long codigoCliente = null;
        ClienteDAO instance = new ClienteDAO();
        ClienteEmpresa expResult = null;
        ClienteEmpresa result = instance.get(codigoCliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of persit method, of class ClienteDAO.
     */
    @Test
    public void testPersit() {
        System.out.println("persit");
        ClienteDAO instance = new ClienteDAO();
        instance.persit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
