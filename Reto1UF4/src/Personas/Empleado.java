package Personas;

import java.util.Scanner;

public class Empleado {//atributos

	protected String nombre;
	protected String apellidos;
	protected String dni;
	protected float salario;
	protected int edad;
	
	public Empleado() 
	{
		
		this.nombre="Luis";
		this.apellidos="Lopez Gomez ";
		this.dni= "4747464L";
		this.salario=1200.0f;
		this.edad=23;	
	
	}
	
	
	
	public  Empleado(String n, String a, String d, float s, int e ) {
		
		this.nombre=n;
		this.apellidos=a;
		this.dni=d;
		this.salario=0.0f;
		this.edad=0;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void print() {
		
		System.out.println(this.nombre + " - " + this.apellidos + " - " + this.dni + " - " + this.salario + " - " + this.edad);
	}
}
