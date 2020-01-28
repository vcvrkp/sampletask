/**
 * 
 */
package com.dell.task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.task.listener.TaskExecutionListener;
import org.springframework.cloud.task.repository.TaskExecution;

/**
 * @author vcvr
 *
 */
public class MyTask implements CommandLineRunner,TaskExecutionListener {

	@Override
	public void onTaskStartup(TaskExecution taskExecution) {
		System.out.println("Starting Up the Task.");
	}

	@Override
	public void onTaskEnd(TaskExecution taskExecution) {
		System.out.println("Completed the Task.");
	}

	@Override
	public void onTaskFailed(TaskExecution taskExecution, Throwable throwable) {
		System.out.println("On Failure of Task.");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Iam the task running.");
	}

}
