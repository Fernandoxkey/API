package br.senac.crm.repositorios;

import br.senac.crm.entidades.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "contatos")
public interface ContatoRepositorio extends JpaRepository<Contato, Long> {

}
