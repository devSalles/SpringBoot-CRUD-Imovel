package ImovelCRUD.controller;

import ImovelCRUD.model.ImovelModel;
import ImovelCRUD.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/imovel")
public class GetAllImovel {

    @Autowired
    private ImovelRepository imovelRepository;

    @GetMapping("/listar")
    public ResponseEntity<Object>ListarTodos()
    {
        List<ImovelModel>ImovelListar=this.imovelRepository.findAll();
        if(ImovelListar.isEmpty())
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Lista vazia");
        }
        return ResponseEntity.status(HttpStatus.OK).body(ImovelListar);
    }
}
