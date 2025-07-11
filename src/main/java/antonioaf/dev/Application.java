package antonioaf.dev;

import antonioaf.dev.model.Categoria;
import antonioaf.dev.repositorio.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Categoria categoria = new Categoria("CALZADO","Categoria Calzado");
        //categoriaRepositorio.save(categoria);
    }
}
