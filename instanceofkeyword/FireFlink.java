package com.jspiders.instanceofkeyword;

public class FireFlink 
{
  static void runTest(Testing t)
  {
	  if(t!=null)
	  {
		  t.report();
		  if(t instanceof ManualTestig)
		  {
			  ManualTestig mt=(ManualTestig)t;
			  mt.testcase();
		  }
		  else if(t instanceof AutomationTesting)
		  {
			  AutomationTesting at=(AutomationTesting)t;
			  at.testscript();
		  }
	  }
  }
}
