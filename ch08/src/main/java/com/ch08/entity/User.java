package com.ch08.entity;

import com.ch08.dto.UserDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.time.LocalDateTime;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {

    @Id
    private String uid;
    private String pass;
    private String name;
    private String birth;
    private String role;

    @CreationTimestamp
    private LocalDateTime rdate;

    public UserDTO toDTO(){
        return  UserDTO.builder()
                .uid(uid).pass(pass).name(name).birth(birth).role(role).build();
    }


}
