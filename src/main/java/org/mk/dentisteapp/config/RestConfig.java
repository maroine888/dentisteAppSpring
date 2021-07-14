package org.mk.dentisteapp.config;

import org.mk.dentisteapp.entities.Categorie;
import org.mk.dentisteapp.entities.Commentaire;
import org.mk.dentisteapp.entities.Jour;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;


@Component
public class RestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Categorie.class, Jour.class);
    }
}

