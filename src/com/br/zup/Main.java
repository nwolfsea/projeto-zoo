package com.br.zup;

import java.util.*;


public class Main {
    public static Scanner criarScanner() {
        return new Scanner(System.in);}

    public static List<String> criarListaDeAnimais(){
        List<String> animais = new ArrayList<>();
        String retorno = "";
        do{
            System.out.println("Digite o nome do animal para cadastrar ou sair para finalizar");
            retorno = criarScanner().nextLine();
            if(!retorno.equalsIgnoreCase("sair")){
                animais.add(retorno);
            }
        }while (!retorno.equalsIgnoreCase("sair"));
        return animais;
    }



    public static void main (String[] args){

            Map<String, List<String>> dicionarioAnimais = new HashMap<>();
            boolean continuar = true;
            while (continuar) {
                System.out.println("Digite \n 1 para cadastrar \n 2 para pesquisar");
                int resposta = new Scanner(System.in).nextInt();
                if (resposta == 1) {
                    System.out.println("Qual zoológico você vai cadastrar?");
                    String zoologico = new Scanner(System.in).nextLine();
                    List<String> animais = criarListaDeAnimais();
                    dicionarioAnimais.put(zoologico, animais);
                }
            }
        }
    }