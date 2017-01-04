package studentOrientation.ActivityConcreteImplementations;

import studentOrientation.ActivityInterfaces.BuyBookActivityInterface;
import studentOrientation.util.BaseCostForActivities;
import studentOrientation.util.EstimatesForActivites;

public class MandoBookStore extends BaseCostForActivities implements BuyBookActivityInterface {

	/**
	 * @return carbonFPMando : returns an estimated carbon foot print for Books from Mando Book Store
	 */
	public double getCalulatedCarbonFP() {
		double carbonFPMando = EstimatesForActivites.mandoBook.getCarbonFP();
		return carbonFPMando;
	}

	/**
	 * @return  bookCost : returns the calculated cost for Books from Mando Book Store
	 */
	public double getCalulatedCost() {
		double bookCost = getBaseCostPriceBookStore();
		return bookCost;
	}

	/**
	 * @return  bookDur : returns an estimated duration for Books from Mando Book Store
	 */
	public int getCalulatedDuration() {
		int bookDur = EstimatesForActivites.mandoBook.getDuration();
		return bookDur;
	}

	/**
	 * @return bookCalories : returns an estimated Effort in calories spent for Books from Mando Book Store
	 */
	public int getCalulatedEffort() {
		int bookCalories = EstimatesForActivites.mandoBook.getEffort();
		return bookCalories;
	}

	@Override
	public String toString() {
		return "MandoBookStore [getCalulatedCarbonFP()=" + getCalulatedCarbonFP() + ", getCalulatedCost()="
				+ getCalulatedCost() + ", getCalulatedDuration()=" + getCalulatedDuration() + ", getCalulatedEffort()="
				+ getCalulatedEffort() + "]";
	}

	
	
	

}