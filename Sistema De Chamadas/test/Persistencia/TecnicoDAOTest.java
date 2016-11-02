/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.Tecnico;
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
public class TecnicoDAOTest {

    public TecnicoDAOTest() {
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
     * Test of gerarCodigo method, of class TecnicoDAO.
     */
    @Test
    public void testGerarCodigo() {
        TecnicoDAO tDao = new TecnicoDAO();
        int cod = tDao.gerarCodigo();
        Assert.assertNotNull(cod);
    }


    @Test
    public void buscaTecnicoTest() {
        Tecnico t = new Tecnico("Henrique",315);
        TecnicoDAO tDao = new TecnicoDAO();
        tDao.put(t);
        Tecnico tecnico2 = tDao.get(tDao.gerarCodigo() - 1);
        Assert.assertEquals(t,tecnico2);
    }

    @Test
    public void getTecnicoTest() {
        Tecnico t3 = new Tecnico("Fernando Prass",001 );
       assertEquals(t3, "Fernando Prass");
    }

}
