package ImovelCRUD.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb__imovel")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ImovelModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private Double valor;

    @Column(nullable = false)
    private String diponibilidade;
}
