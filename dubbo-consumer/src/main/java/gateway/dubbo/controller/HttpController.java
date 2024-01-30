package gateway.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import gateway.dubbo.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yutao04
 */
@RestController
public class HttpController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        String hello = helloService.sayHello("world");
        System.out.println(helloService.sayHello("gateway-demo"));
        return hello;
    }

    @RequestMapping("/hello_with_param")
    public String hello(@RequestParam(name = "Param") String param) {
        String hello = helloService.sayHello(param);
        System.out.println(helloService.sayHello(param));
        return hello;
    }
}
