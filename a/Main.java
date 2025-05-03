package a;

public class Main {
	public static void main(String[] args) {

		ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
		Navegador navegador = new Navegador();
		AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();


		Iphone iphone = new Iphone(reprodutorMusical, navegador, aparelhoTelefonico);
		iphone.tocar();


//		a.AparelhoTelefonico aparelhoTelefonico = new a.AparelhoTelefonico();
//		a.Navegador navegador = new a.Navegador();

//		navegador.adicionarNovaAba();

//		aparelhoTelefonico.ligar();
//		reprodutorMusical.tocar();
	}
}
