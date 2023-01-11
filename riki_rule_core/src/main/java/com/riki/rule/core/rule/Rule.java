package com.riki.rule.core.rule;

import com.rike.rule.core.fact.Fact;

/**
 * @author huming on 2023/1/11.
 */
public interface Rule extends Comparable<Rule> {
    /**
     * 规则名称.
     * @return
     */
    String getName();

    /**
     * 规则描述.
     * @return
     */
    String getDesc();

    /**
     * 执行规则, 并返回结果.
     * @param f
     * @return
     */
    boolean execute(Fact f);
}
