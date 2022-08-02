public class VideoJuego {
	// vamos a crear una clase llamada "video juego " atributos son título, horas estimadas,
	// entregado, género y compañía.
	// titulo (string),horas estimadas(int"10hr"),entregado(boolean),genero(string),compañia(string).

	//VARIABLES DE LA CLASE 
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compañia;
	private string serie;

	 // este corchete se cierra al final }

	public VideoJuego(String titulo,int horasEstimadas,boolean entregado,String genero,String compañia,
	int serie);

	this.titulo = titulo;
	this.horasEstimadas = horasEstimadas;
	this.entregado = entregado;
	this.genero = genero;
	this.compañia = compañia;
	this.entregado = false;
	this.serie=serie;

	// creamos los metodos set and get !!

	public String getTitulo() {
		return titulo;

	}

	public void setTitulo(String Titulo) {
	this.titulo=titulo;

	}

	public String getHorasEstimadas(){
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas;
	}

	public String getEntregado(){
		return.entregado;
	}

	public void setEntregado(boolean entregado){
		this.entregado;

	}

	public String getGenero(){
		return.genero;

	}

	public void setGenero( String genero){
		this.Genero;

	}

	public String getCompañia(){
		return.compañia;

	}

	public void setCompañia( String compañia){
		this.compañia;
	 
	public int get(int serie){
		this.serie;

	}

	public void set(int serie){
		return.serie;
		
	}
 }