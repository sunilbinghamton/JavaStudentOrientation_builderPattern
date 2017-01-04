PURPOSE:

This java program introduces to a design pattern to develop a tool for student 
orientation program at Binghamton University. Where our tool can be used a library
by each student to write his/her Driver code for their specific orientation plan.
The tool should have the flexibility to pass just the required options for the orientation
program and the rest should be automatically generated. The expected outcomes are
total estimates of duration, cost, carbon foot print and effort required to
complete all the activities involved in an orientation program.

JUSTIFICATION TO DATA STRUCTURE:

No particular data structure used for this tool.
We used the builder design pattern to develop our tool.

PERCENT COMPLETE:

To the best of our knowledge the current implementation handles all cases. 
So its 100% complete.

PARTS THAT ARE NOT COMPLETE:
None

BUGS:

No known bugs exists.

FILES:
The following files listed below are :
/src/studentOrientation/ActivityConcreteImplementations/: Contains the following files
DormBookOnlineGame.java : concrete implementation for Dorm Book activity through Online Game.
DormBookQueue.java      : concrete implementation for Dorm Book activity by going through a queue.
MandoBookStore.java     : concrete implementation for buying Books activity at Mando Book Store.
UniversityBookStore.java: concrete implementation for buying Books activity at University Book Store.
RegistrationByForm.java : concrete implementation for course registration activity at registrar's office by submitting a form.
RegistrationOnline.java : concrete implementation for course registration activity by submitting form online.
TourByBus.java          : concrete implementation for Campus tour by bus.
TourByFoot.java         : concrete implementation for Campus tour on foot.

/src/studentOrientation/ActivityInterfaces/: These are the interfaces implemented by classes in package "ActivityConcreteImplementations"
BuyBookActivityInterface.java
CourseRegistrationActivityInterface.java
DormActivityInterface.java
TourActivityInterface.java

/src/studentOrientation/ConcreteImplementations/: Contains the following files
BUStudentOrientation.java   : This contains the different steps to build the Orientation schedule
OrientationWorkshop.java    : This contains the construct method that enforce the steps for Student Orientation.

/src/studentOrientation/driver
Driver.java     : Sample driver code to test our tool

/src/studentOrientation/EstimatesInterfaces : These are the interfaces implemented by classes in package "ActivityConcreteImplementations"
CarbonFootPrintInterface.java
CostInterface.java
DurationInterface.java
EffortInterface.java
TotalEstimatesInterface.java

/src/studentOrientation/Interfaces: contains interfaces that are implemented by classes in package " ConcreteImplementations "
OrientationInterface.java
WorkshopInterface.java

/src/studentOrientation/util : contains utility files needed by other classes
ActivityOptions.java        : contains Enums for user choices for different activities
BaseCostForActivities.java  : contains base cost for different activities
EstimatesForActivities.java : contains Enums used for calculating different Estimates

/src/build.xml --- compiles and runs the project.

SAMPLE OUTPUT:

Estimates for entire orientation checklist are as follows:
Total Carbon Footprint is 57.8 kg CO2
Total Cost is $ 10380.0
Total Duration is 175 minutes
Total Effort is 3750 calories

TO COMPILE:
Go to folder : sahu_sunil/studentOrientation/

ant compile_all

TO RUN:

ant run

EXTRA CREDIT:

N/A


BIBLIOGRAPHY:
None

ACKNOWLEDGEMENT:

None


