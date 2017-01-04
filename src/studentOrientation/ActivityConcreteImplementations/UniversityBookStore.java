package studentOrientation.ActivityConcreteImplementations;

import studentOrientation.ActivityInterfaces.BuyBookActivityInterface;
import studentOrientation.util.BaseCostForActivities;
import studentOrientation.util.EstimatesForActivites;

public class UniversityBookStore extends BaseCostForActivities implements BuyBookActivityInterface {


	/**
	 * @return carbonFPUniversity : returns an estimated carbon foot print for Books from University Book Store
	 */
	public double getCalulatedCarbonFP() {
		double carbonFPUniversity = EstimatesForActivites.universityBook.getCarbonFP();
		return carbonFPUniversity;
	}

	/**
	 * @return  bookCost : returns the calculated cost for Books from University Book Store
	 */
	public double getCalulatedCost() {
		double bookCost = getBaseCostPriceBookStore() + (0.05 * getBaseCostPriceBookStore());
		return bookCost;
	}

	/**
	 * @return  bookDur : returns an estimated duration for Books from University Book Store
	 */
	public int getCalulatedDuration() {
		int bookDur = EstimatesForActivites.universityBook.getDuration();
		return bookDur;
	}

	/**
	 * @return bookCalories : returns an estimated Effort in calories spent for Books from Univesity Book Store
	 */
	public int getCalulatedEffort() {
		int bookCalories = EstimatesForActivites.universityBook.getEffort();
		return bookCalories;
	}

	@Override
	public String toString() {
		return "UniversityBookStore [getCalulatedCarbonFP()=" + getCalulatedCarbonFP() + ", getCalulatedCost()="
				+ getCalulatedCost() + ", getCalulatedDuration()=" + getCalulatedDuration() + ", getCalulatedEffort()="
				+ getCalulatedEffort() + "]";
	}

	
	
	
}
