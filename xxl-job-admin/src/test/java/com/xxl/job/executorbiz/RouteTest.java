package com.xxl.job.executorbiz;

import com.xxl.job.admin.core.route.ExecutorRouteStrategyEnum;
import com.xxl.job.core.biz.model.TriggerParam;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

/**
 * @author zquan
 * @date 2022/5/12
 */
public class RouteTest {

    @Test
    public void route() {
//        ExecutorRouteStrategyEnum executorRouteStrategyEnum = ExecutorRouteStrategyEnum.match(ExecutorRouteStrategyEnum.CONSISTENT_HASH.name(), null);    // route strategy
        TriggerParam param1 = new TriggerParam();
        TriggerParam param2 = new TriggerParam();
        param1.setJobId(1);
        param2.setJobId(2);
        ExecutorRouteStrategyEnum.CONSISTENT_HASH.getRouter().route(param1, Lists.newArrayList("192.0.0.1:7001", "192.0.0.1:7002", "192.0.0.1:7003", "192.0.0.1:7004", "192.0.0.1:7005"));

//        executorRouteStrategyEnum.getRouter().route(param1, Lists.newArrayList("192.0.0.1:7001", "192.0.0.1:7002", "192.0.0.1:7003", "192.0.0.1:7004", "192.0.0.1:7005"));
//        executorRouteStrategyEnum.getRouter().route(param2, Lists.newArrayList("192.0.0.1:7001", "192.0.0.1:7002", "192.0.0.1:7003", "192.0.0.1:7004", "192.0.0.1:7005"));
    }
}
