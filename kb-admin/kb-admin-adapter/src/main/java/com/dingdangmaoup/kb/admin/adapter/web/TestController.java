package com.dingdangmaoup.kb.admin.adapter.web;

import com.alibaba.cola.domain.DomainFactory;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.SingleResponse;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

  @GetMapping
  public SingleResponse<String> test() {
    return SingleResponse.of("test");
  }
  @PostMapping
  public MultiResponse<String> test1() {
    return MultiResponse.of(List.of("test"));
  }
}
