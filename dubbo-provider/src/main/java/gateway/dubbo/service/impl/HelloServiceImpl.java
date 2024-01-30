package gateway.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import gateway.dubbo.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author yutao04
 */
@Component
@Service(weight = 33)
public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
