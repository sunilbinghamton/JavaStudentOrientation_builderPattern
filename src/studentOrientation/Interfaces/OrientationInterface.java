package studentOrientation.Interfaces;

public interface OrientationInterface {
	
	/**
	 * @throws Exception when Enum do not resemble to Campus type options
	 */
	public void doCampusTour() throws Exception;
	
	/**
	 * @throws Exception when Enum do not resemble to Course registration type options
	 */
	public void doCourseRegistration() throws Exception;
	
	/**
	 * @throws Exception when Enum do not resemble to Dorm booking type options
	 */
	public void doDormBooking() throws Exception;
	
	/**
	 * @throws Exception when Enum do not resemble to Dorm booking type options
	 */
	public void doBuyBook() throws Exception;	
	
}
