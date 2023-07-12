package com.zorzoarthur.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zorzoarthur.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}