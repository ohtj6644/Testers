package com.example.testers.BASE;


import com.example.testers.Security.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


import java.time.LocalDateTime;
import java.util.List;


@Document("SYS_USER")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class SysUser {

    @Id
    private String id;

    @Field("USER_ID")
    private String userId;

    @Field("USER_PW")
    private String pw;

    @Field("USER_ROLE")
    private UserRole role=UserRole.USER;
    //회원 권한 (초기값 user 로 셋팅 )


}
