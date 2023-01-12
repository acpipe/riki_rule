package com.rike.rule.core.api;

/**
 * 执行引擎接口, 定义成接口方便后面扩展.
 * @author huming on 2023/1/12.
 */
public interface RulesEngine {
    Map<Rule, Boolean> check(Rule)
}
