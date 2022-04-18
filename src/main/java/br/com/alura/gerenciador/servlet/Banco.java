package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();
    private static Integer chaveSequencial = 1;

    static {
        Empresa empresa = new Empresa();
        empresa.setId(chaveSequencial++);
        empresa.setNome("Alura");
        Empresa empresa2 = new Empresa();
        empresa2.setId(chaveSequencial++);
        empresa2.setNome("Caelum");
        lista.add(empresa);
        lista.add(empresa2);
    }

        public void adiciona(Empresa empresa) {
        empresa.setId(Banco.chaveSequencial++);
        Banco.lista.add(empresa);
    }

        
}