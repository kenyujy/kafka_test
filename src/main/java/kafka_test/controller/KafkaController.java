package kafka_test.controller;

import kafka_test.kafka_msg_entity.KafkaMessage;
import kafka_test.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@RequestMapping(value="/kafka")
public class KafkaController {

    @Autowired
    private Producer kafkaProducer;

    @RequestMapping(value="message", method = RequestMethod.GET)
    public KafkaMessage sendKafkaMsg(@RequestParam(name ="id", required= false)long id,
                                     @RequestParam(name ="username", required = false) String username){
        KafkaMessage msg= new KafkaMessage(id, username, new Date());
        kafkaProducer.sendKafkaMsg(msg);
        return msg;
    }

}
