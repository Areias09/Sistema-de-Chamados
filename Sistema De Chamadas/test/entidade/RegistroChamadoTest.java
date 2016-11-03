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
public class RegistroChamadoTest {

    public RegistroChamadoTest() {
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
     * Test of getCodigo method, of class RegistroChamado.
     */
    @Test
    public void testeCadastro() {
        Tecnico t = new Tecnico("Gabriel", 444);
        Empresa e = new Empresa(444, "Samsung");

        ClienteEmpresa ce = new ClienteEmpresa(344, e, 7489543, "Henrique", 444);
        Chamado c = new Chamado("Título", "Descrição", 344, t, ce, "Windows", "10", "Operação concluiada", 8);
        c.setCodigo(4);
        RegistroChamado rc = new RegistroChamado("Problema de configuracao", c, t);

        assertNotNull(rc.getData());
        assertNotNull(rc.getHora());
        assertEquals("Problema de configuracao", rc.getAssunto());
        assertEquals(t, rc.getTecnico());
        assertEquals(c, rc.getChamado());
    }

    @Test(expected = Exception.class)
    public void testeCadastroInvalido() throws Exception {
        Tecnico t = new Tecnico("Gabriel", 444);
        RegistroChamado rc = new RegistroChamado("Problema de configuracao", null, t);
    }

    @Test
    public void testeAlterarTecnico() {
        Tecnico t = new Tecnico("Gabriel", 444);
        Empresa e = new Empresa(444, "Samsung");
        ClienteEmpresa ce = new ClienteEmpresa(334, e, 7489543, "Henrique", 444);
        Chamado c = new Chamado("Título", "Descrição", 344, t, ce, "Windows", "10", "Operação concluida", 8);
        c.setCodigo(4);
        RegistroChamado rc = new RegistroChamado("Problema de configuracao", c, t);
        Tecnico t2 = new Tecnico("Joao", 345532);
        rc.setTecnico(t2);
        assertEquals(t2, rc.getTecnico());
    }
}
