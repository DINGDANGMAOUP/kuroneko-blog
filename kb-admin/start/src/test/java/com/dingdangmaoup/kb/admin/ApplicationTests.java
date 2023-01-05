package com.dingdangmaoup.kb.admin;

import com.dingdangmaoup.kb.admin.infrastructure.service.KbUserService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

@SpringBootTest
class ApplicationTests {

	@SpyBean
	KbUserService kbUserService;
	@Test
	void contextLoads() {
		long count = kbUserService.count();
		System.out.println(count);
	}

}
