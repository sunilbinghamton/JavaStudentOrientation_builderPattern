package studentOrientation.ActivityConcreteImplementations;

import studentOrientation.ActivityInterfaces.DormActivityInterface;
import studentOrientation.util.BaseCostForActivities;
import studentOrientation.util.EstimatesForActivites;

/**
 * @author Sunil and Akshay
 *
 */
public class DormBookQueue extends BaseCostForActivities implements DormActivityInterface {

	/**
	 * @return carbonFPDorm : returns an estimated carbon foot print for Queue based Dorm booking
	 */
	public double getCalulatedCarbonFP() {
		double carbonFPDorm= EstimatesForActivites.dormQueue.getCarbonFP();
		return carbonFPDorm;
	}

	/**
	 * @return  dormCost : returns the calculated cost for Queue based Dorm booking
	 */
	public double getCalulatedCost() {
		double dormCost = getBaseCostPriceDorm();
		return dormCost;
	}

	/**
	 * @return  dormDur : returns an estimated duration for Queue based Dorm booking
	 */
	public int getCalulatedDuration() {
		int dormDur = EstimatesForActivites.dormQueue.getDuration();
		return dormDur;
	}

	/**
	 * @return dormCalories : returns an estimated Effort in calories spent for Queue based Dorm booking
	 */
	public int getCalulatedEffort() {
		int dormCalories = EstimatesForActivites.dormQueue.getEffort();
		return dormCalories;
	}

	@Override
	public String toString() {
		return "DormBookQueue [getCalulatedCarbonFP()=" + getCalulatedCarbonFP() + ", getCalulatedCost()="
				+ getCalulatedCost() + ", getCalulatedDuration()=" + getCalulatedDuration() + ", getCalulatedEffort()="
				+ getCalulatedEffort() + "]";
	}

	

}
