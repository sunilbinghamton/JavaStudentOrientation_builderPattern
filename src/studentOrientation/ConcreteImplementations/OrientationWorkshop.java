package studentOrientation.ConcreteImplementations;

import studentOrientation.Interfaces.OrientationInterface;
import studentOrientation.Interfaces.WorkshopInterface;

/**
 * @author Sunil and Akshay
 *
 */
public class OrientationWorkshop implements WorkshopInterface {
	


	public void construct(OrientationInterface orientationObj) {
		try {
			orientationObj.doCampusTour();
			orientationObj.doBuyBook();
			orientationObj.doCourseRegistration();
			orientationObj.doDormBooking();
		} catch (Exception e) {
			System.out.println("Wrong order of input.\nCorrect order is Campus Tour, Buy Books, Select Dorm and Course Registration.");
			System.exit(-1);
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "OrientationWorkshop [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
