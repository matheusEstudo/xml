package com.lerxml.entidade;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
public class Xml {

    private String conteudoArquivo = "";

    public void AbrirArquivo(File arquivo) throws FileNotFoundException, IOException {
        try (BufferedReader lerArquivo = new BufferedReader(new FileReader(arquivo))) {
            while (lerArquivo.ready()) {
                String linha = lerArquivo.readLine();
                setConteudoArquivo(getConteudoArquivo() + "\n" + linha);
            }
        }

    }

}
