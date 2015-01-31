class Objeto
{
	int atributo;
	void funcion()
	{
		System.out.print("Esta es una funcion");
	}
}


public class ClaseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hola Mundo");
		
		//Instancia de variable
		Objeto obj=new Objeto();
		
		obj.atributo=10;
		System.out.println(obj.atributo);
		
		//Llamando a funcion
		obj.funcion();
		
		//Arreglos
		int arreglo []=new int[3];
		


	}

}
