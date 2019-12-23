package kafka_test.producer;

import com.google.gson.Gson;
import kafka_test.kafka_msg_entity.KafkaMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendKafkaMsg(KafkaMessage kafkaMessage){
        this.kafkaTemplate.send("testTopic", new Gson().toJson(kafkaMessage));
    }
}
