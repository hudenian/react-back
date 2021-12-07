package com.huma.myreactback.enums;

/**
 * @author hudenian
 * @date 2021/12/7
 */
public enum WebsocketEnums {

    /**
     * websocket 发送目标
     */
    WEBSOCKET_DESTINATION("/topic/user", "websocket 发送目标");

    private String topic;
    private String desc;

    WebsocketEnums(String topic, String desc) {
        this.setTopic(topic);
        this.desc = desc;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
