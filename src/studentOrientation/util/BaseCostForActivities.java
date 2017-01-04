package studentOrientation.util;

public class BaseCostForActivities {
	public final int baseCostPriceCourse = (int) EstimatesForActivites.regForm.getCost();//10000;
	public final int baseCostPriceDorm = (int) EstimatesForActivites.dormOnline.getCost();//150;
	public final int baseCostPriceBookStore = (int) EstimatesForActivites.mandoBook.getCost();//500;
	
	
	
	/**
	 * @return baseCostPriceCourse : A Base price for Course registration. 
	 * This value can be used by other classes to calculate their specific estimates
	 */
	public int getBaseCostPriceCourse() {
		return baseCostPriceCourse;
	}



	/**
	 * @return baseCostPriceDorm : A Base price for Dorm booking
	 * This value can be used by other classes to calculate their specific estimates
	 */
	public int getBaseCostPriceDorm() {
		return baseCostPriceDorm;
	}



	/**
	 * @return baseCostPriceBookStore : A Base price for Books
	 *  This value can be used by other classes to calculate their specific estimates
	 */
	public int getBaseCostPriceBookStore() {
		return baseCostPriceBookStore;
	}



	@Override
	public String toString() {
		return "BaseCostForActivities [baseCostPriceCourse=" + baseCostPriceCourse + ", baseCostPriceDorm="
				+ baseCostPriceDorm + ", baseCostPriceBookStore=" + baseCostPriceBookStore + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
