package com.example.testers.BASE;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("TEST_QUESTION")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class TestQuestion {

    @Id
    private String id;

    @Field("QUESTION_ID")
    private String questionId;
    //문제 ID

    @Field("QUESTION_SUB")
    private String questionSub;
    //문제 제목(지문)

    @Field("QUESTION_CORRECT")
    private String questionCorrect;
    //문제 정답

    @Field("QUESTION_Q1")
    private String questionQ1;
    // 문제 선택지 1

    @Field("QUESTION_Q2")
    private String questionQ2;
    // 문제 선택지 2

    @Field("QUESTION_Q3")
    private String questionQ3;
    // 문제 선택지 3

    @Field("QUESTION_Q4")
    private String questionQ4;
    // 문제 선택지 4

    @Field("QUESTION_ANS")
    private String questionAns;
    // 선택한 답 Answer
}
