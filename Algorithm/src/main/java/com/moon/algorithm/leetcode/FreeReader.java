package com.moon.algorithm.leetcode;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * 给定一个 FreeReader public <T> T read(Object source, String fullPath)
 * Object 可以为 list 或者是 Map，
 * list 的值可以为 list 或 Map
 * Map 的 key 为 Sting, value 可以为 Map 或 list
 * 给定一个路径 a/b[2]/c 读取路径的值
 * <p>
 * Map<String, Object> map = new HashMap<>();
 * map.put("c", "hi");
 * List<Object> list = Arrays.asList("e", "f", map);
 * Map<String, Object> map2 = new HashMap<>();
 * map2.put("a", list);
 * <p>
 * {
 * "a": [
 * "e",
 * "f",
 * {
 * "c": "hi"
 * }
 * ]
 * }
 */
public class FreeReader {
    public static final String SPLIT_SYMBOL = "/";
    public static final String LEFT_BRACKETS = "[";
    public static final String RIGHT_BRACKETS = "]";

    public static <T> T read(Object source, String fullPath) {
        if (Objects.isNull(source) || StringUtils.isBlank(fullPath)) {
            return null;
        }
        Object obj = source;
        List<String> fullPathList = splitFullPath(fullPath);
        if (CollectionUtils.isEmpty(fullPathList)) return null;
        for (String pathVal : fullPathList) {
            if (Objects.isNull(obj)) {
                return null;
            }
            if (pathVal.contains(LEFT_BRACKETS) && pathVal.contains(RIGHT_BRACKETS)) {
                Integer index = Integer.valueOf(String.valueOf(pathVal
                        .charAt(pathVal.indexOf(RIGHT_BRACKETS) - pathVal.indexOf(LEFT_BRACKETS))));
                obj = getVal(obj, pathVal, index);
            } else {
                obj = getVal(obj, pathVal, null);
            }
        }
        return (T) obj;
    }

    /**
     * get val
     *
     * @param obj
     * @param pathValue
     * @param index
     * @return
     */
    public static Object getVal(Object obj, String pathValue, Integer index) {
        if (obj instanceof Map) {
            Map valMap = (Map) obj;
            return MapUtils.isEmpty(valMap) ? null : valMap.getOrDefault(pathValue, null);
        } else if (obj instanceof List) {
            List list = (List) obj;
            return CollectionUtils.isEmpty(list) ? null : index < list.size() ? list.get(index) : null;
        }
        return null;
    }

    /**
     * split full path
     *
     * @param fullPath
     * @return
     */
    public static List<String> splitFullPath(String fullPath) {
        return StringUtils.isBlank(fullPath) ? new ArrayList<>(0) : fullPath.contains(SPLIT_SYMBOL) ?
                Arrays.asList(fullPath.split(SPLIT_SYMBOL)) : new ArrayList<>(0);
    }

    public static void main(String[] args) {
        List<Object> list3 = Arrays.asList(1, 2, 5, "map3");

        Map<String, Object> map1 = new HashMap<>();
        map1.put("g", "hi");
        map1.put("h", "hi1");
        map1.put("cd", list3);
        Map<String, Object> map3 = new HashMap<>();
        map3.put("i", "le");
        map3.put("j", "dc");
        List<Object> list = Arrays.asList(1, 2, map1, map3);
        List<Object> list2 = Arrays.asList(3, 4);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("a", list);
        map2.put("b", list2);
        System.out.println(JSONObject.toJSONString(map2));
        Object read = FreeReader.read(map2, "a/b[2]/cd/g[3]");
        System.out.println(read);
    }
}
