package cn.xmcu.test;

public class Score {
	private int phiPoint;
	private int mathPoint;
	private int englishPoint;
	
	public Score() {}
	public Score(int phiPoint,int mathPoint,int englishPoint) {
		this.phiPoint =phiPoint;
		this.mathPoint =mathPoint;
		this.englishPoint =englishPoint;
	}
	public int getPhiPoint() {
		return phiPoint;
	}
	public void setPhiPoint(int phiPoint) {
		this.phiPoint = phiPoint;
	}
	public int getMathPoint() {
		return mathPoint;
	}
	public void setMathPoint(int mathPoint) {
		this.mathPoint = mathPoint;
	}
	public int getEnglishPoint() {
		return englishPoint;
	}
	public void setEnglishPoint(int englishPoint) {
		this.englishPoint = englishPoint;
	}
	public void display() {
		System.out.println("物理"+phiPoint);
		System.out.println("数学"+mathPoint);
		System.out.println("物理"+englishPoint);
	}
	
	public int getAverage() {
		return (phiPoint+mathPoint+englishPoint)/3;
	}
	public void printAverage() {
		System.out.println("平均成绩："+getAverage());
	}
	
	
}
