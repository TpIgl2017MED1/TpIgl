package Test;

import static org.junit.Assert.*;

import org.junit.Test;
import APP2.VectException;
import APP2.VectorHelper;

public class VectExceptionTest {

	 
	@Test
	public  void VectExceptionTest () 
	/*Test du constructeur de la classe LenghtNotEqualException*/
	{
	try
	{
	VectorHelper a = new VectorHelper();
	int[] table1 = {1,2,8,10,7};
	int[] table2 = {1,2};
	a.sommerV(table1, table2);
	
	
	}
	catch(VectException e)
	{
	assert(e.getMessage().contains("Vecteurs de tailles différentes"));
	}
	}

}
	
	

	


