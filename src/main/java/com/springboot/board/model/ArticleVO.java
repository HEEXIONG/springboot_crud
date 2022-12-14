package com.springboot.board.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

// @SequenceGenetator : 시퀀스를 자동으로 생성해주는 JPA 애노테이션
@SequenceGenerator(
        name="IDX_SEQ_GEN",		// 시퀀스 생성기의 이름을 지정
        sequenceName="IDX_SEQ",	// 시퀀스의 이름을 지정 (IDX_SEQ)
        initialValue=1,			// 시퀀스의 초기값을 설정
        allocationSize=1		// 시퀀스의 증가량을 설정
        )
//JPA의 엔티티 설정
@Entity									
@Table(name = "SPRINGBOOT_CRUD") // 테이블의 이름을 설정 (SPRINGBOOT_CRUD)
@Getter // @Getter, @Setter : getter과 setter을 자동으로 만들어주는 Lombok 애노테이션 설정
@Setter									
public class ArticleVO {

	@Id	// PK 설정
	@GeneratedValue(strategy = GenerationType.SEQUENCE,	// 시퀀스 생성기를 통해 시퀀스를 만들고 ID에 자동으로 주입
					generator = "IDX_SEQ_GEN")
	@Column(name = "ARTICLE_ID")	// @Column : 컬럼의 이름을 설정 (ARTICLE_ID)
	private int id;
	
	@Column(name = "ARTICLE_TITLE")
	private String title;
	
	@Column(name = "ARTICLE_CONTENT")
	private String content;
	
}
