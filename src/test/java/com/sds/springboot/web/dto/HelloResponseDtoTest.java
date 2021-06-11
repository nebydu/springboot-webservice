package com.sds.springboot.web.dto;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class HelloResponseDtoTest {

	@Test
	public void  롬복테스트(){
		String name = "test";
		int mount = 1000;

		HelloResponseDto dto = new HelloResponseDto(name, mount);

		assertThat(dto.getName()).isEqualTo(name);
		assertThat(dto.getAmount()).isEqualTo(mount);
	}
}
