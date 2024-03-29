package com.simon.mikilin.core.util;

import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhouzhenyong
 * @since 2018/12/22 下午10:16
 */
@Slf4j
public class Maps<K, V> {

    private Maps() {}

    private Map<K, V> dataMap = new HashMap<>();

    /**
     * key-value-key-value...这种格式初始化map
     *
     * @param kvs key-value-key-value这种kv入参
     * @return 构造的Maps结构
     */
    @SuppressWarnings("unchecked")
    public static Maps of(Object... kvs) {
        if (kvs.length % 2 != 0) {
            log.error("Maps.of的参数需要是key-value-key-value...这种格式");
            return new Maps();
        }

        Maps neoMap = new Maps();
        for (int i = 0; i < kvs.length; i += 2) {
            if (null == kvs[i]) {
                log.error("map的key不可以为null");
                return neoMap;
            }
            neoMap.put(kvs[i], kvs[i + 1]);
        }
        return neoMap;
    }

    public Maps put(Map<K, V> map) {
        dataMap.putAll(map);
        return this;
    }

    public Maps put(K key, V value) {
        dataMap.put(key, value);
        return this;
    }

    public Maps add(Map<K, V> map) {
        dataMap.putAll(map);
        return this;
    }

    public Maps add(K key, V value) {
        dataMap.put(key, value);
        return this;
    }

    public Map<K, V> build() {
        return dataMap;
    }

}
