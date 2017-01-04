package studentOrientation.driver;

import studentOrientation.ConcreteImplementations.BUStudentOrientation;
import studentOrientation.ConcreteImplementations.OrientationWorkshop;
import studentOrientation.Interfaces.OrientationInterface;
import studentOrientation.Interfaces.WorkshopInterface;
import studentOrientation.util.ActivityOptions;

/**
 * @author Sunil and Akshay
 *
 */
class Driver {
	
	/**
	 * @param args : None to given in this assignment as change is needed in the Driver Class itself
	 */
	public static void main(String args[]){

		OrientationInterface buOrient = new BUStudentOrientation(	ActivityOptions.TOUR_BY_BUS, 
																	ActivityOptions.BOOKSTORE_UNIVERSITY,
																	ActivityOptions.CRS_REG_REGISTRAR,
																	ActivityOptions.DORM_SELECT_GAME );
		WorkshopInterface orientWork = new OrientationWorkshop();
		orientWork.construct(buOrient);
		System.out.println(buOrient);
	}


}
