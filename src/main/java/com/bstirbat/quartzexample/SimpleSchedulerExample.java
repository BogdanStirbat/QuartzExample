package com.bstirbat.quartzexample;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;

import static org.quartz.JobBuilder.*;
import static org.quartz.TriggerBuilder.*;
import static org.quartz.SimpleScheduleBuilder.*;


public class SimpleSchedulerExample {
    public static void main( String[] args ) throws SchedulerException {
    	SchedulerFactory schedulerFactory = new org.quartz.impl.StdSchedulerFactory();
    	Scheduler scheduler = schedulerFactory.getScheduler();
    	
    	scheduler.start();
    	
    	JobDetail job = newJob(SimpleJob.class)
    			.withIdentity("myJob", "group1")
    			.build();
    	
    	Trigger trigger = newTrigger()
    			.withIdentity("myTrigger", "group1")
    			.startNow()
    			.withSchedule(simpleSchedule()
    					.withIntervalInSeconds(10)
    					.repeatForever())
    			.build();
    	
    	scheduler.scheduleJob(job, trigger);
    	
    	// If started from command line, Java process will not end
    	// unless line below is executed
    	//scheduler.shutdown();
    }
}
