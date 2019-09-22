package aprir2017.problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class AdminTest {

	@Mock
	Department department1;

	@Mock
	Department department2;

	Admin admin;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);

		admin = new Admin(new Department[]{department1, department2});
	}

	@Test
	void testHourlyCompanyMessage() {
		//given
		when(department1.getName()).thenReturn("Billing");
		when(department1.nextMessage()).thenReturn("Hello");
		when(department2.getName()).thenReturn("Marketing");
		when(department2.nextMessage()).thenReturn("World");

		//when
		String actualValue = admin.hourlyCompanyMessage();

		//then
		assertEquals(department1.getName() + ": " + department1.nextMessage() + "\n" +
				department2.getName() + ": " + department2.nextMessage() + "\n", actualValue);

	}
}