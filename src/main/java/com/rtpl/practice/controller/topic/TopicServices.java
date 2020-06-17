package com.rtpl.practice.controller.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TopicServices {
	
	public List<Topic> topics = Arrays.asList(
			    new Topic("spring", "Spring Framework", "Spring Framework Description"),
				new Topic("java", "core java", "core java Description"),
				new Topic("javascript", "JavaScript", "JavaScript Description"));
	
	public List getAllTopics() {
		return topics;
		
		
	}
	
	
	
	}

