package com.example.bookmarkerapi.domain;

import org.springframework.stereotype.Component;

@Component
public class BookmarkMapper {

    public BookmarkDto toDto(Bookmark bookmark) {
        BookmarkDto bookmarkDto = new BookmarkDto();
        bookmarkDto.setId(bookmark.getId());
        bookmarkDto.setTitle(bookmark.getTitle());
        bookmarkDto.setUrl(bookmark.getUrl());
        bookmarkDto.setCreatedAt(bookmark.getCreatedAt());
        return bookmarkDto;
    }
}
