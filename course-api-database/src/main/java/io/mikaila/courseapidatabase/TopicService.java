package io.mikaila.courseapidatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Business Service

@Service
public class TopicService {

    @Autowired  //Mark - Crud repository instance as autowired
    private TopicRepository topicRepository;

    //Method - Getter to return all the topics above - available to be called in controller
    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()  //iterate through all the topics in the database
                .forEach(topics::add);  //for each element found put the element into the topics Array list
        return topics;

    }

    //Go to topic list and get the stream and filter by id
//Given a topic i want to compare the id of that topic to the id that is passed in
//Get the very first topic element and get the topic instance
//works like a loop iteration but this is lambda


    public Topic getTopic(String id){
        return topicRepository.findOne(id);
        // return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();

    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
        //topics.add(topic);
    }

    public void updateTopic(String id, Topic topic){
       topicRepository.save(topic);  //does update and insert
//        for(int x = 0; x < topic; x++){
//            Topic t = topic.get(x); //for each topic
//            if(t.getId().equals(id)){ //compare to what is passed in
//                topic.set(x,topic); //topic from parameter passed in
//                return;
//            }
//        }
    }



    public void deleteTopic(String id){
        topicRepository.delete(id);
       // topics.removeIf(t-> t.getId().equals(id));
    }

}


