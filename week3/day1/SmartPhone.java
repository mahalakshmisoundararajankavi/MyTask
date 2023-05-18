package week3.day1;

public class SmartPhone extends AndroidPhone {
     @Override
    public void takeVideo(String videoName) {
    	// TODO Auto-generated method stub
    //	super.takeVideo(videoName);
    }
	
	public static void main(String[] args) {
		SmartPhone s = new SmartPhone();
		s.takeVideo("video");
		AndroidPhone a = new AndroidPhone();
		a.takeVideo("Videos");
	}

}
