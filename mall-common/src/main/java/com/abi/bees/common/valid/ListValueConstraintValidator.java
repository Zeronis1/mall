package com.abi.bees.common.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * @Date 2023/8/17
 * @Author SLF
 * @Description:
 */
public class ListValueConstraintValidator implements ConstraintValidator<ListValue,Integer> {

    private final Set<Integer> set = new HashSet<>();


    /**
     * 初始化方法
     * @param constraintAnnotation annotation instance for a given constraint declaration
     *                             自定义注解的详细信息
     */
    @Override
    public void initialize(ListValue constraintAnnotation) {
        int[] values = constraintAnnotation.values();
        for (int val : values) {
            set.add(val);
        }
    }

    /**
     * 判断是否校验成功
     * @param value object to validate 需要校验的值
     * @param context context in which the constraint is evaluated
     *
     * @return
     */
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return set.contains(value);
    }
}
