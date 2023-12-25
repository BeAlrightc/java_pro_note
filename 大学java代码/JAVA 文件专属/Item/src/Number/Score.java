package Number;

public class Score {
		private double phipoint;
		private double mathpoint;
		private double englispoint;
		public Score(double phipoint, double mathpoint, double englispoint) {
			super();
			this.phipoint = phipoint;
			this.mathpoint = mathpoint;
			this.englispoint = englispoint;
		}
		public Score() {
			
		}
		public double getPhipoint() {
			return phipoint;
		}
		public void setPhipoint(double phipoint) {
			this.phipoint = phipoint;
		}
		public double getMathpoint() {
			return mathpoint;
		}
		public void setMathpoint(double mathpoint) {
			this.mathpoint = mathpoint;
		}
		public double getEnglispoint() {
			return englispoint;
		}
		public void setEnglispoint(double englispoint) {
			this.englispoint = englispoint;
		}
		public void display() {
			System.out.println(+phipoint);
			System.out.println(+mathpoint);
			System.out.println(+englispoint);
			
		}
		public double getAverage() {
			return (phipoint+mathpoint+englispoint)/3;
		}
		public void printAverage() {
			System.out.println("三科平均成绩为"+getAverage());
		}
		

	
}
