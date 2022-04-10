package com.lockedme;

public class LockedmeMain {
public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockedMe", "Shubham Kumar Nimje");
		
		HandleOptions.handleWelcomeScreenInput();
	}

}
