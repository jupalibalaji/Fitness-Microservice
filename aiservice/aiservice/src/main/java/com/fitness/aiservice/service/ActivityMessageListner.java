package com.fitness.aiservice.service;
import com.fitness.aiservice.model.Activity;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Data
@RequiredArgsConstructor
public class ActivityMessageListner {

    @RabbitListener(queues = "activity.queue")
    public void processActivity(Activity activity){
        log.info("Received Activity for Processing: {}", activity.getId());
    }
}
