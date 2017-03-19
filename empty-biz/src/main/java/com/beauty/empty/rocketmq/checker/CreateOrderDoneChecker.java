package com.beauty.empty.rocketmq.checker;


import com.beauty.empty.client.topic.EmptyTopic;
import org.apache.rocketmq.client.producer.LocalTransactionState;


public class CreateOrderDoneChecker implements Checker {
    @Override
    public boolean in(String topic, String tag) {
        return EmptyTopic.CREATE.equals(topic);
    }


    @Override
    public LocalTransactionState check(Object msg) {
        return null;
    }
}
