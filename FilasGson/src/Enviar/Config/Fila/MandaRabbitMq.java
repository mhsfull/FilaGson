package Enviar.Config.Fila;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.MessageProperties;

public class MandaRabbitMq {
    public static void fila(String mensagem, String queue) throws Exception{
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("localhost");
            try (Connection connection = factory.newConnection();
                 Channel channel = connection.createChannel()) {
                channel.queueDeclare(queue, true, false, false, null);
                channel.basicPublish("", queue,
                        MessageProperties.PERSISTENT_TEXT_PLAIN,
                        mensagem.getBytes("UTF-8"));
        }
    }

}
