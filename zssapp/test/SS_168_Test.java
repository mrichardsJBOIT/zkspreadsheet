

public class SS_168_Test extends SSAbstractTestCase {

    @Override
    protected void executeTest() {
    	click("jq('$fileMenu button.z-menu-btn')");
    	waitResponse();
    	click("jq('$openFile a.z-menu-item-cnt')");
    	waitResponse();
    	
    	// TODO verify if open file window is opened
    	verifyTrue(widget(jq("$fileOpenWin div.z-window-highlighted-header")).exists());
    }
}
