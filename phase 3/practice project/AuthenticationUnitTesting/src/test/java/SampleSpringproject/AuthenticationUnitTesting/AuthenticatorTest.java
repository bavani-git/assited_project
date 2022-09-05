package SampleSpringproject.AuthenticationUnitTesting;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



public class AuthenticatorTest {

	static AuthenticationCheck ac;
	@BeforeClass
	public static void before() {
		ac=new AuthenticationCheck();
	 
		System.out.println("object is Inizialized");
	}

	@Test
	public void LoginSuccess() 
	{
		assertEquals("Login Successful", ac.authenticator("tom","jerry"));
		System.out.println("LoginSuccess Testcase");
	}

	@Test
	
	  public void UserNameCheck1() { assertEquals("Invalid username", ac.authenticator("TOm","jerry"));
	  System.out.println("Username Testcase1"); }
	@Test
	
	  public void UserNameCheck2() { assertEquals("Invalid username", ac.authenticator("3893893","jerry"));
	  System.out.println("Username Testcase2"); }
	@Test
	
	  public void UserNameCheck3() { assertEquals("Invalid username", ac.authenticator("","jerry"));
	  System.out.println("Username Testcase3"); }
	@Test
	
	  public void UserNameCheck4() { assertEquals("Invalid username", ac.authenticator("+-/.?;'","jerry"));
	  System.out.println("Username Testcase4"); }
	@Test
	
	  public void UserNameCheck5() { assertEquals("Invalid username", ac.authenticator("Tom ","jerry"));
	  System.out.println("Username Testcase5"); }
	@Test
	
	  public void PasswordCheck1() { assertEquals("Wrong Password", ac.authenticator("tom","tom"));
	  System.out.println("Password Testcase1"); }
	@Test
	
	  public void PasswordCheck2() { assertEquals("Wrong Password", ac.authenticator("tom","Jerry"));
	  System.out.println("Password Testcase2"); }
	@Test
	
	  public void PasswordCheck3() { assertEquals("Wrong Password", ac.authenticator("tom","?+-<><q`"));
	  System.out.println("Password Testcase3"); }
	@Test
	
	  public void PasswordCheck4() { assertEquals("Wrong Password", ac.authenticator("tom",""));
	  System.out.println("Password Testcase4"); }
	@Test
	
	  public void PasswordCheck5() { assertEquals("Wrong Password", ac.authenticator("tom","jeery"));
	  System.out.println("Password Testcase5"); }
	 
	@AfterClass
	public static   void after() 
	{
		ac=null;
		System.out.println("object is destroyed");
	}

}
