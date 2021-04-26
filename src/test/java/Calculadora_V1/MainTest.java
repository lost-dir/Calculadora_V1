package Calculadora_V1;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MainTest {
	
	private Main main;
	
	@BeforeEach
	void setUp() {
		main = Mockito.mock(Main.class);
		//La linea de abajo impone una regla general para el método suma aunque los argumentos no tengan nada que ver con el resultado esperado
		when(main.suma(5, 5)).thenReturn(10);
		when(main.resta(5, 5)).thenReturn(0);
		when(main.multiplicacion(5, 5)).thenReturn(25);
		when(main.division(5, 5)).thenReturn("1");
	}
	
	@Test
	void sumaTest() {
		assertEquals(10, main.suma(5, 5));
	}
	
	@Test
	void restaTest() {
		assertEquals(0, main.resta(5, 5));
	}
	
	@Test
	void multiplicacionTest() {
		assertEquals(25, main.multiplicacion(5, 5));
	}
	
	@Test
	void divisionTest() {
		assertEquals("1", main.division(5, 5));
	}
}
