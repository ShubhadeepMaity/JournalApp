package net.Shubhadeep.journalApp.entity;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import net.Shubhadeep.journalApp.enums.Sentiment;

@Document(collection = "journal_entries")
@NoArgsConstructor
@Data
public class JournalEntry {
	@Id
	private ObjectId id;
	
	private String title;
	private String content;
	private LocalDateTime date;
	private Sentiment sentiment;
	
}
