package com.example.testers.BASE;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document("TEST_PAPER")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class TestPaper {

    @Id
    private String id;

    @Field("TEST_ID")
    private String testId;
    //문제지 ID

    @Field("TEST_SUB")
    private String testSub;
    //문제지 제목

    @Field("QUESTION_LIST")
    private List<TestQuestion> questionList;
    //문제 목록

    @Field("TEST_WRITER")
    private String testWriter;
    //문제 출제자 ID = SYS_USER.ID
}
