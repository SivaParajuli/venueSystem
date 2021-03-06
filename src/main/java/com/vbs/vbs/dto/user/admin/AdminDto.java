package com.vbs.vbs.dto.user.admin;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AdminDto {
    private Integer id;
    private String name;
    private String email;
    private String password;
}
