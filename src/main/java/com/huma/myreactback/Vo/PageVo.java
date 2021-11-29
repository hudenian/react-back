package com.huma.myreactback.Vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

/**
 * @author admin
 * @date 2021/7/20
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageVo<T> {
    /**
     * 符合条件的总记录数
     */
    private Long total;

    /**
     * 页码
     */
    private Long current;

    /**
     * 每页大小
     */
    private Long size;

    /**
     * 查询结果
     */
    private List<T> items;
}
