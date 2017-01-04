package studentOrientation.ActivityConcreteImplementations;

import studentOrientation.ActivityInterfaces.TourActivityInterface;
import studentOrientation.util.EstimatesForActivites;

public class TourByFoot implements TourActivityInterface {

	/**
	 * @return carbonFPFootTour : returns an estimated carbon foot print for Campus Tour on foot
	 */
	public double getCalulatedCarbonFP() {
		double carbonFPFootTour = EstimatesForActivites.tourFoot.getCarbonFP();
		return carbonFPFootTour;
	}

	/**
	 * @return  tourCost : returns the calculated cost for  Campus Tour on foot
	 */
	public double getCalulatedCost() {
		double tourCost = EstimatesForActivites.tourFoot.getCost();
		return tourCost;
	}

	/**
	 * @return  footTourDur : returns an estimated duration for Campus Tour by foot
	 */
	public int getCalulatedDuration() {
		int footTourDur = EstimatesForActivites.tourFoot.getDuration();
		return footTourDur;
	}

	/**
	 * @return footTourCalories : returns an estimated Effort in calories spent for  Campus Tour on foot
	 */
	public int getCalulatedEffort() {
		int footTourCalories = EstimatesForActivites.tourFoot.getEffort();
		return footTourCalories;
	}

	@Override
	public String toString() {
		return "TourByFoot [getCalulatedCarbonFP()=" + getCalulatedCarbonFP() + ", getCalulatedCost()="
				+ getCalulatedCost() + ", getCalulatedDuration()=" + getCalulatedDuration() + ", getCalulatedEffort()="
				+ getCalulatedEffort() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
