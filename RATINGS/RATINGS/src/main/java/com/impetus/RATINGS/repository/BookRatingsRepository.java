package com.impetus.RATINGS.repository;

import com.impetus.RATINGS.entity.BookRatingsEntity;
import com.impetus.RATINGS.model.BookRatings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRatingsRepository extends JpaRepository<BookRatingsEntity,Integer> {
}
