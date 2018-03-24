package com.alibaba.dubbo.demo;

import java.util.List;

/**
 * Created by HuangYibo on 2018/3/24.
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}
