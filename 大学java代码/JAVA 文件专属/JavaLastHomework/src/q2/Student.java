package q2;

public class Student {
   private int StuId;
   private String name;
		public Student(int stuId, String name) {
			
			StuId = stuId;
			this.name = name;
		}
		
		public Student() {
			
		}

		public int getStuId() {
			return StuId;
		}
		public void setStuId(int stuId) {
			StuId = stuId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public void display() {
		System.out.println("学号："+StuId+"\n"+"姓名："+name);	
		}

  
}
