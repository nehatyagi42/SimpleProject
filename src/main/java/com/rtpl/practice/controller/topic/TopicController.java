package com.rtpl.practice.controller.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*
 * this controller marks its a rest controller thats why we use @RestController
 * Any time you build a rest controller class then its necessary to add this
 * Annotation
 */
public class TopicController {

	/*
	 * @RequestMapping("/topics") public String getAllTopics() { return "Alltopics";
	 * 
	 * 
	 * }
	 */

	// So now what i am doing is returns list of topics from this controlle
	/*
	 * we have 3 topics object created as a list and this list is returns
	 * getAlltopics method when i call /topics spring mvc call this method and this
	 * method returns is a list <Topics> objects nd SpringMvc takes oneffort to
	 * convert the List<Topics>object to convert into a json format.
	 */
@Autowired
	private TopicServices topicService;     //it means you create a new instance
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
	return topicService.getAllTopics();
	}
}