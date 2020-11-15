package com.qingmu.mybatisplus.service.impl;

import com.qingmu.mybatisplus.annotion.History;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Description：远程调用方法
 *
 * @author lida
 * @date: created in 2020-11-14 8:01 下午
 */
@Component
public class RestTemplateService {

    RestTemplate restTemplate = new RestTemplate();


    @History
    public <T, B> ResponseEntity<T> basicRestRequest(String url, B body, HttpMethod method, Class<T> clazz) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<B> httpEntity = new HttpEntity<>(body, headers);
        ResponseEntity<T> response = restTemplate.exchange(url, method, httpEntity, clazz);
        return response;
    }
}
