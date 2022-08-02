//Serie.java
//crear una clase serie con los atributos ,titulo,numero de temporada,genero,creador,entregado.
// mumero de temporada 3, entregado false.

//Falta el implements Entregable y el public class se cierra al final con todo dentro de esta clase
public class Serie{
    private String titulo;
    private int numeroDeTemporadas;
    private String genero;
    private String creador;
    private boolean entregado;


//indico como quiero la interaccion.

	public Serie (String titulo,int numeroDeTemporadas,String genero,String creador,boolean entregado)
	{

    this.titulo=titulo;
    this.numeroDeTemporadas=numeroDeTemporadas;
    this.genero=genero;
    this.creador=creador;
    this.entregado=entregado;
	//El public Serie que es el constructor debe cerrarse con el corchete
	}

//set and getter para todos

	public String getTitulo(){
		return.titulo;
	}
	public void setTitulo(){
		this.titulo;
	}
	public int getNumeroDeTemporadas(){
		return.numeroDeTemporadas;
	}
	public void setNumeroDetemporadas(){
		this.numeroDeTemporadas;
	}
	public String getGenero(){
		return.genero;
	}
	public void setGenero(){
		this.genero;
	}
	public String getCreador(){
		return.creador;
	}
	public void setCreador(){
		this.creador;
	}

//el main solo puede ir en la clase APP
	/*public static void main(String [] arg ){
		Serie serie1 = new serie();
		Serie serie2 = new serie();

		serie1.setTitulo(VIKING);
		serie2.setTitulo(CAPO);
		serie1.setNumeroDeTemporadas(3);
		serie2.setNumeroDeTemporadas(10);
		serie1.setGenero(HISTORIA);
		serie2.setGenero(MAFIA);
		serie1.setCreador(Jose);
		serie2.setCreador(Ricardo);

		System.out.println("el nombre de la serie es:"+serie1.getTitulo);
		System.out.println("el nombre de la segunda serie a ver es:"+serie2.getTitulo);
		System.out.println("la serie VIKING tiene un numero de serie que es:"+serie1.getNumeroDeTemporadas());
		System.out.println("la serie CAPOG tiene un numero de serie que es:"+serie2.getNumeroDeTemporadas());
		System.out.println("la serie VIKING es de genero:"+serie1.getGenero());
		System.out.println("la serie CAPO es de genero:"+serie2.getGenero());
		System.out.println("la serie VIKING tiene un escritor que es :"+serie1.getCreador());
		System.out.println("la serie CAPO es de genero:"+serie2.getGenero());

	}   */
	  public String tosString() {
        //return "Titulo:" + titulo + ", Genero:" + genero + ", Creador:" + creador + ", Num.Temp: 3" + numTemp;
        return "Información de la Serie: \n" + "\tTitulo: " + titulo + "\n" + "\tNumero de temporadas: " + numTemp + "\n"
        + "\tGenero: " + genero + "\n" + "\tCreador: " + creador;    
		}
// esto es del implements de entregable que debe implementarse por el ejercicio
    public void entregar() {
        this.entregado = true;
    
    }

    public void devolver() {
        this.entregado = false;
    }
	//Este metodo es para saber si esta entregado
    public boolean isEntregado() 
	{
		if(entregado){
            return true;
        }
        return false;
    }
	//Este metodo es para comparar un objeto con otro
    public int compareTo(Object a) 
	{
		int estado=menor;

		Serie ref=(Serie)a;
		if (numTemp>ref.getNumTemp())
		{
			estado=mayor;
        }else if(numTemp==ref.getNumTemp())
		{
			estado=igual;
        }
		return estado;
    }

}