package kafka_test.kafka_msg_entity;

import java.io.Serializable;
import java.util.Date;

public class KafkaMessage implements Serializable {

    private long id;

    private String username;

    private Date date;

    public long getId() {
        return id;
    }

    public KafkaMessage() {
    }

    public KafkaMessage(long id, String username, Date date) {
        this.id = id;
        this.username = username;
        this.date = date;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Kafka_Message{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", date=" + date +
                '}';
    }
}
