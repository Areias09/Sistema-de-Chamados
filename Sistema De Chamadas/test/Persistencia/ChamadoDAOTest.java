/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.RegistroChamado;
import entidade.Tecnico;
import entidade.TipoConexao;
import java.util.Collection;
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
public class ChamadoDAOTest {
    
    public ChamadoDAOTest() {
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
     * Test of gerarCodigo method, of class ChamadoDAO.
     */
    @Test
    public void testGerarCodigo() {
        System.out.println("gerarCodigo");
        ChamadoDAO instance = new ChamadoDAO();
        int expResult = 0;
        int result = instance.gerarCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gerarCodigoRegistroChamado method, of class ChamadoDAO.
     */
    @Test
    public void testGerarCodigoRegistroChamado() {
        System.out.println("gerarCodigoRegistroChamado");
        ChamadoDAO instance = new ChamadoDAO();
        int expResult = 0;
        int result = instance.gerarCodigoRegistroChamado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of put method, of class ChamadoDAO.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        Chamado chamado = null;
        ChamadoDAO instance = new ChamadoDAO();
        instance.put(chamado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of putRegistro method, of class ChamadoDAO.
     */
    @Test
    public void testPutRegistro() {
        System.out.println("putRegistro");
        RegistroChamado registroChamado = null;
        ChamadoDAO instance = new ChamadoDAO();
        instance.putRegistro(registroChamado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class ChamadoDAO.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Integer codigoChamado = null;
        ChamadoDAO instance = new ChamadoDAO();
        Chamado expResult = null;
        Chamado result = instance.get(codigoChamado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of persit method, of class ChamadoDAO.
     */
    @Test
    public void testPersit() {
        System.out.println("persit");
        ChamadoDAO instance = new ChamadoDAO();
        instance.persit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChamados method, of class ChamadoDAO.
     */
    @Test
    public void testGetChamados() {
        System.out.println("getChamados");
        ChamadoDAO instance = new ChamadoDAO();
        Collection<Chamado> expResult = null;
        Collection<Chamado> result = instance.getChamados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegistros method, of class ChamadoDAO.
     */
    @Test
    public void testGetRegistros() {
        System.out.println("getRegistros");
        ChamadoDAO instance = new ChamadoDAO();
        Collection<RegistroChamado> expResult = null;
        Collection<RegistroChamado> result = instance.getRegistros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
     @Test
    public void ChamadoModenTest() {
        Tecnico t = new Tecnico("Gabriel", 147);
        Empresa e = new Empresa(1, "IBM");
        ClienteEmpresa ce = new ClienteEmpresa(Integer.SIZE, e, 12123, "Areias", 123);
        Chamado c = new Chamado(5, "Problema", "Descrição", 3, t, ce, "Linux", "Ubuntu", "" + TipoConexao.CaboModen, "147");
        ChamadoDAO cDao = new ChamadoDAO();
        cDao.put(c);
        Assert.assertTrue(cDao.getChamados().size() >= 1);
    }
    
    @Test
    public void ChamadoAdslTest() {
        Tecnico t = new Tecnico("Gabriel", 147);
        Empresa e = new Empresa(1, "IBM");
        ClienteEmpresa ce = new ClienteEmpresa(Integer.SIZE, e, 1324L, "Areias", 123);
        Chamado c = new Chamado(5, "Problema", "Descrição", 3, t, ce, "Linux", "Ubuntu", "" + TipoConexao.ADSL, "147");
        ChamadoDAO cDao = new ChamadoDAO();
        cDao.put(c);
        Assert.assertTrue(cDao.getChamados().size() >= 1);
    }
    
    @Test
    public void inserirChamadoModenTest() {
       Tecnico t = new Tecnico("Gabriel", 147);
        Empresa e = new Empresa(1, "IBM");
        ClienteEmpresa ce = new ClienteEmpresa(Integer.SIZE, e, 1324L, "Areias", 123);
        Chamado c = new Chamado(5, "Problema", "Descrição", 3, t, ce, "Linux", "Ubuntu", "" + TipoConexao.CaboModen, "147");
        ChamadoDAO cDao= new ChamadoDAO();
        cDao.put(c);

        Chamado c2 = cDao.get(cDao.gerarCodigo() - 1);

        Assert.assertEquals(c.getTitulo(), c2.getTitulo());
        Assert.assertEquals(c.getDescricao(), c2.getDescricao());
        Assert.assertEquals(c.getPrioridade(), c2.getPrioridade());
        Assert.assertEquals(c.getTecnico().getNome(), c2.getTecnico().getNome());
        Assert.assertEquals(c.getCliente().getCpf(), c2.getCliente().getCpf());
        Assert.assertEquals(c.getSistemaOperacional(), c2.getSistemaOperacional());
        Assert.assertEquals(c.getTipoConexao(), c2.getTipoConexao());
        Assert.assertEquals(c.getEnderecoRede(), c2.getEnderecoRede());
    }
}