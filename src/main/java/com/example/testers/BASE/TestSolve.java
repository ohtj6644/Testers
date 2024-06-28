package com.example.testers.BASE;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("TEST_SOLVE")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class TestSolve {

    @Id
    private String id;

    @Field("TEST_ID")
    private String testId;
    //문제아이디 = TEST_PAPER.ID

    @Field("TEST_USER")
    private SysUser testUser;
    //응시자

    @Field("TEST_SCORE")
    private Integer testScore;
    //시험 점수

}
