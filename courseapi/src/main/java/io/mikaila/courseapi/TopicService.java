package io.mikaila.courseapi;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
//Topic Service - singleton - initialized only once only one copy of it
@Service  //Tell spring this is a service - Marks the class as a spring business services
//Create an ArrayList member variable called topics - We have one one topics
//create a copy so you have a mutable List from the array
public class TopicService {
     private  List<Topic> topics =  new ArrayList<>(Arrays.asList(
             new Topic("spring", "Spring Framework", "SpringFrameWork Description" ),
             new Topic("java","Core Java", " Core Java Description")
     ));

    //Method - Getter to return all the topics above - available to be called in controller
    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id){
        for(int x = 0; x < topics.size(); x++){
            Topic t = topics.get(x);

            if(t.getId().equals(id)){
               return t;
            }
        }
        return null;
        //return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic t){
        topics.add(t);
    }

    public void updateTopic(String id, Topic topic){
        for(int x = 0; x < topics.size(); x++){
            Topic t = topics.get(x); //for each topic
            if(t.getId().equals(id)){ //compare to what is passed in
                topics.set(x,topic); //topic from parameter passed in
                //return;
            }
        }
    }


    public void deleteTopic(String id){
        for(int x = 0; x < topics.size(); x++){
            Topic t = topics.get(x);
            if(t.getId().equals(id)){
                topics.remove(x);
            }
        }

        //topics.removeIf(t-> t.getId().equals(id));

        }

//    public List<Topic> getTwoTopics(String id) {
//        for(int x = 0; x < topics.size(); x++){
//            Topic t = topics.get(x);
//            Topic t2 = topics.get(x + 1);
//            List<Topic> result = new ArrayList<>();
//            result.add(t);
//            result.add(t2);
//            if(t.getId().equals(id)){
//                return result;
//            }
//        }
//        return null;
//
//    }
}
