package pkgXML;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class CMain {

	public static void main(String[] args) {

		CreateStudentInstance();

	}

	private static void CreateStudentInstance() {
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Student stu = new Student("Bert", "Randall", "Gibbons", dBirthDate, "MIS", "214 Labrador Lane", "302-893-6889",
				"bgibbons@udel.edu" );

		Course c1 = new Course("CISC 181");
		stu.AddCourse(c1);
		Course c2 = new Course("CISC 260");
		stu.AddCourse(c2);
		
		/*
		stu.PrintName();
		stu.PrintName(true);

		System.out.print("Is stu a instance of Person class? ");
		System.out.println(stu instanceof Person);
		System.out.print("Is stu a instance of Student class? ");
		System.out.println(stu instanceof Student);
	*/
		
		try
		{
			JAXBContext context = JAXBContext.newInstance(Student.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(stu, System.out);
		}
		catch (Exception ex)
		{
			System.out.println(ex.toString());
			
		}


	}

}
