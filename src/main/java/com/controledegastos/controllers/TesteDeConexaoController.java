package com.controledegastos.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin({"*"})
@RestController
@RequestMapping({"/teste"})
public class TesteDeConexaoController {

    @GetMapping({"/teste_de_conexao"})
    public ResponseEntity<Boolean> buscarTodasContas() {
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }

}
