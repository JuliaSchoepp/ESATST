package calc;

public class PictureCalculator {
	
	public double countPictures(String text) {
		if (text == null || text.length() == 0) {
			return 0;
		} 
		return text.toLowerCase().split("picture", -1).length -1;
	}
}
