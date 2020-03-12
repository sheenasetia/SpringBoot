package io.sheena.springbootstarter.topics;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//creating a business service
//spring creates the instance of all the business services
@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics() {
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public Optional<Topic> getTopic(String id)
	{
		return topicRepository.findById(id);
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		// TODO Auto-generated method stub
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topicRepository.deleteById(id);
	}
	
	
}

