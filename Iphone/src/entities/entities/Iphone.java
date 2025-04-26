package entities.entities;

import entities.interfaces.AparelhoTelefonico;
import entities.interfaces.NavegandoNaInternet;
import entities.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegandoNaInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando música no iPhone...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no iPhone...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando nova aba no navegador...");
    }

    @Override
    public void atualizarAba() {
        System.out.println("Atualizando a aba atual...");
    }

    @Override
    public void ligar() {
        System.out.println("Realizando uma ligação...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
