package com.itcast.sercvice.springcloud_service_consumer.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: Noviciate
 * @Date: 2020/4/8/008 15:26
 * @Description: code
 * @Version: 0.0.1
 */
@Controller
@RequestMapping("consumer/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

 /*   @Autowired
    private DiscoveryClient discoveryClient; // eureka客户端，可以获取到eureka中服务的信息*/

    @GetMapping
    @ResponseBody
    @HystrixCommand(fallbackMethod = "queryUserByIdFallBack11")
    public String queryUserById(@RequestParam("id") Long id) {
        // 根据服务名称，获取服务实例。有可能是集群，所以是service实例集合
        //List<ServiceInstance> instances = discoveryClient.getInstances("service-provider");
        // 因为只有一个Service-provider。所以获取第一个实例
        //ServiceInstance instance = instances.get(0);
        // 获取ip和端口信息，拼接成服务地址

        //String baseUrl = "http://" + instance.getHost() + ":" + instance.getPort() + "/user/" + id;
        //System.out.println(baseUrl);
        //User user = this.restTemplate.getForObject(baseUrl, User.class);
        //return user;
        // 通过client获取服务提供方的服务列表，这里我们只有一个
        // ServiceInstance instance = discoveryClient.getInstances("service-provider").get(0);
        String user = this.restTemplate.getForObject("http://service-provider/user/" + id, String.class);
        return user;
    }

    public String queryUserByIdFallBack111(Long id){
        return "请求繁忙，请稍后再试！";
    }

}
