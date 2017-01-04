package studentOrientation.ConcreteImplementations;

import studentOrientation.ActivityConcreteImplementations.DormBookOnlineGame;
import studentOrientation.ActivityConcreteImplementations.DormBookQueue;
import studentOrientation.ActivityConcreteImplementations.MandoBookStore;
import studentOrientation.ActivityConcreteImplementations.RegistrationByForm;
import studentOrientation.ActivityConcreteImplementations.RegistrationOnline;
import studentOrientation.ActivityConcreteImplementations.TourByBus;
import studentOrientation.ActivityConcreteImplementations.TourByFoot;
import studentOrientation.ActivityConcreteImplementations.UniversityBookStore;
import studentOrientation.ActivityInterfaces.BuyBookActivityInterface;
import studentOrientation.ActivityInterfaces.CourseRegistrationActivityInterface;
import studentOrientation.ActivityInterfaces.DormActivityInterface;
import studentOrientation.ActivityInterfaces.TourActivityInterface;
import studentOrientation.Interfaces.OrientationInterface;
import studentOrientation.util.ActivityOptions;

/**
 * @author Sunil & Akshay
 *
 */
public class BUStudentOrientation implements OrientationInterface {
	private ActivityOptions tourOpt=null,bookOpt = null,crsOpt = null,dormOpt = null;	
	private double totalCost = 0,totalCarbonFootPrint = 0;
	private int totalCalories=0,totalDuration=0;
	
	public BUStudentOrientation(ActivityOptions tourOptIn, ActivityOptions bookOptIn,
			ActivityOptions crsOptIn, ActivityOptions dormOptIn){
		tourOpt = tourOptIn;
		bookOpt = bookOptIn;
		crsOpt  = crsOptIn;
		dormOpt = dormOptIn; 
		
	}

	public void doCampusTour() throws Exception {
		if (!tourOpt.equals(ActivityOptions.TOUR_BY_BUS)  && !tourOpt.equals(ActivityOptions.TOUR_ON_FOOT) ){
			throw new Exception();
		}
		TourActivityInterface campusTourObj=null;
		switch(tourOpt){
			case TOUR_BY_BUS:
				campusTourObj=new TourByBus();
				break;
			case TOUR_ON_FOOT:
				campusTourObj=new TourByFoot();
				break;
			default:
				break;
		}
		if(campusTourObj!=null){
			double carbonFPCal = campusTourObj.getCalulatedCarbonFP();
			double costCal = campusTourObj.getCalulatedCost();
			int durationCal = campusTourObj.getCalulatedDuration();
			int effortCal = campusTourObj.getCalulatedEffort();
			setTotalCalculations(carbonFPCal,costCal,durationCal,effortCal);

		}
		
	}

	
	public void doCourseRegistration() throws Exception {
		 if(!crsOpt.equals(ActivityOptions.CRS_REG_COMPUTER) && !crsOpt.equals(ActivityOptions.CRS_REG_REGISTRAR)){
			throw new Exception();
		 }
		 CourseRegistrationActivityInterface courseRegObj=null;
		 switch(crsOpt){
			case CRS_REG_REGISTRAR:
				courseRegObj=new RegistrationByForm();
				break;
			case CRS_REG_COMPUTER:
				courseRegObj=new RegistrationOnline();
				break;
			default:
				break;
		}
		if(courseRegObj!=null){
			double carbonFPCal = courseRegObj.getCalulatedCarbonFP();
			double costCal = courseRegObj.getCalulatedCost();
			int durationCal = courseRegObj.getCalulatedDuration();
			int effortCal = courseRegObj.getCalulatedEffort();
			setTotalCalculations(carbonFPCal,costCal,durationCal,effortCal);
			
		}
	}

	
	public void doDormBooking() throws Exception {
		if(!dormOpt.equals(ActivityOptions.DORM_SELECT_GAME) && !dormOpt.equals(ActivityOptions.DORM_SELECT_QUEUE)){
			throw new Exception();
		}	
		DormActivityInterface dormBookObj=null;
		switch(dormOpt){
			case DORM_SELECT_GAME:
				dormBookObj=new DormBookOnlineGame();
				break;
			case DORM_SELECT_QUEUE:
				dormBookObj=new DormBookQueue();
				break;
			default:
				break;
		}
		if(dormBookObj!=null){
			double carbonFPCal = dormBookObj.getCalulatedCarbonFP();
			double costCal = dormBookObj.getCalulatedCost();
			int durationCal = dormBookObj.getCalulatedDuration();
			int effortCal = dormBookObj.getCalulatedEffort();
			setTotalCalculations(carbonFPCal,costCal,durationCal,effortCal);
			
		}
	}

	
	public void doBuyBook() throws Exception {
		 if(!bookOpt.equals(ActivityOptions.BOOKSTORE_MANDO) && !bookOpt.equals(ActivityOptions.BOOKSTORE_UNIVERSITY)){
			throw new Exception();
		 } 
		 BuyBookActivityInterface buyBookObj=null;
		 switch(bookOpt){
			case BOOKSTORE_MANDO:
				buyBookObj=new MandoBookStore();
				break;
			case BOOKSTORE_UNIVERSITY:
				buyBookObj=new UniversityBookStore();
				break;
			default:
				break;
		}
		if(buyBookObj!=null){
			double carbonFPCal = buyBookObj.getCalulatedCarbonFP();
			double costCal = buyBookObj.getCalulatedCost();
			int durationCal = buyBookObj.getCalulatedDuration();
			int effortCal = buyBookObj.getCalulatedEffort();
			setTotalCalculations(carbonFPCal,costCal,durationCal,effortCal);
			
		}
	}


	/**
	 * @param carbonFPCal  	: Estimated carbon foot print for a particular activity
	 * @param costCal		: Estimated Cost for a particular activity
	 * @param durationCal	: Estimated duration needed to complete a particular activity
	 * @param effortCal		: Estimated effort needed to complete a particular activity
	 */
	private void setTotalCalculations(double carbonFPCal, double costCal, int durationCal, int effortCal) {
		totalCarbonFootPrint+=carbonFPCal;
		totalCalories+=effortCal;
		totalCost+=costCal;
		totalDuration+=durationCal;
		
	}

	/**
	 * @param carbonFPCal  	: Estimated carbon foot print for a particular activity
	 * @param costCal		: Estimated Cost for a particular activity
	 * @param durationCal	: Estimated duration needed to complete a particular activity
	 * @param effortCal		: Estimated effort needed to complete a particular activity
	 */
	private String getFinalValues(double carbonFPCal, double costCal, int durationCal, int effortCal) {
		StringBuilder strBuilderObj=new StringBuilder();
		strBuilderObj.append("Estimates for entire orientation checklist are as follows:\n")
		.append("Total Carbon Footprint is "+carbonFPCal+" kg CO2")
		.append("\nTotal Cost is $ "+costCal)
		.append("\nTotal Duration is "+durationCal+" minutes")
		.append("\nTotal Effort is "+effortCal+" calories");
		return strBuilderObj.toString();
	}

	@Override
	public String toString() {
		return getFinalValues(totalCarbonFootPrint, totalCost, totalDuration, totalCalories);
		 
	}
	
	
	

}
