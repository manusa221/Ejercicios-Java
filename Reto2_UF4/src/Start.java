
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("****************************************************");
		System.out.println("******************UF4 RETO 2************************");
		System.out.println("****************************************************");
		System.out.println(" ");
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		p1.setNombre("Jose");
		p1.setEdad(36);
		p1.setDni("45696852L");
		p1.setSexo("H");
		p1.setPeso(85);
		p1.setAltura(180);
		p1.setNumeroDeLibroDeFamilia(45895);
		p1.setDireccion("C/Bailen nº 25 3º 1º");
		p1.setPoblacion("Sant Cugat del valles");
		p1.setProvincia("Barcelona");
		p1.print();
		p1.imc();
		System.out.println(" ");
		
		p2.setNombre("Maria");
		p2.setEdad(34);
		p2.setDni("58096852S");
		p2.setSexo("M");
		p2.setPeso(60);
		p2.setAltura(170);
		p2.setNumeroDeLibroDeFamilia(45895);
		p2.setDireccion("C/Bailen nº 25 3º 1º");
		p2.setPoblacion("Sant Cugat del valles");
		p2.setProvincia("Barcelona");
		p2.print();
		p2.imc();
		

	}

}
