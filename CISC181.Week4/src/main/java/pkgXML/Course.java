package pkgXML;

import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


public class Course {

	private UUID CourseID;
	private String CourseName;
	
	@XmlElement
	public UUID getCourseID() {
		return CourseID;
	}
	private void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	
	public Course (String CourseName)
	{
		this.setCourseID(UUID.randomUUID());
		this.setCourseName(CourseName);
	}
}
