package com.yupi.yupicturebackend.model.dto.file;

import lombok.Data;

/**
 * 用于接收图片解析信息的包装类
 */
@Data
public class UploadPictureResult {

    /**
     * 图片地址
     */
    private String url;
    /**
     * 缩略图 url
     */
    private String thumbnailUrl;

    /**
     * 图片名称
     */
    private String picName;

    /**
     * 文件体积
     */
    private Long picSize;

    /**
     * 图片宽度
     */
    private int picWidth;

    /**
     * 图片高度
     */
    private int picHeight;

    /**
     * 图片宽高比
     */
    private Double picScale;

    /**
     * 图片格式
     */
    private String picFormat;

}
