/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.Empresa;
import java.util.Collection;
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
public class EmpresaDAOTest {
    
    public EmpresaDAOTest() {
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
     * Test of put method, of class EmpresaDAO.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        Empresa ep = null;
        EmpresaDAO instance = new EmpresaDAO();
        instance.put(ep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of persit method, of class EmpresaDAO.
     */
    @Test
    public void testPersit() {
        System.out.println("persit");
        EmpresaDAO instance = new EmpresaDAO();
        instance.persit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void insereEmpresaTest() {
        Empresa e = new Empresa(1,"IBM");      
        EmpresaDAO eDao = new EmpresaDAO();
        Empresa ePronto = null;
        eDao.put(e);
         Collection<Empresa> empresas = eDao.getEmpresas();
         for (Empresa empresa : empresas) {
            if((empresa.getNumeroContrato() == e.getNumeroContrato()) && 
                    (e.getNomeEmpresa().equals(empresa.getNomeEmpresa()))){
                ePronto =empresa;
            }           
        }
         Assert.assertEquals(ePronto, e);
    }
 
    
    @Test
    public void testGetEmpresas() {
        EmpresaDAO eDao = new EmpresaDAO();
         Collection<Empresa> empresas = eDao.getEmpresas();     
         Assert.assertTrue(empresas.size() > 0);
    }

    /**
     * Test of voltaEmpresa method, of class EmpresaDAO.
     */
    @Test
    public void testVoltaEmpresa() {
        System.out.println("voltaEmpresa");
        EmpresaDAO eDao = new EmpresaDAO();     
        HashMap<Long,Empresa> retorno = eDao.voltaEmpresa();       
        Assert.assertNotNull(retorno);        
    }
    
}
