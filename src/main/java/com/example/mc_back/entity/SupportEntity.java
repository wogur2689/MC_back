package com.example.mc_back.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name = "support_user_list")
public class SupportEntity extends TimeEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id; // 아이디

    @Column(name = "name", length = 10, nullable = false)
    private String name; // 이름

    @Column(name = "email", length = 100, nullable = false)
    private String email; //이메일

    @Column(name = "phone", length = 20, nullable = false)
    private String phone; //전화번호

    @Builder
    public SupportEntity(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
