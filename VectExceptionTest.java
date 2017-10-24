package Test;

import static org.junit.Assert.*;

import org.junit.Test;
import APP2.VectException;
import APP2.VectorHelper;

public class VectExceptionTest {


	@Test
	public  void VectExceptionTest () 

	{
	try
	{
	VectorHelper a = new VectorHelper();

	int[] table1 = {9,8};


	int[] table2 = {1,2};
	a.sommerV(table1, table2);
	
	
	}
	catch(VectException e)
	{
	assert(e.getMessage().contains("Vecteurs de tailles différentes"));
	}
	}

}
	
	

	


