package chapter07;

public class FuelGauge {
	    private int gallons;
	    public final int MAX_GALLONS = 15;
	   
	   
	    public FuelGauge() {
	        gallons = 0;
	    }
	    public FuelGauge(int g) {
	        gallons = g;
	    }
	    public int getGallons() {
	        return gallons;
	    }
	    public void incrementGallons() {
	        if (gallons < MAX_GALLONS)
	            gallons+= 1;
	    }
	    public void decrementGallons() {
	        if (gallons >= 1)
	            gallons -= 1;
	    }
	   
	   
	}
