package com.example;

import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(4800.0);
        analisarCandidato(5000.0);
        analisarCandidato(4500.0);
        analisarCandidato(4900.0);
        analisarCandidato(5100.0);
        analisarCandidato(6000.0);

        String[] candiadtos = {"Clark","Stwart","Morgan","Megan","Suzan","Cristina","Matew","Glen","Josh","Mkalister","Phil"};

        for(String candidato : candiadtos){
            entrandoEmContato(candidato);
        }
    } 
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean candidatoAtendeu = false;

        do{
            candidatoAtendeu = atender();
            continuarTentando = !atender();
            if(continuarTentando)
            tentativasRealizadas++;
            else
            System.out.println("Contato realizado com sucesso");
        }
        while(continuarTentando && tentativasRealizadas < 4);
        if (candidatoAtendeu) {
            System.out.println("Conseguimos entrar em contato com o candidato " + candidato + " na tentativa " + tentativasRealizadas );
            // else
            System.out.println("Não conseguimos contato com " + candidato + " número máximo de tentativas " +  "tentivasRealizadas" );
            
        }
        
    }
    static boolean atender(){
        return new Random().nextInt(4) == 1;
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 5000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligue para o candidato. ");
        }
        else if(salarioBase == salarioPretendido){
            System.out.println("Ligue para o candidato com uma contra proposta. ");

            //else {
                System.out.println("Aguardando os demais candidatos.");
            }
        }
        static void imprimirCandidatosSelecionados(){
            String[] candidatos = {"Morgan","Megan","Stwart","Clark"};
            System.out.println("Imprimindo a lista de candidatos e informando o índice do elemento.");
        
            for(int indice = 0;indice < candidatos.length;indice++){
                System.out.println("O candidato de número" + (indice + 1) + "é o " + candidatos[indice]);
            }
            System.out.println("Forma abreviada de interação foreach");
        }
        static void selecaoDeCandidatos(){
            String[] candidatos = {"Clark","Stwart","Morgan","Megan","Suzan","Cristina","Matew","Glen","Josh","Mkalister","Phil"};
            
            int candidatosSelecionados = 0;
            int candidatosAtuais = 0;
            double salarioBase = 5000.0;
            while (candidatosSelecionados < 6 && candidatosAtuais < candidatos.length) {
                String candidato = candidatos[candidatosAtuais];
                double salarioPretendido = salarioBase;

                System.out.println("O candidato " + candidato + "solicitou este valor de salário" + salarioPretendido);
                if (salarioBase >= salarioPretendido) {
                    System.out.println("O candidato " + candidato + "foi selcionado para ocupar a vaga proposta");
                    candidatosSelecionados++;
                    
                }
            }
        }
        static void analisarCandidato1(double salarioPretendido){
            double salarioBase = 5000.0;
            if (salarioBase > salarioPretendido) {
                System.out.println("Ligue para o candidato");
            }else if(salarioBase==salarioPretendido){
                System.out.println("Ligue para o candidato como uma contra proposta");
            }else{
                System.out.println("Aguardar os demais candidatos");
            }
        }
    }
