package com.cloudtask.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class CloudTaskServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudTaskServiceApplication.class, args);
	}

	@Bean
	public PollProcessingTask tollProcessingTask() {
		return new PollProcessingTask();
	}

	public class PollProcessingTask implements CommandLineRunner {
		@Override
		public void run(String... strings) throws Exception {

			try {
				if (null != strings) {
					String stationId = strings[1];
					String licencePlate = strings[2];
					String timeStamp = strings[3];

					System.out.println(stationId);
					System.out.println(licencePlate);
					System.out.println(timeStamp);

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}

		}

	}
}
