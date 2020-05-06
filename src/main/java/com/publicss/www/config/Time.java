package com.publicss.www.config;
import java.time.LocalDateTime;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.Getter;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Time {

    @CreationTimestamp
    // private Timestamp regdate;
    private LocalDateTime regdate;

    @UpdateTimestamp
    // private Timestamp updatedate;
    private LocalDateTime updatedate; // LocalDate

}