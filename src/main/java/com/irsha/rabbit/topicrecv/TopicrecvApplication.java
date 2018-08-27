package com.irsha.rabbit.topicrecv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TopicrecvApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(TopicrecvApplication.class, args);
		TopicRecv topicRecv = new TopicRecv();
		String[] data={"office.*"};
		topicRecv.recvTopic(data);
	}
}
