package com.br.zup;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, List<String>> dicionarioAnimais = new HashMap<>();
        boolean continuar = true;
        while (continuar){
            System.out.println("Digite 1 para cadastrar");
            int resposta = new Scanner(System.in).nextInt();
            if(resposta == 1){
                System.out.println("Qual zoológico você vai cadastrar?");
                String zoologico = new Scanner(System.in).nextLine();
                List<String> animais = new ArrayList<>();
                String retorno = "";

                do{
                    System.out.println("Digite o nome do animal para cadastrar ou sair para finalizar");
                    if(!retorno.equalsIgnoreCase("Sair"))
                        animais.add(retorno);

                }while (!retorno.equalsIgnoreCase("Ssir"));
                dicionarioAnimais.put(zoologico,animais);
            }
        }
    }
}
