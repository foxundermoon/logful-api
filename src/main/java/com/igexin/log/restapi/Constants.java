package com.igexin.log.restapi;

public class Constants {

    /**
     * 缓存目录
     */
    public static final String CACHE_DIR = "cache";

    /**
     * 解析出错的日志文件目录
     */
    public static final String ERROR_DIR = "error";

    /**
     * 已解密的日志文件目录
     */
    public static final String DECRYPTED_DIR = "decrypted";

    /**
     * 应用崩溃文件目录
     */
    public static final String CRASH_REPORT_DIR = "crash";

    /**
     * 日志文件处理临时文件目录.
     */
    public static final String LOG_FILE_TEMP_DIR = "temp";

    /**
     * 附件文件目录.
     */
    public static final String ATTACHMENT_DIR = "attachment";

    public static final String DEFAULT_ATTRIBUTE_SEPARATOR = ",";

    public static final String DEFAULT_FIELD_SEPARATOR = ":";

    public static final String LOG_LINE_SEPARATOR = "\u1699\u168f\u16e5";

    public static final String NEW_LINE_CHARACTER = "\u203c\u204b\u25a9";

    /**
     * 加解密失败返回字符串.
     */
    public static final String CRYPTO_ERROR = "CRYPTO_ERROR";

    public static final int DEFAULT_GRAY_LEVEL = 100;

    public static final int QUEUE_CAPACITY = 512;

    public static final String CLIENT_ID = "525b8747323d49078a96e49f0189de98";

    public static final String CLIENT_SECRET = "02ce8e2adba94ae5a4807e3f12ea34f3";
}
