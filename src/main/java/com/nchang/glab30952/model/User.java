package com.nchang.glab30952.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    int id;
    String name;
    String email;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
