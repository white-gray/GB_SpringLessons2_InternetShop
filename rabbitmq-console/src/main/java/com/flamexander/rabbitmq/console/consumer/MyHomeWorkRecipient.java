package com.flamexander.rabbitmq.console.consumer;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class MyHomeWorkRecipient {
    private static final String EXCHANGE_NAME = "DoubleDirect";

    public static void main(String[] argv) throws Exception {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Прием статьи активируется командой set_topic темаСтатьи. Слово 'темаСтатьи' определяет тему принимаемой статьи:");
            String firstWord = scan.next();
            String nextWords = scan.nextLine().trim();
            if (firstWord.equals("exit")) break;
            if (firstWord.equals("set_topic")) {
                if (nextWords.equals("php")) getMessage(firstWord);
            }
        }
    }

    private static void getMessage(String queueNames) throws IOException, TimeoutException {
System.out.println("ytrt");
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);

        String queueName = channel.queueDeclare().getQueue();
        System.out.println("My queue name: " + queueName);

        channel.queueBind(queueName, EXCHANGE_NAME, queueNames);

        System.out.println(" [*] Waiting for messages");

        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody(), "UTF-8");
            System.out.println(" [x] Received '" + message + "'");
            System.out.println(Thread.currentThread().getName());
        };

        channel.basicConsume(queueName, true, deliverCallback, consumerTag -> { });
    }
}
