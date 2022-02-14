package com.flamexander.rabbitmq.console.producer;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;


public class MyHomeWorkIT_Blog {
    private static final String EXCHANGE_NAME = "DoubleDirect";

    public static void main(String[] argv) throws Exception {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Ввод статьи. Превое слово определяет тему статьи:");
            String firstWord = scan.next();
            String article = scan.nextLine().trim();
            if (firstWord.equals("exit")) break;
            if (firstWord.equals("php")) sendMessage(firstWord, article);
        }
    }


    private static void sendMessage(String queueNames, String article) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);

            channel.basicPublish(EXCHANGE_NAME, queueNames, null, article.getBytes("UTF-8"));
            System.out.println("OK. Статья отправдена");
        }
    }
}