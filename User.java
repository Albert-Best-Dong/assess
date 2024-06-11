package com.dong.evaluate.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @TableId(value = "user_id",type = IdType.AUTO)
    private String userId;
    private String username;
    private String password;
    private String phoneNumber;
    private String emailAddress;
}
