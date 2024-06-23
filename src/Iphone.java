

import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    //Implementação dos métodos de ReprodutorMusical.
    public void tocar(){
        System.out.println("Reproduzindo música.");
    }

    public void pausar(){
        System.out.println("Pausando música.");
    }

    public void selecionarMusica(String musica){
        
    }

    //Implementação dos métodos de AparelhoTelefonico.
    public void ligar(String numero){
        System.out.println("Ligando.");
    }
    public void atender(){
        System.out.println("Atendendo.");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz.");
    }

    //Implementação dos métodos de NavegadorInternet.
    public void exibirPagina(String url){
        System.out.println("Exibindo página.");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba.");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página.");
    }

}

