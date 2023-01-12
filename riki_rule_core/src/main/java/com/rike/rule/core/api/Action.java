package com.rike.rule.core.api;

/**
 * @author huming on 2023/1/12.
 */
public interface Action<RESULT> {
    /**
     * 返回执行的结果和上下文
     * @param f
     * @return
     * @throws Exception
     */
    RESULT execute(Facts f) throws Exception;
}
