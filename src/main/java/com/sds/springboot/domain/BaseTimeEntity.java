package com.sds.springboot.domain;

import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.Getter;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {
	@CreatedDate
	private LocalDateTime createdData;

	@LastModifiedDate
	private LocalDateTime modifiedDate;
}
