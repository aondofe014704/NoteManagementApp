package com.visual.status.notemanagementsystem.data.repositories;

import com.visual.status.notemanagementsystem.data.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<Note, String> {
}
