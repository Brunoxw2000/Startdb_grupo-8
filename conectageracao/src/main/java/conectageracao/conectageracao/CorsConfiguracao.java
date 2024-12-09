package conectageracao.conectageracao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguracao {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Mapeia todos os endpoints
                        //.allowedOrigins("http://localhost:5173/") // URL do seu frontend React (porta
                        // 5173 é a padrão do
                        // Vite)
                        .allowedMethods("GET", "POST", "PUT", "DELETE"); // Métodos permitidos
            }
        };
    }
}