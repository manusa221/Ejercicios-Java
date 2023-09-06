import java.util.Scanner;

import Personas.Empleado;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaDeDatos = new Scanner(System.in);
		
		
		
		
		
		String nombre="";
		String apellidos="";
		String dni="";
		float salario=0.0f;
		int edad=0;
		System.out.println("****************************************************");
		System.out.println("******************UF4 RETO 1************************");
		System.out.println("****************************************************");
		
		
		Empleado empl1=new Empleado();
		System.out.print("Introduce el nombre: ");
		nombre=entradaDeDatos.nextLine();
		empl1.setNombre(nombre);
		System.out.print("Introduce los apellidos: ");
		apellidos=entradaDeDatos.nextLine();
		empl1.setApellidos(apellidos);
		System.out.print("Introduce el DNI: ");
		dni=entradaDeDatos.nextLine();
		empl1.setDni(dni);
		System.out.print("Introduce el Salario: ");
		salario=entradaDeDatos.nextFloat();
		empl1.setSalario(salario);
		System.out.print("Introduce la edad: ");
		edad=entradaDeDatos.nextInt();
		empl1.setEdad(edad);
		System.out.println(" ");
		
		
		
		System.out.println("Nombre:" + empl1.getNombre());
		System.out.println("Apellidos:" +empl1.getApellidos());
		System.out.println("DNI:" + empl1.getDni());
		System.out.println("Salario:" + empl1.getSalario());
		System.out.println("Edad:" + empl1.getEdad());
		empl1.print();
	}

}
