/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ecuadorjug.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class JugController {

    @Autowired
    private JugRepository jugRepository;

    @RequestMapping("/jugs")
    public Iterable<Jug> getJugs() {
        return jugRepository.findAll();
    }

    @RequestMapping("/jugs/{id}")
    public Jug getJug(@PathVariable Long id) {
        return jugRepository.findOne(id);
    }
}
