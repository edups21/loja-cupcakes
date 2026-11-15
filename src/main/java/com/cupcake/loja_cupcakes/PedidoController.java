
package com.cupcake.loja_cupcakes;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoRepository pedidoRepository;
    private final CupcakeRepository cupcakeRepository;

    public PedidoController(
            PedidoRepository pedidoRepository,
            CupcakeRepository cupcakeRepository) {

        this.pedidoRepository = pedidoRepository;
        this.cupcakeRepository = cupcakeRepository;
    }

    @GetMapping
    public List<Pedido> listar() {
        return pedidoRepository.findAll();
    }

    @PostMapping
    public Pedido cadastrar(@RequestBody Pedido pedido) {

        if (pedido.getNomeCliente() == null ||
            pedido.getNomeCliente().isBlank()) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "Informe o nome do cliente");
        }

        if (pedido.getQuantidade() == null ||
            pedido.getQuantidade() <= 0) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "Quantidade invalida");
        }

        Cupcake cupcake = cupcakeRepository
                .findById(pedido.getCupcakeId() == null
                        ? -1L : pedido.getCupcakeId())
                .orElseThrow(() ->
                    new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Cupcake nao encontrado"));

        if (cupcake.getPreco() == null ||
            cupcake.getPreco() < 0) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "Preco do cupcake invalido");
        }

        String pagamento = pedido.getFormaPagamento();

        if (pagamento == null ||
            !(pagamento.equalsIgnoreCase("PIX") ||
              pagamento.equalsIgnoreCase("CARTAO") ||
              pagamento.equalsIgnoreCase("DINHEIRO"))) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "Forma de pagamento invalida");
        }

        double total = Math.round(
                cupcake.getPreco() * pedido.getQuantidade() * 100.0
        ) / 100.0;

        pedido.setId(null);
        pedido.setValorTotal(total);
        pedido.setFormaPagamento(pagamento.toUpperCase());
        pedido.setStatus("RECEBIDO");

        return pedidoRepository.save(pedido);
    }
}
