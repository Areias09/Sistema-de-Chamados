        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import Persistencia.TecnicoDAO;
import entidade.Tecnico;
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
public class ControleTecnicosTest {
    
    public ControleTecnicosTest() {
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
     * Test of inserir method, of class ControleTecnicos.
     */
    @Test
    public void testInserir() {
        ControladorPrincipal cp = new ControladorPrincipal();        
        ControleTecnicos ct = cp.getCtrTecnicos();
        Tecnico t = ct.inserir(31539092, "Gabriel");
        assertEquals("Gabriel",t.getNome());
    }

    /**
     * Test of cadastrarTecnico method, of class ControleTecnicos.
     */
    @Test
    public void bustarTecnicoTest() {
        ControleTecnicos ct = new ControleTecnicos();
        ct.inserir(3, "Gabriel");
        TecnicoDAO tDao = new TecnicoDAO();
        Assert.assertNotNull(tDao.get(3));
    }

    
}
