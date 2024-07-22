package com.example.card_payment;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsConfig {
    private static final KieServices kieServices = KieServices.Factory.get();

    @Bean
    public static KieContainer kieContainer() {
        return customKieContainer(new String[]{});
    }

    @Bean
    public static KieContainer orderKieContainer() {
        return customKieContainer(new String[]{"rules/OrderRules.drl"});
    }

    public static KieContainer customKieContainer(String[] ruleFilePaths) {
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        for (String movimientoUvaRule : ruleFilePaths) {
            kieFileSystem.write(ResourceFactory.newClassPathResource(movimientoUvaRule));
        }
        KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
        kb.buildAll();
        KieModule kieModule = kb.getKieModule();
        return kieServices.newKieContainer(kieModule.getReleaseId());
    }
}
