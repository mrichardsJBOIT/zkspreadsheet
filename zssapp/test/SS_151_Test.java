/* order_test_1Test.java

	Purpose:
		
	Description:
		
	History:
		Sep, 7, 2010 17:30:59 PM

Copyright (C) 2010 Potix Corporation. All Rights Reserved.

This program is distributed under Apache License Version 2.0 in the hope that
it will be useful, but WITHOUT ANY WARRANTY.
*/

//right click "align text left" : F17
public class SS_151_Test extends SSAbstractTestCase {
	@Override
	protected void executeTest() {
		rightClickCell(5,16);
		click(jq(".z-toolbarbutton[title=\"Align Text Left\"] img:eq(2)"));
		waitResponse();
		rightClickCell(1,13);
		
		//how to verify
		String style = getCellStyle(5, 16);
		verifyTrue(!style.contains("text-align: center;"));
		verifyTrue(!style.contains("text-align: right;"));
	}
}

