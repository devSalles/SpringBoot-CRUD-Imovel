package ImovelCRUD.repository;

import ImovelCRUD.ImovelCrudApplication;
import ImovelCRUD.model.ImovelModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImovelRepository extends JpaRepository<ImovelModel,Long> {
}
