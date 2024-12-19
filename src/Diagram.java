
public class Diagram {

	public class Student {
		private int studentId;
		private String name;
		private String major;
		
		public Student() {
			
		}
		public Student(int studentId, String name, String major) {
			this.studentId = studentId;
			this.name = name;
			this.major = major;
		}
		
		
		public int getStudentId() {
			return studentId;
		}
		public String getName() {
			return name;
		}
		public String getMajor() {
			return major;
		}
		
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setMajor(String major) {
			this.major = major;
		}
	}
}
