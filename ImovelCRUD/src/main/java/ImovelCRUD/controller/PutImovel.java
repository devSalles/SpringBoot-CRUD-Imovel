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
import java.util.Optional;

@RestController
@RequestMapping("/imovel")
public class PutImovel {

    @Autowired
    private ImovelRepository imovelRepository;

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Object> atualizarImovel(@PathVariable Long id, @RequestBody @Valid ImovelDTO imovelDTO)
    {
        Optional<ImovelModel>imovelID=this.imovelRepository.findById(id);
        if(imovelID.isEmpty())
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Lista vazia");
        }
        var imovel=imovelID.get();
        BeanUtils.copyProperties(imovelDTO,imovel);
        this.imovelRepository.save(imovel);
        return ResponseEntity.status(HttpStatus.OK).body("Imóvel atualizado");
    }
}
