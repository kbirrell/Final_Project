package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface ListItemRepository extends CrudRepository<ListItem, Long> {
}
