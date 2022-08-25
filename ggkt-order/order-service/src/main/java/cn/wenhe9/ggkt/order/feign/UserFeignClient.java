package cn.wenhe9.ggkt.order.feign;

import cn.wenhe9.ggkt.user.api.UserInfoApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author DuJinliang
 * 2022/08/25
 */
@Component
@FeignClient(value = "ggkt-user", path = "/api/user/userInfo")
public interface UserFeignClient extends UserInfoApi {
}
