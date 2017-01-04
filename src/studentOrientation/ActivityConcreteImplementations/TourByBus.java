package studentOrientation.ActivityConcreteImplementations;

import studentOrientation.ActivityInterfaces.TourActivityInterface;
import studentOrientation.util.EstimatesForActivites;

public class TourByBus implements TourActivityInterface {
	
	/**
	 * @return carbonFPBusTour : returns an estimated carbon foot print for Campus Tour by bus
	 */
	public double getCalulatedCarbonFP() {
		double carbonFPBusTour = EstimatesForActivites.tourBus.getCarbonFP();
		return carbonFPBusTour;
	}

	/**
	 * @return  tourCost : returns the calculated cost for  Campus Tour by bus
	 */
	public double getCalulatedCost() {
		double tourCost = EstimatesForActivites.tourBus.getCost();
		return tourCost;
	}

	/**
	 * @return  busTourDur : returns an estimated duration for Campus Tour by bus
	 */
	public int getCalulatedDuration() {
		int busTourDur = EstimatesForActivites.tourBus.getDuration();
		return busTourDur;
	}

	/**
	 * @return busTourCalories : returns an estimated Effort in calories spent for  Campus Tour by bus
	 */
	public int getCalulatedEffort() {
		int busTourCalories = EstimatesForActivites.tourBus.getEffort();
		return busTourCalories;
	}

	@Override
	public String toString() {
		return "TourByBus [getCalulatedCarbonFP()=" + getCalulatedCarbonFP() + ", getCalulatedCost()="
				+ getCalulatedCost() + ", getCalulatedDuration()=" + getCalulatedDuration() + ", getCalulatedEffort()="
				+ getCalulatedEffort() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
	

}
