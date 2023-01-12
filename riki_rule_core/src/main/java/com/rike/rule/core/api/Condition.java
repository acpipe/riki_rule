package com.rike.rule.core.api;

/**
 * @author huming on 2023/1/12.
 */
public interface Condition {
    boolean evaluate(Facts facts);

    Condition FALSE_CONDITION = facts -> false;
    Condition TRUE_CONDITION = facts -> true;
}
