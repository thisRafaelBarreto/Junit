package Classes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculoTest {

	@Test
	void testExecutaSoma()
	{
		float valor1 = 10;
		float valor2 = 10;
		float retornoEsperado = 20;
		
		Calculo c = new Calculo();
		
		float retorno = c.soma(valor1, valor2);
		
		assertEquals(retornoEsperado, retorno);
	}
	
	@Test
	void testExecutaSubtracao()
	{
		float valor1 = 30;
		float valor2 = 10;
		float retornoEsperado = 20;
		
		Calculo c = new Calculo();
		
		float retorno = c.subtracao(valor1, valor2);
		
		assertEquals(retornoEsperado, retorno);
	}
}
