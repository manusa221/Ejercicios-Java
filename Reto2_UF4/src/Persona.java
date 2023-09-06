
public class Persona extends Familia {//atributos

	protected String nombre;
	protected int edad;
	protected String dni;
	protected String sexo;
	protected float peso;
	protected float altura;
	
public Persona() {//constructor
	
	this.nombre="";
	this.edad=0;
	this.dni="";
	this.sexo="";
	this.peso=0.0f;
	this.altura=0.0f;
}
	
	public Persona(String n, int e, String d, String s, float p, float a) {
		
		this.nombre=n;
		this.edad=e;
		this.dni=d;
		this.sexo=s;
		this.peso=p;
		this.altura=a;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void print () {
		System.out.println("*************Datos personales:****************");
		System.out.println("Nombre: " + this.nombre);  
		System.out.println("Edad: " +  this.edad);   
		System.out.println("DNI: " + this.dni);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Peso: " + this.peso);
		System.out.println("Altura: " + this.altura);
		System.out.println("Num Libro Familia: " + getNumeroDeLibroDeFamilia());
		System.out.println("Dirección: " + getDireccion());
		System.out.println("Población: " + getPoblacion());
		System.out.println("Provincia: " + getProvincia());
	}

	@Override
	public void imc() {
		// TODO Auto-generated method stub
		float imc= peso / altura * altura;
		System.out.println("*************IMC:****************");
		System.out.println("IMC: " + imc);
		
	}

}
