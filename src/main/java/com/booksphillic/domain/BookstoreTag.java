package com.booksphillic.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class BookstoreTag {

    @Id @GeneratedValue
    @Column(name = "bookstore_tag_id")
    private Long id;

    private Long storeId;

    private Long tagId;

}
