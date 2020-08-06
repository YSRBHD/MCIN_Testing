package org.mcin.utils;

public class DeadCodeReference {

	// =========== Identification =============//

//	public void switchBrowserWindowAndChoseCertificat() {
//	try {
//		Thread.sleep(10000);
//	} catch (InterruptedException e) {
//		e.printStackTrace();
//	}
//	// Store the current window handle
//	String winHandleBefore = driver.getWindowHandle();
//
//	// Switch to child window
//	Set<String> handles = driver.getWindowHandles();
//	Iterator<String> it = handles.iterator();
//	String parent = it.next();
//	String child = it.next();
//	driver.switchTo().window(child);
//	wait.until(ExpectedConditions.elementToBeClickable(buttonAccess));
//
//	// Perform the actions on new window and click on certification
//	Runnable r = new Runnable() {
//		@Override
//		public void run() {
//			try {
//				wait.until(ExpectedConditions.elementToBeClickable(buttonAccess)).click();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	};
//
//	// Chose first certificate
//	try {
//		Robot robot = new Robot();
//		Thread t = new Thread(r);
//		t.start();
//		robot.delay(10000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//	} catch (AWTException e1) {
//		e1.printStackTrace();
//	}
//
//	// Switch back to original browser (first window)
//	driver.switchTo().window(winHandleBefore);
//}

//	==============   Upload document with Autoit integration into selenium ===============
//	public void uploadDocumentAction() throws Exception {
//		Runtime.getRuntime().exec(AutoItExe);
//		Thread.sleep(2000);
//		scrollDown();
//	}

}
