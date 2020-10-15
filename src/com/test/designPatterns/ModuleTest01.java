//package com.test.designPatterns;
//
//import com.google.common.collect.Lists;
//
//import java.util.List;
//
///**
// * https://juejin.im/post/6875124307605864461#comment
// */
//public class ModuleTest01 {
//    public static final int PARTITION_SIZE = 1000;
//
//    public static void main(String[] args) {
//
//        // 这里就模拟是业务参数
//        List<Long> paramIds = Lists.newArrayList(1L,2L,3L);
//        // 进行分隔
//        List<List<Long>> partitionParamIds = Lists.partition(paramIds, PARTITION_SIZE);
//        List<Object> resultList = Lists.newArrayListWithExpectedSize(paramIds.size());
//        partitionParamIds.forEach(partition -> {
//            // 执行具体的DAO操作，当然这里也是模拟
//            resultList.addAll(new ObjectDao().getList(partition));
//        });
//        System.out.println(resultList.size());
//    }
//
//}
