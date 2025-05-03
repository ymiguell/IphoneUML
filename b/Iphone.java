package b;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, Navegador {

	public void ligar() {
		System.out.println("APP: TELEFONE, INICIANDO CHAMADA...");
	}

	public void atender() {
		System.out.println("APP: TELEFONE, ATENDENDO CHAMADA...");
	}

	public void iniciarCorreioDeVoz() {
		System.out.println("APP: TELEFONE, SELECIONANDO CORREIO DE VOZ	...");
	}

	public void tocar() {
		System.out.println("APP: SPOTIFY, TOCANDO MUSICA...");
	}

	public void pausar() {
		System.out.println("APP: SPOTIFY, PAUSANDO MUSICA...");
	}

	public void selecionarMusica() {
		System.out.println("APP: SPOTIFY, SELECIONANDO MUSICA...");
	}
	public void exibirPagina() {
		System.out.println("APP: GOOGLE, EXBINDO PAGINA DO NAVEGADOR...");
	}

	public void	adicionarNovaAba() {
		System.out.println("APP: GOOGLE, ABRINDO NOVA ABA...");
	}

	public void	atualizarPagina() {
		System.out.println("APP: GOOGLE, ATUALIZANDO A PAGINA...");
	}



}
