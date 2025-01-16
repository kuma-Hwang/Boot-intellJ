package com.company.firstproject.dto;

import com.company.firstproject.entity.Article;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ArticleForm {
    private Long id;
    private String title;
    private String content;

    public Article toNoIdEntity() {
        return new Article(null, title, content);
    }

    public Article toEntity() {
        return new Article(id, title, content);
    }
}

