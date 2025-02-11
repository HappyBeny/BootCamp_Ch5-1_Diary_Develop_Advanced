package org.example.expert.domain.todo.dto.response;

import lombok.Getter;
import org.example.expert.domain.user.dto.response.UserResponseDto;

import java.time.LocalDateTime;

@Getter
public class TodoResponseDto {

    private final Long id;
    private final String title;
    private final String contents;
    private final String weather;
    private final UserResponseDto user;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;

    public TodoResponseDto(Long id, String title, String contents, String weather, UserResponseDto user, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.weather = weather;
        this.user = user;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
