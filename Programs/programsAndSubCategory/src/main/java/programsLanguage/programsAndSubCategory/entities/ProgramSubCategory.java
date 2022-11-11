package programsLanguage.programsAndSubCategory.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "programAltKategori")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProgramSubCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "programId")
	private int programId;
	@Column(name = "name")
	private String name;

}
