package com.rike.rule.core.api;

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

    boolean evaluate(Facts facts);

    /**
     * Rule actions abstraction : this method encapsulates the rule's actions.
     * @throws Exception thrown if an exception occurs during actions performing
     */
    void execute(Facts facts) throws Exception;
}
