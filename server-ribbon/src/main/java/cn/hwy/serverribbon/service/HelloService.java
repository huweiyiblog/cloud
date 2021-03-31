package cn.hwy.serverribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    String defalut_url= "http://EUREKA-CLIENT";
    public String hiService(String name) {
        return restTemplate.getForObject("http://eureka-client/hi" + "?name=" + name, String.class);
    }


}
