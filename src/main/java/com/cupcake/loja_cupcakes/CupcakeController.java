
package com.cupcake.loja_cupcakes;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cupcakes")
public class CupcakeController {

    private final CupcakeRepository repository;

    public CupcakeController(CupcakeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Cupcake> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Cupcake cadastrar(@RequestBody Cupcake cupcake) {
        return repository.save(cupcake);
    }
}
