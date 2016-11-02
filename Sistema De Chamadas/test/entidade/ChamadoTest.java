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
public class ChamadoTest {

    public ChamadoTest() {
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

    Empresa e = new Empresa( 123 ,"Absolut");
    
    ClienteEmpresa ce = new ClienteEmpresa(123,e,1234567,"Cleber",9876541);
    
    Tecnico t = new Tecnico("Alfredo",2150);
    
    Chamado c = new Chamado(05,"problema na instalação","erro na instalação do netbeans",3,t,ce,"Windows","10","Cabo","192.168.0.1");
    Chamado c2 = new Chamado("banco de dados","não é possivel acessar o banco de dados",1,t,ce,"Windows","10","BancoA");
    Chamado c3 = new Chamado("problema de rede","não conecta ao wifi",2,t,ce,"Linux","Ubuntu","HD",5);

    
    @Test
    public void testGetTecnico() {
         assertEquals(t,c.getTecnico());
    }

    /**
     * Test of getCodigo method, of class Chamado.
     */
    @Test
    public void testGetCodigo() {
         assertEquals(05,c.getCodigo());
    }

    /**
     * Test of setCodigo method, of class Chamado.
     */
    @Test
    public void testSetCodigo() {
         c.setCodigo(01);
        assertEquals(01,c.getCodigo());
    }

    /**
     * Test of setTecnico method, of class Chamado.
     */
    @Test
    public void testSetTecnico() {
        Tecnico tec = new Tecnico("Valdívia",3164975);
        c.setTecnico(tec);
        assertEquals(tec,c.getTecnico());
    }

   
    @Test
    public void testGetCliente() {
        assertEquals(ce,c.getCliente());
    }

    
    @Test
    public void testSetCliente() {
        ClienteEmpresa ce2 = new ClienteEmpresa(789,e,101012,"Calebe",201265);
         
        c.setCliente(ce2);
        assertEquals(ce2,c.getCliente());
    }

    /**
     * Test of getStatus method, of class Chamado.
     */
    @Test
    public void testGetStatus() {
        assertEquals("Começo",c.getStatus());
    }

    /**
     * Test of setStatus method, of class Chamado.
     */
    @Test
    public void testSetStatus() {
        c.setStatus("Pronto");
        assertEquals("Pronto",c.getStatus());
    }

    /**
     * Test of getTipoProblema method, of class Chamado.
     */
    @Test
    public void testGetTipoProblema() {
        assertEquals("Banco de Dados",c2.getTipoProblema());
    }

    /**
     * Test of setTipoProblema method, of class Chamado.
     */
    @Test
    public void testSetTipoProblema() {
        assertEquals("Problema de instalação",c3.getTipoProblema());
    }

    /**
     * Test of getData method, of class Chamado.
     */
    @Test
    public void testGetData() {

    }

    /**
     * Test of setData method, of class Chamado.
     */
    @Test
    public void testSetData() {

    }

    /**
     * Test of getHora method, of class Chamado.
     */
    @Test
    public void testGetHora() {

    }

    /**
     * Test of setHora method, of class Chamado.
     */
    @Test
    public void testSetHora() {

    }

    /**
     * Test of getTitulo method, of class Chamado.
     */
    @Test
    public void testGetTitulo() {

    }

    /**
     * Test of setTitulo method, of class Chamado.
     */
    @Test
    public void testSetTitulo() {

    }

    /**
     * Test of getDescricao method, of class Chamado.
     */
    @Test
    public void testGetDescricao() {
  
    }

    /**
     * Test of setDescricao method, of class Chamado.
     */
    @Test
    public void testSetDescricao() {

    }

    /**
     * Test of getPrioridade method, of class Chamado.
     */
    @Test
    public void testGetPrioridade() {

    }

    /**
     * Test of setPrioridade method, of class Chamado.
     */
    @Test
    public void testSetPrioridade() {
 
    }

    /**
     * Test of getSistemaOperacional method, of class Chamado.
     */
    @Test
    public void testGetSistemaOperacional() {
        assertEquals("Linux",c3.getSistemaOperacional());
    }

    /**
     * Test of setSistemaOperacional method, of class Chamado.
     */
    @Test
    public void testSetSistemaOperacional() {
        c.setSistemaOperacional("Windows");
        assertEquals("Windows",c.getSistemaOperacional());
    }

    /**
     * Test of getVersaoSO method, of class Chamado.
     */
    @Test
    public void testGetVersaoSO() {
       assertEquals("Ubuntu",c3.getVersaoSO());
    }

    /**
     * Test of setVersaoSO method, of class Chamado.
     */
    @Test
    public void testSetVersaoSO() {
        c3.setVersaoSO("Debian");
        assertEquals("Debian",c3.getVersaoSO());
    }

    /**
     * Test of getBancoDeDados method, of class Chamado.
     */
    @Test
    public void testGetBancoDeDados() {
         assertEquals("BancoA",c2.getBancoDeDados());
    }

    /**
     * Test of setBancoDeDados method, of class Chamado.
     */
    @Test
    public void testSetBancoDeDados() {
        c2.setBancoDeDados("BD2");
        assertEquals("BD2",c2.getBancoDeDados());
    }

    /**
     * Test of getCausaProblema method, of class Chamado.
     */
    @Test
    public void testGetCausaProblema() {

    }

    /**
     * Test of setCausaProblema method, of class Chamado.
     */
    @Test
    public void testSetCausaProblema() {

    }

    /**
     * Test of getSolucaoProblema method, of class Chamado.
     */
    @Test
    public void testGetSolucaoProblema() {

    }

    /**
     * Test of setSolucaoProblema method, of class Chamado.
     */
    @Test
    public void testSetSolucaoProblema() {

    }

    /**
     * Test of getTipoConexao method, of class Chamado.
     */
    @Test
    public void testGetTipoConexao() {
 
    }

    /**
     * Test of setTipoConexao method, of class Chamado.
     */
    @Test
    public void testSetTipoConexao() {

    }

    /**
     * Test of getEnderecoRede method, of class Chamado.
     */
    @Test
    public void testGetEnderecoRede() {

    }

    /**
     * Test of setEnderecoRede method, of class Chamado.
     */
    @Test
    public void testSetEnderecoRede() {

    }

    /**
     * Test of getOperacao method, of class Chamado.
     */
    @Test
    public void testGetOperacao() {

    }

    /**
     * Test of setOperacao method, of class Chamado.
     */
    @Test
    public void testSetOperacao() {
     
    }

    /**
     * Test of getDuracaoOperacao method, of class Chamado.
     */
    @Test
    public void testGetDuracaoOperacao() {
       
    }

    /**
     * Test of setDuracaoOperacao method, of class Chamado.
     */
    @Test
    public void testSetDuracaoOperacao() {
        
    }

    /**
     * Test of equals method, of class Chamado.
     */
    @Test
    public void testEquals() {
        
    }

}


