package entities;

import java.util.Random;

public class Computer {
   public Escolha gerarEscolhaComputador() {
       Random random = new Random();
       int numeroAleatorio = random.nextInt(3) + 1;
       
       switch (numeroAleatorio) {
           case 1:
               Escolha pedra = new Escolha();
               pedra.setValor(1);
               pedra.setDescricao("Pedra");
               pedra.setImagem("/Imagens/mao.png");
               return pedra;
           case 2:
               Escolha papel = new Escolha();
               papel.setValor(2);
               papel.setDescricao("Papel");
               papel.setImagem("/Imagens/papel.png");
               return papel;
           case 3:
               Escolha tesoura = new Escolha();
               tesoura.setValor(3);
               tesoura.setDescricao("Tesoura");
               tesoura.setImagem("/Imagens/tesoura.png");
               return tesoura;
       }
       return null;
   }
}
