package calc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class HonorarberechnungTest {

	@Test
	void testHonorarberechnungTest() {
		PictureCalculator pCalc = new PictureCalculator();
		Honorarberechnung hb = new Honorarberechnung(pCalc);
		double honorar = hb.calcTextHonorar("Hello World");
		assertEquals(honorar, 11/10);
	}
	
	@Test
	void testEmptyHonorarberechnung() {
		PictureCalculator pCalc = new PictureCalculator();
		Honorarberechnung hb = new Honorarberechnung(pCalc);
		double honorar = hb.calcTextHonorar("");
		assertEquals(honorar, 0);
	}
	
	@Test
	void testNullHonorarberechnung() {
		PictureCalculator pCalc = new PictureCalculator();
		Honorarberechnung hb = new Honorarberechnung(pCalc);
		double honorar = hb.calcTextHonorar(null);
		assertEquals(honorar, 0);
	}
	
	@Test
	void testPictureCalc() {
		PictureCalculator pCalc = new PictureCalculator();
		double count = pCalc.countPictures("Picture ... picture");
		assertEquals(count, 2);
	}
	
	@Test
	void testPictureCalcOne() {
		PictureCalculator pCalc = new PictureCalculator();
		double count = pCalc.countPictures("Picture");
		assertEquals(count, 1);
	}
	
	@Test
	void testPictureCalcEmpty() {
		PictureCalculator pCalc = new PictureCalculator();
		double count = pCalc.countPictures("");
		assertEquals(count, 0);
	}
	
	@Test
	void testPictureCalcNull() {
		PictureCalculator pCalc = new PictureCalculator();
		double count = pCalc.countPictures(null);
		assertEquals(count, 0);
	}
	
	
	@Test
	void testPictureCalcNoPics() {
		PictureCalculator pCalc = new PictureCalculator();
		double count = pCalc.countPictures("Hello World");
		assertEquals(count, 0);
	}
	
	
	@Test
	void testTotalHonorar() {
		String testString = "Picture, mehr Text ... picture";
		PictureCalculator pCalc = mock(PictureCalculator.class);
		when(pCalc.countPictures(testString)).thenReturn(2.0);
		Honorarberechnung hb = new Honorarberechnung(pCalc);
		double honorar = hb.calcTotalHonorar(testString);
		assertEquals(honorar, 5);
	}
	

}
