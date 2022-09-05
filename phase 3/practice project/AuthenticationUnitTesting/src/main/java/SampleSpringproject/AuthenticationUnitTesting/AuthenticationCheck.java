package SampleSpringproject.AuthenticationUnitTesting;

public class AuthenticationCheck 
{
	public String authenticator(String username,String password)
	{
		if(username.equals("tom"))
			{
				if(password.equals("jerry"))
				{
					return "Login Successful";
				}else
				{
					return "Wrong Password";
				}
			}
		else
			
		{
			return "Invalid username";
		}
		
		
		
	}
}
