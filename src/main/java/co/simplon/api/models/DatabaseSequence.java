package co.simplon.api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "database_sequences")
public class DatabaseSequence {

	@Id
	private String id;
	private int seq;
}
