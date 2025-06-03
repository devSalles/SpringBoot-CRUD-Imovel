package ImovelCRUD.controller;

import ImovelCRUD.model.ImovelModel;
import ImovelCRUD.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/imovel")
public class GetByIdImovel {

    @Autowired
    private ImovelRepository imovelRepository;

    @GetMapping("/listar/{id}")
    public ResponseEntity<Object> ListarID(@PathVariable Long id)
    {
        Optional<ImovelModel>imovelID=this.imovelRepository.findById(id);
        if(imovelID.isEmpty())
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID não encontrado");
        }
        var imovel=imovelID.get();
        return ResponseEntity.status(HttpStatus.OK).body(imovel);
    }
}
