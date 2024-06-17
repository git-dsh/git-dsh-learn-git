package org.example.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfig {

    /**
     * PublishSubscribeQueueA 队列名称
     * PublishSubscribeExchange 交换机名称
     * @return
     */
    @Bean
    public Binding bingQueueAToPublishSubscribeExchange() {
        return BindingBuilder.bind(new Queue("PublishSubscribeQueueA",true)).to(new FanoutExchange("PublishSubscribeExchange"));
    }

    @Bean
    public Binding bingQueueBToPublishSubscribeExchange() {
        return BindingBuilder.bind(new Queue("PublishSubscribeQueueB",true)).to(new FanoutExchange("PublishSubscribeExchange"));
    }
    @Bean
    public Binding bingQueueCToPublishSubscribeExchange() {
        return BindingBuilder.bind(new Queue("PublishSubscribeQueueC",true)).to(new FanoutExchange("PublishSubscribeExchange"));
    }
}
