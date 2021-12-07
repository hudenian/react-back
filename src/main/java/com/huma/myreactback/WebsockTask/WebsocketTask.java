package com.huma.myreactback.WebsockTask;

import com.huma.myreactback.service.WebsocketService;
import com.huma.myreactback.websocket.controller.MessageBean;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RedissonClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hudenian
 * @date 2021/12/7
 */
@Slf4j
@Service
public class WebsocketTask {

    @Resource
    private RedissonClient redissonClient;

    @Resource
    private WebsocketService websocketService;

    @Scheduled(fixedDelay = 5 * 60 * 1000, initialDelay = 10 * 1000)
    public void listenRedisQueue() {
        log.info("开始发送websocket消息");
        MessageBean messageBean = new MessageBean();
        messageBean.setName("hudenian");
        messageBean.setMessage("你好呀！");

//        Job job = (Job) redissonClient.getBlockingQueue(SysConstant.JOB_ADD_QUEUE).take();
        websocketService.send(messageBean);

    }
}
