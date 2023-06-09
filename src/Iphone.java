import interfaces.Navegador;
import interfaces.Reprodutor;
import interfaces.Telefonico;

public class Iphone implements Navegador, Reprodutor, Telefonico {

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música em pausa!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada!");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendendida!");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }
}