package ImovelCRUD.controller;

import ImovelCRUD.model.ImovelModel;
import ImovelCRUD.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/imovel")
public class DeleteByIdImovel {

    @Autowired
    private ImovelRepository imovelRepository;

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Object> ListarID(@PathVariable Long id) {
        Optional<ImovelModel> imovelID = this.imovelRepository.findById(id);
        if (imovelID.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID não encontrado");
        }
        var imovelDel=imovelID.get();
        this.imovelRepository.delete(imovelDel);
        return ResponseEntity.status(HttpStatus.OK).body("Imóvel deletado");
    }
}
