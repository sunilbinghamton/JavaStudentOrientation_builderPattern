package studentOrientation.ActivityConcreteImplementations;

import studentOrientation.ActivityInterfaces.DormActivityInterface;
import studentOrientation.util.BaseCostForActivities;
import studentOrientation.util.EstimatesForActivites;

public class DormBookOnlineGame extends BaseCostForActivities implements DormActivityInterface {


	/**
	 * @return carbonFPDorm : returns an estimated carbon foot print for Online game based Dorm booking
	 */
	public double getCalulatedCarbonFP() {
		double carbonFPDorm= EstimatesForActivites.dormOnline.getCarbonFP();
		return carbonFPDorm;
	}

	/**
	 * @return  dormCost : returns the calculated cost for Online game based Dorm booking
	 */
	public double getCalulatedCost() {
		double dormCost = getBaseCostPriceDorm() + (0.02 * getBaseCostPriceDorm()) ;
		return dormCost;
	}

	/**
	 * @return  dormDur : returns an estimated duration for Online game based Dorm booking
	 */
	public int getCalulatedDuration() {
		int dormDur = EstimatesForActivites.dormOnline.getDuration();
		return dormDur;
	}

	/**
	 * @return dormCalories : returns an estimated Effort in calories spent for Online game based Dorm booking
	 */
	public int getCalulatedEffort() {
		int dormCalories = EstimatesForActivites.dormOnline.getEffort();
		return dormCalories;
	}

	@Override
	public String toString() {
		return "DormBookOnlineGame [baseCostPriceCourse=" + getBaseCostPriceCourse() + ", baseCostPriceDorm="
				+ getBaseCostPriceDorm() + ", baseCostPriceBookStore=" + getBaseCostPriceBookStore() + ", getCalulatedCarbonFP()="
				+ getCalulatedCarbonFP() + ", getCalulatedCost()=" + getCalulatedCost() + ", getCalulatedDuration()="
				+ getCalulatedDuration() + ", getCalulatedEffort()=" + getCalulatedEffort() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


}
