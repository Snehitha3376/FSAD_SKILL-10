package DemOnSpring.DemOnSpringS53;

public class College {
 String cname;
 Student stud;
 College(){   //default constructor
	 
 }
 public String getCname() {
	return cname;
 }
 public void setCname(String cname) {
	this.cname = cname;
 }
 public Student getStud() {
	return stud;
 }
 public void setStud(Student stud) {
	this.stud = stud;
 }
 @Override
 public String toString() {
	return "College Name="+cname+"\n"+stud;
 }
 
}
