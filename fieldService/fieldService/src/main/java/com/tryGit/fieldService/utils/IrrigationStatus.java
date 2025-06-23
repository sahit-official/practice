package com.tryGit.fieldService.utils;

public enum IrrigationStatus {
		NotStarted,       // Irrigation has not begun
	    InProgress,       // Currently irrigating
	    Paused,           // Temporarily paused
	    Completed,        // Finished irrigation
	    Error,            // An error occurred during irrigation
	    Scheduled,        // Scheduled for a future time
	    Cancelled,        // Irrigation was cancelled
	    ManualOverride    // Manually overridden status
}
