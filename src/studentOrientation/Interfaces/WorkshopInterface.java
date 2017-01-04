package studentOrientation.Interfaces;

public interface WorkshopInterface {
	
	/**
	 * This method finally builds the orientation checklist and calculated the total
	 * estimates for the different activities involved in the orientation.
	 * 
	 * @param orObj is of type OrientationInterface which has all the orientation related 
	 * options. Its necessary to finally build the student Orientation from the choices.
	 */
	public void construct(OrientationInterface orObj);
	

}
