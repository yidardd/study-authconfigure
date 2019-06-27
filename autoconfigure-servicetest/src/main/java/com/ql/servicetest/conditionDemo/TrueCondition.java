package com.ql.servicetest.conditionDemo;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @ClassName TrueCondition
 * @Description TrueCondition
 * @Author stack
 * @Version 1.0
 * @since 2019/6/27 20:52
 */
public class TrueCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return true;
    }
}
