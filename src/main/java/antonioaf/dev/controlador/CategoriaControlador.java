package antonioaf.dev.controlador;

import antonioaf.dev.model.Categoria;
import antonioaf.dev.servicio.CategoriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CategoriaControlador {

    @Autowired
    private CategoriaServicio categoriaServicio;

    @GetMapping("/categorias/index")
    public String index(Model model){

        model.addAttribute("categorias",categoriaServicio.listarCategorias());

        return "categoria/index";
    }

    @GetMapping("/categorias/create")
    public String create(Model model){

        Categoria categoria = new Categoria();
        model.addAttribute("categoria",categoria);

        return "categoria/create";
    }

    @PostMapping("/categorias/store")
    public String store(@ModelAttribute("categoria") Categoria categoria){

        categoriaServicio.agregarCategoria(categoria);

        return "redirect:/categorias/index";
    }
    @GetMapping("/categorias/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("categoria",categoriaServicio.editarCategoria(id));
        return "categoria/edit";
    }
    @PostMapping("/categorias/update/{id}")
    public String update(@PathVariable Integer id, @ModelAttribute("categoria")Categoria categoria){

        Categoria c = new Categoria();
        c.setId(id);
        c.setNombre(categoria.getNombre());
        c.setDescripcion(categoria.getDescripcion());

        categoriaServicio.actualizarCategoria(c);
        return "redirect:/categorias/index";
    }

    @GetMapping("/categorias/delete/{id}")
    public String delete(@PathVariable Integer id){

        categoriaServicio.eliminarCategoria(id);

        return "redirect:/categorias/index";
    }
}
