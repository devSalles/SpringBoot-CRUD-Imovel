package ImovelCRUD.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Locale;

@Entity
@Table(name = "tb__imovel")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ImovelModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 130)
    private String logradouro;

    @Column(nullable = false, name = "num_imovel",length = 10)
    private String numero;

    @Column(nullable = false,length = 60)
    private String bairro;

    @Column(nullable = false, name = "cep_imovel",length = 10)
    private String cep;

    @Column(nullable = false,length = 55)
    private String regiao;

    @Column(nullable = false,length = 120)
    private String cidade;

    @Column(nullable = false,length = 35)
    private String estado;

    @Column(length = 60)
    private String complemento;

    @Column(nullable = false,name = "tipo_imovel",length = 55)
    private String tipo;

    @Column(nullable = false,precision = 13,scale = 4)
    private Double valor;

    @Column(nullable = false,length = 25)
    private String diponibilidade;
}
