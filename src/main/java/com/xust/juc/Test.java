package com.xust.juc;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.LongStream;
/**
 * @ClassName Test
 * @description
 * @Author LiHaoqiang
 * @Date 2019/2/13 15:57
 */
public class Test {
    public static void main(String[] args) {
        Instant start = Instant.now();
        Long sum = LongStream.rangeClosed(0L, 10000000000L)
                .parallel()
                .reduce(0L, Long::sum);
        System.out.println(sum);
        Instant end = Instant.now();
        System.out.println("耗费时间为：" + Duration.between(start, end).toMillis());
    }
}
