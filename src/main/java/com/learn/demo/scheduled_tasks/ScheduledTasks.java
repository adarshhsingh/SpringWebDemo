package com.learn.demo.scheduled_tasks;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  ScheduledTasks : This will be class where we will define our
 *                   methods which we want to be run on some schedule
 *
 * @Component :
 * Indicates that an annotated class is a "component".
 * Such classes are considered as candidates for auto-detection
 * when using annotation-based configuration and classpath scanning.
 *
 *   │  Annotation │ Meaning                                             │
 *   ├─────────────┼─────────────────────────────────────────────────────┤
 *   │ @Component  │ generic stereotype for any Spring-managed component │
 *   │ @Repository │ stereotype for persistence layer                    │
 *   │ @Service    │ stereotype for service layer                        │
 *   │ @Controller │ stereotype for presentation layer (spring-mvc)      │
 *
 *
 * @Component :
 *    is a generic stereotype for any Spring-managed component. @Repository, @Service,
 *    and @Controller are specializations of @Component for more specific use cases,
 *    for example, in the persistence, service, and presentation layers, respectively.
 *
 *
 *
 */
@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
}
