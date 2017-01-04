package studentOrientation.util;

public enum EstimatesForActivites {
	dormOnline	(10.5, 150, 15, 500),
	dormQueue	(5.5, 0, 60, 1000),
	mandoBook	(20.0, 500, 20, 300),
	universityBook(20.0, 0, 10, 250),
	regForm		(25.0, 10000, 120, 2500),
	regOnline	(18.0, 0, 85, 450),
	tourBus		(2.3, 2.00, 30, 500),
	tourFoot	(5.5, 0.10, 90, 2000);
	
	
	private final double carbonFP;
    private final double cost;
    private final int duration;
    private final int effort;
    
    /**
     * @param carbobFPIn - value for carbon footprint for respective activity
     * @param costIn - value for cost estimate for respective activity
     * @param durationIn - value for duration for respective activity
     * @param effortIn - value for effort for respective activity
     */
    private EstimatesForActivites(double carbonFPIn, double costIn, int durationIn, int effortIn) {
	carbonFP = carbonFPIn;
	cost = costIn;
	duration = durationIn;
	effort = effortIn;
    }

	/**
	 * @return carbobFP - value for carbon footprint for respective activity 
	 */
	public double getCarbonFP() {
		return carbonFP;
	}

	/**
	 * @return cost - value for cost estimate for respective activity
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @return duration - value for duration for respective activity
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @return effort- value for effort for respective activity
	 */
	public int getEffort() {
		return effort;
	}

    
    
    
}
