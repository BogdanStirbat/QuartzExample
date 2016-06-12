package com.bstirbat.quartzexample;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SimpleJob implements Job {

	@Override
	public void execute(JobExecutionContext executionContext) throws JobExecutionException {
		System.out.println("Hello! SimpleJob is executing, current fire time is: " 
		    + executionContext.getFireTime() + 
		    ", next fire time is: " + executionContext.getNextFireTime() );
	}

}
