/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import Persistencia.ClienteDAO;
import entidade.ClienteEmpresa;
import entidade.Empresa;
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
public class ControleClientesTest {

    public ControleClientesTest() {
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
     * Test of getClienteDAO method, of class ControleClientes.
     */
   @Test
    public void testGetClienteDAO() {
       ControladorPrincipal cp = new ControladorPrincipal();
       ControleClientes cc = cp.getCtrClientes();
       ClienteDAO cDao= cc.getClienteDAO();
       assertEquals(true,cDao instanceof ClienteDAO);
    }


    @Test
    public void testIncluiNovoCliente() {
        ControladorPrincipal cp = new ControladorPrincipal();
        ControleClientes cc = cp.getCtrClientes();
        ClienteEmpresa c = cc.incluiNovoCliente(new Empresa(2, "Doritos"), (long) 31649782, "Samsung", (long) 21658782);
        assertEquals((long) 1234567891,c.getCpf());
    }

}
