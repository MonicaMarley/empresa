package edu.mintic.empresa.controladores;

import java.util.List;

//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.mintic.empresa.entidades.Empleado;
import edu.mintic.empresa.repositorio.EmpleadoRepository;

@RestController
public class EmpleadoController {
    
    private final EmpleadoRepository repository;

    EmpleadoController(EmpleadoRepository repository){
        this.repository = repository;
    }
    //obtener/leer recursos
    @GetMapping("/empleados")
    public List<Empleado> ListarEmpleados(){
        return repository.findAll();
    }
    //flata crear un getMapping solo con empleado hora 9:09
    //crear recursos
    @PostMapping("/empleado")
    public Empleado crearEmpleado(@RequestBody Empleado empleado){
        return repository.save(empleado);
    }
    //actualizar recurso
    @PutMapping("/empleado/{idEmpleado}")
    public Empleado actualizarEmpleado(@RequestBody Empleado empleado, @PathVariable long idEmpleado){
        Empleado empleadoViejo = repository.findById(idEmpleado).orElseThrow();
        empleadoViejo.setApellido(empleado.getApellido());
        empleadoViejo.setNombre(empleado.getNombre());
        empleadoViejo.setCargo(empleado.getCargo());
        empleadoViejo.setSalario(empleado.getSalario());
        return repository.save(empleadoViejo);
    }
    /*@PatchMapping("/empleado/{idEmpleado}")
    public Empleado actualizacionParcialEmpleado(@RequestBody Empleado empleado, @PathVariable long idEmpleado){
        repository
    }*/
    /*@DeleteMapping("/empleado/{idEmpleado}")
    public void elimiarEmpleado(@PathVariable long idEmpleado){
        repository.findAll();
    }*/


}
