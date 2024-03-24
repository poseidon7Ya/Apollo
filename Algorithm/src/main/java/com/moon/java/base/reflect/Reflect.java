package com.moon.java.base.reflect;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Reflect {
    public static void main(String[] args) {


    }

    private static <T> Map<String, Object> covert2TextMap(T vo, Class<?> clazz) throws InstantiationException, IllegalAccessException {
        if (Objects.isNull(vo)) {
            vo = (T) clazz.newInstance();
        }
        Field[] allFields = vo.getClass().getDeclaredFields();
        final T finalVo = vo;
        return Arrays.stream(allFields).map(field -> Pair.of(field.getName(), getFieldValue(field, finalVo)))
                .collect(Collectors.toMap(Pair::getKey, Pair::getValue, (k1, k2) -> k1));
    }

    private static <T> String getFieldValue(Field field, T vo) {
        Class<?> type = field.getType();
        String empty = StringUtils.EMPTY;
        Object val = empty;
        try {
            val = field.get(vo);
        } catch (IllegalAccessException e) {
            //
        }
        if (type.isAssignableFrom(String.class) || type.isAssignableFrom(Integer.class)) {
            return Objects.toString(val, empty);
        } else if (type.isAssignableFrom(BigDecimal.class)) {
            return ((BigDecimal) val).stripTrailingZeros().toPlainString();
        }
        return empty;
    }
}
