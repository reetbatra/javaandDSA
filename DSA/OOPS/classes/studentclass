package classesAndObjects;

public class studentclass {
        public String name;//final data members can be initialized as soon as they are declared 
         private final int rollNumber;
         
         static int numStudents;
         
         
//         public studentclass() {
//        	 rollNumber= 100;
//         }
//         
//         public studentclass(String n) {
//        	 name=n;
//        	 rollNumber= 100;
//        	 
//         }
          public studentclass(String name, int rollNumber) {
           // name=name;//local viariable or data member??
           // rollNumber=rollNumber;//same confusion
            //this will refer to local variable
            //how will u access data member(which has same name as local variablr)
            //by using "this"
        	  System.out.println(this);
        	  this.name= name;
        	  this.rollNumber= rollNumber;
        	  numStudents++;
       	  
} 
          
//          public void setRollnumber(int rn) {
//        	  if(rn<=0) {
//        		  return;
//        	  } 
//        	  rollNumber = rn;
//          }
          public int getRollNumber() {
        	  return rollNumber;
          }
          public void print() {
        	  System.out.println(name + " : " + rollNumber);
          }
}
