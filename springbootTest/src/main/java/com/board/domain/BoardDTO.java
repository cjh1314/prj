package com.board.domain;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
/**
	ALWAYS : 속성의 값에 의존하지 말고 항상 포함
	NON_EMPTY : null 또는 값이 빈 경우가 아니면 포함
	NON_NULL : null 이 아니면 포함
	NON_DEFAULT : bean의 기본생성자로 정의된 필드값과 다르게 변경된 필드만 포함
 */
public class BoardDTO {

	/** 번호 (PK) */
	private Long idx;

	/** 제목 */
	public String title;

	/** 내용 */
	public String content;

	/** 작성자 */
	private String writer;

	/** 조회 수 */
	private int viewCnt;

	/** 공지 여부 */
	private String noticeYn;

	/** 비밀 여부 */
	private String secretYn;

	/** 삭제 여부 */
	private String deleteYn;

	/** 등록일 */
	private String insertTime;

	/** 수정일 */
	private String updateTime;

	/** 삭제일 */
	private String deleteTime;

}