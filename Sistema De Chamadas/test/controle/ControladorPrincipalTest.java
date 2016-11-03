/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.RegistroChamado;
import entidade.Tecnico;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31539092
 */
public class ControladorPrincipalTest {
    
    private ControladorPrincipal controlador;
    
    public ControladorPrincipalTest() {
    }
    
    @Before
    public void setUp() throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("tecnicos.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        HashMap<Integer, Tecnico> cacheTecnico = new HashMap<>();

        cacheTecnico.put(1, new Tecnico("Felipe", 85948373));

        oos.writeObject(cacheTecnico);

        oos.flush();
        fos.flush();

        oos.close();
        fos.close();

        fos = new FileOutputStream("empresas.dat");
        oos = new ObjectOutputStream(fos);

        HashMap<Long, Empresa> cacheEmpresa = new HashMap<>();

        cacheEmpresa.put((long) 4444, new Empresa(4444, "Balalaika"));

        oos.writeObject(cacheEmpresa);

        oos.flush();
        fos.flush();

        oos.close();
        fos.close();

        fos = new FileOutputStream("clientes.dat");
        oos = new ObjectOutputStream(fos);

        HashMap<Long, ClienteEmpresa> cacheCliente = new HashMap<>();

        String cpf = "39675849345";

        cacheCliente.put(Long.parseLong(cpf), new ClienteEmpresa(1, new Empresa(4444, "Balalaika"), Long.parseLong(cpf), "Felipe", 85948373));

        oos.writeObject(cacheCliente);

        oos.flush();
        fos.flush();

        oos.close();
        fos.close();

        fos = new FileOutputStream("chamados.dat");
        oos = new ObjectOutputStream(fos);

        HashMap<Integer, Chamado> cacheChamado = new HashMap<>();
        Tecnico t1 = new Tecnico("Gabriel", 31566756);
        ClienteEmpresa ce = new ClienteEmpresa(1, new Empresa(1010, "Razer"), 859485434, "João", 456643435);
        cacheChamado.put(1, new Chamado("banco de dados", "falha de dados", 1, t1, ce, "Windows", "10", "Banco"));

        oos.writeObject(cacheChamado);

        oos.flush();
        fos.flush();

        oos.close();
        fos.close();

        fos = new FileOutputStream("registroChamados.dat");
        oos = new ObjectOutputStream(fos);

        HashMap<Integer, RegistroChamado> cacheRegistro = new HashMap<>();
        Tecnico tec = new Tecnico("Gabriel", 31566756);

        String cpf1 = "39675849345";
        Empresa emp = new Empresa(123456, "Razer");
        ClienteEmpresa ce1 = new ClienteEmpresa(18, emp, Long.parseLong(cpf), "Pedro", 30817564);

        cacheRegistro.put(1, new RegistroChamado("Registro", new Chamado(ce1.getCodigo(), "Configuracao de Rede", "conexao", 7, tec, ce1, "Windows", "10", "cabo", "192.168.0.1"), tec));

        oos.writeObject(cacheRegistro);

        oos.flush();
        fos.flush();

        oos.close();
        fos.close();
    }

    @After
    public void tearDown() {
        File fileCli = new File("clientes.dat");
        fileCli.delete();
        File fileEmp = new File("tecnicos.dat");
        fileEmp.delete();
        File fileTec = new File("empresas.dat");
        fileTec.delete();
        File fileCha = new File("chamados.dat");
        fileCha.delete();
        File fileReg = new File("registroChamados.dat");
        fileReg.delete();
    }

    /**
     * Test of start method, of class ControladorPrincipal.
     */
    
    @Test
    public void testNovosArquivos() {
        controlador = new ControladorPrincipal();
        assertNotNull(controlador.getCtrTecnicos());
        assertNotNull(controlador.getCtrChamados());
        assertNotNull(controlador.getCtrClientes());
        assertNotNull(controlador.getCtrEmpresa());

    }

}
