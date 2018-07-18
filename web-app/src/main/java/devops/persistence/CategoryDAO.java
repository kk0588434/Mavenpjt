package devops.persistence;

import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;
import devops.domain.Category;

@PersistenceController
public class CategoryDAO extends JPACrud<Category, Long> {

	private static final long serialVersionUID = 1L;

}
