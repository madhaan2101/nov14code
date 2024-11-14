package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
class StudentTest {

	@Test
	void test() {
		StudentDAO dao = mock(StudentDAO.class);
		when(dao.findStudent("Peter")).thenReturn(new Student ("Peter",100));
		
		Student st = dao.findStudent("Peter");
		Student st1 = dao.findStudent("Sam");
		System.out.println(st);
		System.out.println(st1);
		verify(dao).findStudent("Peter");
	}
}
