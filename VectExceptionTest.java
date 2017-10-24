package Test;

import static org.junit.Assert.*;

import org.junit.Test;
import APP2.VectException;
import APP2.VectorHelper;

public class VectExceptionTest {

	/*@Test
	public void testVectException()*/
	/*VectExceptionTest()
	{   VectorHelper o =new VectorHelper();
		 int[]v1=new int []{1,0,3};
		   int []v2=new int [] {4,2,6};
		   try {o.sommerV(v1,v2); fail("Vecteurs de tailles différentes"); }
	catch(IllegalArgumentException aExp)
	{ assert(aExp.getMessage().contains("negative number")); } }*/
	
	/*@Test(expected= VectException.class) 
	public void myTest() throws VectException { 
	 VectorHelper obj = new VectorHelper();
	 int[]v1=new int []{1,0,3};
	   int []v2=new int [] {4,2};
	 
		obj.sommerV(v1,v2);*/
	/*@Test(expected= VectException.class) 
	public void myTest() { 
	 VectorHelper obj = new VectorHelper();
	 int[]v1=new int []{1,0,3,5};
	   int []v2=new int [] {4,2};
	 
		try {
			obj.sommerV(v1,v2);
		} catch (VectException e) {
			assert(e.getMessage().contains("Vecteurs de tailles différentes")); }
		}
	*/
	
	@Test
	public  void VectExceptionTest () 
	/*Test du constructeur de la classe LenghtNotEqualException*/
	{
	try
	{
	VectorHelper a = new VectorHelper();
	int[] table1 = {1,2,5};
	int[] table2 = {1,2};
	a.sommerV(table1, table2);
	
	
	}
	catch(VectException e)
	{
	assert(e.getMessage().contains("Vecteurs de tailles différentes"));
	}
	}

}
	
	

	


