package com.springboot.basics.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by renuka on 29/3/17.
 */

@RestController
public class TopicController {

    @RequestMapping("/topic")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("Basics", "Java","Description"),
                new Topic("Inner Classes", "Java","Description")
        );
    }

}
