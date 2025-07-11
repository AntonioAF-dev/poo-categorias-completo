package antonioaf.dev.controlador;

import antonioaf.dev.model.Categoria;
import antonioaf.dev.servicio.CategoriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaServicio categoriaServicio;


    @GetMapping()
    public List<Categoria> index(){
        return categoriaServicio.listarCategorias();
    }

    @PostMapping()
    public Categoria store(@RequestBody Categoria categoria){return categoriaServicio.agregarCategoria(categoria);}

    @PutMapping("/{id}")
    public Categoria update(@PathVariable("id") Integer id, @RequestBody Categoria categoria){

        Categoria c = new Categoria();

        c.setId(id);
        c.setNombre(categoria.getNombre());
        c.setDescripcion(categoria.getDescripcion());

        return categoriaServicio.actualizarCategoria(c);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){categoriaServicio.eliminarCategoria(id);}
}
