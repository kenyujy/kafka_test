package kafka_test.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics="testTopic", groupId = "myGroup")
    public void getMessage(ConsumerRecord<String, String> consumerRecord){

        String topic= consumerRecord.topic();
        String key= consumerRecord.key();
        String msg= consumerRecord.value();
        int partitionId= consumerRecord.partition();
        long timeStamp= consumerRecord.timestamp();

        System.out.println("topic: "+topic);
        System.out.println("key: "+ key);
        System.out.println("msg: "+ msg);
        System.out.println("partitionId: "+ partitionId);
        System.out.println("timeStamp: "+ timeStamp);
    }
}
