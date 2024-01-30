package gateway.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yutao04
 */
@SpringBootApplication
@EnableDubboConfiguration
public class DubboConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }
}