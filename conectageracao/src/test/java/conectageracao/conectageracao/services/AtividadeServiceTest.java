package conectageracao.conectageracao.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import conectageracao.conectageracao.entities.Atividade;
import conectageracao.conectageracao.repositories.AtividadeRepositorio;

@ExtendWith(MockitoExtension.class)
public class AtividadeServiceTest {
    @Mock
    private AtividadeRepositorio atividadeRepositorio; // está sendo mockado
    @InjectMocks
    private AtividadeService atividadeService; // injetando o que esta sendo mockado dentro do atividadeService

    @Test
    public void listarTodas() {
        var atividade = new Atividade("manutenção", "manutenção de computadores", Set.of("manutenção", "informática"),
                "Porto Alegre - RS", "Presencial", LocalDate.now(), null);
        when(atividadeRepositorio.findAll()).thenReturn(List.of(atividade));

        var atividades = atividadeService.listarTodas();

        // assert
        assertEquals(1, atividades.size());
        assertEquals(atividade, atividades.get(0)); // verifica se a atividade é igual a atividade que esta no indice 0
    
    }
}