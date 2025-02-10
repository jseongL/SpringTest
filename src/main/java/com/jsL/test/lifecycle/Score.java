package com.jsL.test.lifecycle;

public class Score {
	
	private int korean;
	private int math;
	private int english;
	
	public Score(int korean, int math, int english) {
		this.korean = korean;
		this.math = math;
		this.english = english;
	}
	
	@Override
	public String toString() {
		return "국어 : " + korean + " 수학 : " + math + " 영어 : " + english;
	}
	
	public int getKorean(){
		return korean;
	}
	public int getMath(){
		return math;
	}
	public int getEnglish(){
		return english;
	}
	

}
