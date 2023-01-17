package com.rike.rule.core.api;

import java.util.HashMap;
import java.util.Map;


/**
 * @author huming on 2023/1/13.
 */
public class DefaultRulesEngine implements RulesEngine {
    @Override
    public Map<Rule, Boolean> check(Rules rules, Facts facts) {
        Map<Rule, Boolean> ruleCheckMap = new HashMap<>();
        rules.forEach(rule -> {
            final String name = rule.getName();
            if (rule.evaluate(facts)) {
                // 满足条件, 执行.
                try {
                    rule.execute(facts);
                } catch (Exception e) {
                    // log
                }
            }
        });
        return null;
    }

    @Override
    public void fire(Rules rules, Facts facts) {

    }
}
