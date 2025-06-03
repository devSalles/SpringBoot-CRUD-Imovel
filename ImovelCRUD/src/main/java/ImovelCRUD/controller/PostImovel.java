package ImovelCRUD.controller;

import ImovelCRUD.dto.ImovelDTO;
import ImovelCRUD.model.ImovelModel;
import ImovelCRUD.repository.ImovelRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/imovel")
public class PostImovel {

    @Autowired
    private ImovelRepository imovelRepository;

    @PostMapping("/adicionar")
    public ResponseEntity<Object> CriarImovel(@RequestBody @Valid ImovelDTO imovelDTO)
    {
        var imovel=new ImovelModel();
        BeanUtils.copyProperties(imovelDTO,imovel);
        this.imovelRepository.save(imovel);
        return ResponseEntity.status(HttpStatus.CREATED).body("Imovel adicionado");
    }
}
