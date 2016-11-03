/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

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
public class ControleEmpresasTest {

    public ControleEmpresasTest() {
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
     * Test of retorna method, of class ControleEmpresas.
     */
    @Test
    public void testInserir() {
        ControladorPrincipal cp = new ControladorPrincipal();
        ControleEmpresas ce = cp.getCtrEmpresa();
        Empresa e = new Empresa(31527985, "Sony");
        ce.inserir(31649782, "Sony");
        assertEquals(31649782, e.getNumeroContrato());
        assertEquals("Sony", e.getNomeEmpresa());
    }

    /**
     * Test of checar method, of class ControleEmpresas.
     */
    @Test
    public void testVerificar() {
        ControladorPrincipal cp = new ControladorPrincipal();
        ControleEmpresas ce = cp.getCtrEmpresa();
        int valida = ce.validar(31649782, "Sony");
        assertEquals(31649780, valida);
    }

}
