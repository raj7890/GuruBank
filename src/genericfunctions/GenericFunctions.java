package genericfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenericFunctions {
	//******************************************************************************
	//function name 	: fnsetvalue
	//parameters		:driver,object properties,string
	//return value		:boolean value
	//written by		:Raju
	//modify by			:
	//***************************************************************************************
	public boolean fnsetvalue(WebDriver driver,By objproperties,String StrVal)
	{
		boolean bflag;
		try{
			driver.findElement(objproperties).sendKeys(StrVal);
			String txtVal = driver.findElement(objproperties).getAttribute("Value");
			if (StrVal.equalsIgnoreCase(txtVal))
			{
				bflag = true;
			}else{
			    bflag = false;
			}
			}catch(Exception e)
				{
					System.out.println(e);
				}
				if(bflag = true)
				{
					return true;
			    }else
			    {
			    	return true;
			    }
	    }
	//******************************************************************************
		//function name 	: fnClickElement
		//parameters		:driver,object properties,string
		//return value		:boolean value
		//written by		:Raju
		//modify by			:
		//***************************************************************************************
		public boolean fnClickElement(WebDriver driver,By objproperties)
		{
			boolean bflag;
			try{
				if (driver.findElement(objproperties).isDisplayed() && driver.findElement(objproperties).isEnabled())
				{
					driver.findElement(objproperties).click();
					bflag = true;
				}else
				{
					bflag = false;
				}
			}catch(Exception e)
			{
				System.out.println(e);
			}
			if(bflag=true){
				return true;
			}else{
				return false;
				}
			}
}
