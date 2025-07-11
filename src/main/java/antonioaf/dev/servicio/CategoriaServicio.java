package antonioaf.dev.servicio;

import antonioaf.dev.model.Categoria;
import antonioaf.dev.repositorio.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServicio implements InterfaceCategoriaServicio{


    @Autowired
    CategoriaRepositorio categoriaRepositorio;

    @Override
    public List<Categoria> listarCategorias() {
        return categoriaRepositorio.findAll();
    }

    @Override
    public Categoria agregarCategoria(Categoria categoria) {
        return categoriaRepositorio.save(categoria);
    }

    @Override
    public Categoria editarCategoria(Integer id) {
        return categoriaRepositorio.findById(id).get();
    }

    @Override
    public Categoria actualizarCategoria(Categoria categoria) {
        return categoriaRepositorio.save(categoria);
    }

    @Override
    public void eliminarCategoria(Integer id) {
        categoriaRepositorio.deleteById(id);
    }
}
