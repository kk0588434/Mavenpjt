package devops.business;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import devops.domain.Category;
import devops.persistence.CategoryDAO;

@BusinessController
public class CategoryBC extends DelegateCrud<Category, Long, CategoryDAO> {

	private static final long serialVersionUID = 1L;

}
