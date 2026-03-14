

public class Student {
        public Student(int regno, String sname) {
		super();
		this.regno = regno;
		this.sname = sname;
	}
		int regno;
        String sname;
        Student(){  //this is the default constructor=constructor with out any arguments
        	
        }
        
		public int getRegno() {
			return regno;
		}
		public void setRegno(int regno) {
			this.regno = regno;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}

		@Override
		public String toString() {
			return "Student [regno=" + regno + ", sname=" + sname + "]";
			
		}
        
}

