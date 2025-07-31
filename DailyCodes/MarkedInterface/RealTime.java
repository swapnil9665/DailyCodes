
interface CM_Letter{


}


class CM_PStud implements CM_Letter{




}

class Normal_Stud{



}


class Admission{

static  void admissionProcess(Object obj){

	if(obj instanceof CM_Letter){
	
	System.out.println("Admission Done!");
	
	
	}else{
	
	System.out.println("Take Test then decide!");
	
	
	}



}



}




class RealTime{

public static void main(String args[]){

CM_PStud cm_ps = new CM_PStud();
Normal_Stud n_s = new Normal_Stud();


Admission.admissionProcess(cm_ps);
Admission.admissionProcess(n_s);


}

}
