package com.study.full.stack.fullstack_project;

import com.study.full.stack.fullstack_project.dto.MembersDTO;
import com.study.full.stack.fullstack_project.service.MemberRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

//import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FullstackProjectApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@MockBean
	public MemberRepository memberRepository;




	@Test
	public void contextLoads() {
		MembersDTO membersDTO = new MembersDTO();
		String name = "1234";
		//assertThat(name).contains("1234");
		assertThat(name, is("1234"));
	}

}
