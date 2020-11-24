package com.ql.servicetest.conditionDemo;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @ClassName FalseCondition @Description FalseCondition @Author stack @Version 1.0
 *
 * @since 2019/6/27 20:53
 */
public class FalseCondition implements Condition {
  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    return false;
  }
}
