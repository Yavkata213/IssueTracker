package me.yavor.issuetracker;

import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "me.yavor.issuetracker.data.entities")
@EnableJpaRepositories(basePackages = "me.yavor.issuetracker.data.repositories")
public class ProjectConfiguration {
}
