package br.com.joathan.agenda.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import br.com.joathan.agenda.model.LocaisReservados;
import br.com.joathan.agenda.model.Local;

//@Configuration
public class LocaisReservadosRepositoryConfig extends RepositoryRestConfigurerAdapter {
/*    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(LocaisReservados.class);
        config.setResourceMappingForRepository(Local.class);
    }*/
}
