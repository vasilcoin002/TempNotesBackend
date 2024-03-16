package org.example.tempnotes.notes;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "notes")
public class Note {
    @Id
    private String id;
    private String title;
    private String description;
    private LocalDate destroyAtTime;

    public Note(String title, String description, LocalDate destroyAtTime) {
        this.title = title;
        this.description = description;
        this.destroyAtTime = destroyAtTime;
    }
}
