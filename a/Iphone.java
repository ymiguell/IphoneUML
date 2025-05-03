package a;

public class Iphone {
	
	public ReprodutorMusical reprodutorMusical;
	public Navegador navegador;
	public AparelhoTelefonico aparelhoTelefonico;
	
	public Iphone(ReprodutorMusical reprodutorMusical, Navegador navegador, AparelhoTelefonico aparelhoTelefonico) {
		this.reprodutorMusical = reprodutorMusical;
		this.navegador = navegador;
		this.aparelhoTelefonico = aparelhoTelefonico;
	}
	public void tocar() {
		this.reprodutorMusical.tocar();
	}
}
