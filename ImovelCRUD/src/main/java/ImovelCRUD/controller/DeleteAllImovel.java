package ImovelCRUD.controller;

import ImovelCRUD.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imovel")
public class DeleteAllImovel {

    @Autowired
    private ImovelRepository imovelRepository;

    @DeleteMapping("/deletar")
    public ResponseEntity<Object> deletarTodos()
    {
        this.imovelRepository.deleteAll();
        return ResponseEntity.status(HttpStatus.OK).body("Todos os imoveis foram deletados");
    }
}
