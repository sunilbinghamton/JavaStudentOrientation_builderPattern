package studentOrientation.ActivityConcreteImplementations;

import studentOrientation.ActivityInterfaces.CourseRegistrationActivityInterface;
import studentOrientation.util.BaseCostForActivities;
import studentOrientation.util.EstimatesForActivites;

public class RegistrationByForm extends BaseCostForActivities implements CourseRegistrationActivityInterface {

	/**
	 * @return carbonFPForm : returns an estimated carbon foot print for registration by form
	 */
	public double getCalulatedCarbonFP() {
		double carbonFPForm = EstimatesForActivites.regForm.getCarbonFP();
		return carbonFPForm;
	}

	/**
	 * @return  courseCost : returns the calculated cost for registration by form
	 */
	public double getCalulatedCost() {
		double courseCost = getBaseCostPriceCourse() - (0.03 * getBaseCostPriceCourse());
		return courseCost;
	}

	/**
	 * @return  courseRegDur : returns an estimated duration for registration by form
	 */
	public int getCalulatedDuration() {
		int courseRegDur = EstimatesForActivites.regForm.getDuration();
		return courseRegDur;
	}

	/**
	 * @return courseRegCalories : returns an estimated Effort in calories spent for registration by form
	 */
	public int getCalulatedEffort() {
		int courseRegCalories = EstimatesForActivites.regForm.getEffort();
		return courseRegCalories;
	}

	@Override
	public String toString() {
		return "RegistrationByForm [getCalulatedCarbonFP()=" + getCalulatedCarbonFP() + ", getCalulatedCost()="
				+ getCalulatedCost() + ", getCalulatedDuration()=" + getCalulatedDuration() + ", getCalulatedEffort()="
				+ getCalulatedEffort() + "]";
	}

	

}
