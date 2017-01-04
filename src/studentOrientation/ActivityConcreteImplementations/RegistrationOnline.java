package studentOrientation.ActivityConcreteImplementations;

import studentOrientation.ActivityInterfaces.CourseRegistrationActivityInterface;
import studentOrientation.util.BaseCostForActivities;
import studentOrientation.util.EstimatesForActivites;

public class RegistrationOnline extends BaseCostForActivities implements CourseRegistrationActivityInterface {

	/**
	 * @return carbonFPOnline : returns an estimated carbon foot print for online registration
	 */
	public double getCalulatedCarbonFP() {
		double carbonFPOnline = EstimatesForActivites.regOnline.getCarbonFP();
		return carbonFPOnline;
	}

	/**
	 * @return  courseCost : returns the calculated cost for online registration
	 */
	public double getCalulatedCost() {
		double courseCost = getBaseCostPriceCourse() ;
		return courseCost;
	}

	/**
	 * @return  courseRegDur : returns an estimated duration for online registration
	 */
	public int getCalulatedDuration() {
		int courseRegDur = EstimatesForActivites.regOnline.getDuration();
		return courseRegDur;
	}

	/**
	 * @return courseRegCalories : returns an estimated Effort in calories spent for online registration
	 */
	public int getCalulatedEffort() {
		int courseRegCalories = EstimatesForActivites.regOnline.getEffort();
		return courseRegCalories;
	}

	@Override
	public String toString() {
		return "RegistrationOnline [getCalulatedCarbonFP()=" + getCalulatedCarbonFP() + ", getCalulatedCost()="
				+ getCalulatedCost() + ", getCalulatedDuration()=" + getCalulatedDuration() + ", getCalulatedEffort()="
				+ getCalulatedEffort() + "]";
	}

	
	
	

}
