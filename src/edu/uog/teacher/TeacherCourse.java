package edu.uog.teacher;

import edu.uog.course.Course;

public class TeacherCourse {
	
	public static String csvFile="D:\\Hamza 4th semester\\TeacherCourse.csv";
	
    private int TEACHERCOURSE_ID;
	
	private Course	COURSE_ID;
	
	private  Teacher TEACHER_ID;
		
	private String SECTION;

	public int getTEACHERCOURSE_ID() {
		return TEACHERCOURSE_ID;
	}

	public void setTEACHERCOURSE_ID(int tEACHERCOURSE_ID) {
		TEACHERCOURSE_ID = tEACHERCOURSE_ID;
	}

	public Course getCOURSE_ID() {
		return COURSE_ID;
	}

	public void setCOURSE_ID(Course cOURSE_ID) {
		COURSE_ID = cOURSE_ID;
	}

	public Teacher getTEACHER() {
		return TEACHER;
	}

	public void setTEACHER(Teacher tEACHER) {
		Teacher = tEACHER;
	}

	public String getSECTION() {
		return SECTION;
	}

	public void setSECTION(String sECTION) {
		SECTION = sECTION;
	}
	
	public String toString() {
		
		String str=null;
		str=this.TEACHERCOURSE_ID
				+ "," + this.COURSE_ID.getCOURSE_ID()
				+ "," + this.TEACHER_ID.getPERSON_ID()
				+ "," + this.SECTION;
				
		
		return str;
	}



}
