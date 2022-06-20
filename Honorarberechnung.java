package calc;

public class Honorarberechnung {
	
	private PictureCalculator pCalc;
	
	
	public Honorarberechnung(PictureCalculator pCalc) {
		this.pCalc = pCalc;
		
	}
	
	public double calcTextHonorar(String text) {
		if (text == null || text.length() == 0) {
			return 0;
		}
		return text.length() / 10;
	}

	
	public double calcTotalHonorar(String text) {
		double pictureCount = pCalc.countPictures(text);
		return 0.10 * pictureCount;
	}

}
