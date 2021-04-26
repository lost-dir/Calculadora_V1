package Calculadora_V1;

public class Main {

	//declaración de un pbjeto de tipo Main que se llama main
	static Main main;

	//Método main
	public static void main(String[] args) {
		
		//Le damos valor al objeto main, es igual a una nueva instancia de la clase Main
		main = new Main();

		//Imprimimos en pantalla los método invocados a partir del objeto main
		System.out.println(main.suma(5, 5));
		System.out.println(main.resta(7, 5));
		System.out.println(main.multiplicacion(7, 5));
		System.out.println(main.division(5, 0));
	}

	//Método de suma, es de tipo público, regresa un dato de tipo Integer y recibe dos argumnetos de tipo integer(numUno y numDos)
	public int suma(int numUno, int numDos) {
		return numUno + numDos;
	}

	//Método resta, es de tipo público, regresa un dato de tipo Integer y recibe dos argumentos de tipo integer(numUno y numDos)
	public int resta(int numUno, int numDos) {
		return numUno - numDos;
	}

	//Método multiplicación, es de tipo público, regresa un dato de tipo Integer y recibe dos argumentos de tipo integer(x & y)
	public int multiplicacion(int x, int y) {
		return x * y;
	}

	//Método división,es de tipo público, regresa un dato de tipo String y recibe dos argumentos de tipo integer(x & y)
	public String division(int x, int y) {
		try {
			return Integer.toString(x / y);
		} catch (Exception e) {
			return "no se puede dividir entre cero!";
		}
	}
}
