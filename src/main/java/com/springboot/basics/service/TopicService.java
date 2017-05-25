package com.springboot.basics.service;

/**
 * Created by renuka on 31/3/17.
 */

import com.springboot.basics.resource.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    /*private List <Topic> topicList = Arrays.asList(
            new Topic("id", "courseName", "description"),
            new Topic("id", "courseName", "description"),
            new Topic("id", "courseName", "description"),
            new Topic("id", "courseName", "description")
    );*/

    private List <Topic> topicList = new ArrayList<Topic>();

    public List<Topic> getAllTopics() {
        return topicList;
    }

    public Topic getTopic(String id) {
        for (Topic topic: topicList) {
            if (id.equals(topic.getId()))
                return topic;
        }

        return null;
    }

    public void addTopic(Topic topic) {
        topicList.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i=0; i< topicList.size(); i++) {
            if (id.equals(topic.getId())) {
                topicList.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        for (Topic topic: topicList) {
            if (id.equals(topic.getId()))
                topicList.remove(topic);
        }
    }
}
