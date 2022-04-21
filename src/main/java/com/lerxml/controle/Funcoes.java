package com.lerxml.controle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Funcoes {

    public static boolean validarStr(String texto) {
        return texto.length() >= 3;
    }
    
    public static  void pegarValor(String textoInicial, String argumentoInicial,
            String argumentoFinal){
        
        
        
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String textoArquivo = "";
        String arqumentoInicio = "<port>";
        String arqumentoFinal = "</port>";

        try (BufferedReader lerArquivo = new BufferedReader(new FileReader("C:\\Users\\matheus.batista1\\Documents\\NetBeansProjects\\lerXML\\src\\main\\java\\com\\lerxml\\controle\\SEP64A0E71553A0.cnf.xml"))) {
            while (lerArquivo.ready()) {
                String linha = lerArquivo.readLine();
                textoArquivo += "\n" + linha;
            }

            //System.out.println(textoArquivo);
            int indexInicioTexto = textoArquivo.indexOf("<proxy>");
            int indexFinalTexto = textoArquivo.indexOf("<autoAnswer>");

            String textoCortado = textoArquivo.substring(indexInicioTexto, indexFinalTexto);

            int indexInicio = textoCortado.indexOf(arqumentoInicio);
            int indexFinal = textoCortado.indexOf(arqumentoFinal);

            String parteTexto = textoCortado.substring(indexInicio, indexFinal + arqumentoFinal.length());
            System.out.println(parteTexto);
            int indexValorInicio = parteTexto.indexOf(arqumentoInicio);
            int indexValorFinal = parteTexto.indexOf(arqumentoFinal);
            String valorTexto = parteTexto.substring(indexValorInicio + arqumentoInicio.length(), indexValorFinal);
            System.out.println(valorTexto);

        }
    }

}
